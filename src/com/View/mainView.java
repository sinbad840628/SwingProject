package com.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.Control.mainControl;

public class mainView extends JFrame{
	private Mp3Panel mp3Panel;
	Mp3MenuBar mp3menubar;
	File  file;
	private BPMInputPanel bpmInputPanel;
	ButtonPanel buttonpanel;
	BeatView beatView;
	public boolean temp = true;
	mainControl control;
	int bmp=90;
	boolean played =false;

public mainView(mainControl control) {
	super();
	this.control=control;
	this.mp3menubar=new Mp3MenuBar();
	this.mp3Panel=new Mp3Panel();
	this.buttonpanel=new ButtonPanel();
	this.bpmInputPanel=new BPMInputPanel();
	this.setTitle("Music Player");
	this.setLayout(new GridLayout(3, 1));
	this.setLocation(550, 250);
	this.setResizable(false);
	this.setSize(500, 300);
	
	this.setJMenuBar(mp3menubar);
	this.add(mp3Panel);
	this.add(bpmInputPanel);
	this.add(buttonpanel);
	this.addWindowListener(new closeListener());
	this.setVisible(true);
}
public void updateTimeSlider(){
	this.mp3Panel.getTime_slider().go();
}

private class BeatView extends JFrame{
	
	private BeatBar beatbar;
	private JPanel Text;
	private JLabel beatText;
	public BeatView() {
		beatbar=new BeatBar();
		beatText=new JLabel("无文件", SwingConstants.CENTER);
		Text=new JPanel(new GridLayout(2,1));
		Text.add(beatbar);
		Text.add(beatText);
		setSize(200,100);
		setLocation(200,200);
	    setVisible(true);
	    this.add(Text);
	    addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setControl();
			    setVisible(false);
			}
		});
	}
	public void updateBeat(){
		beatbar.getThread().start();
	}
	public void setBpm(int bpm){
		beatText.setText("bpm is :"+bpm);
	}
	
}


private class Mp3Panel extends JPanel{
	
	private JLabel mp3Info;
	private Mp3JSlider time_slider;
	private Mp3Panel(){
		super();
		this.time_slider = new Mp3JSlider();
		this.mp3Info = new JLabel("                                                              " +
				"      音乐播放器");
		this.setLayout(new GridLayout(2, 1));
		this.add(this.mp3Info);
		this.add(this.time_slider);
	}
    public Mp3JSlider getJSlider(){
    	return time_slider;
    }
	
	private class Mp3JSlider extends JSlider{
		private TitledBorder border;
		private int value;
		private Mp3JSlider() {
			this.border = new TitledBorder("进度条");
			this.value = 0;
			this.border.setTitleColor(Color.black);
			this.setBorder(new CompoundBorder(new EmptyBorder(6, 10, 10, 10),
					border));
			this.setBackground(Color.white);
			this.setMajorTickSpacing(20);
			this.setPaintTicks(true);
			this.setMouseListener();
			this.setValue(0);
			this.setMaximum(100);

		}
		private void setMouseListener() {
			this.addMouseListener(new MouseAdapter() {
				public void mouseReleased(MouseEvent event) {
					double newtime = time_slider.getValue();
					System.out.println("拉动滑动条：newtime is " + getValue());
					if(null!=file){
						control.slider(getValue());
						value = (int) newtime;
						setValue(value);
					}
					else{
						System.out.println("no file");
					}
                    repaint();
				}
			});
		}
		public void go(){
			if(value < 100){
				this.setValue(++value);
				this.repaint();
			}
		}
	}
	public JLabel getMp3Info() {
		return mp3Info;
	}

	public Mp3JSlider getTime_slider() {
		return time_slider;
	}
	}



private class Mp3MenuBar extends JMenuBar {
	private JMenu menuFile, menuPlay, menuHelp, menuMonitor;
	private JMenuItem startMenuItem, stopMenuItem, openFileMenuItem,
			exitMenuItem, monitorMenuItem, aboutMenuItem;

	private Mp3MenuBar() {
		menuFile = new JMenu("文件");
		this.add(menuFile);

		openFileMenuItem = new JMenuItem("打开");
		exitMenuItem = new JMenuItem("退出");

		menuFile.add(openFileMenuItem);
		menuFile.addSeparator();
		menuFile.add(exitMenuItem);

		menuPlay = new JMenu("播放");
		this.add(menuPlay);

		startMenuItem = new JMenuItem("开始");
		stopMenuItem = new JMenuItem("结束");

		menuPlay.add(startMenuItem);
		menuPlay.addSeparator();
		menuPlay.add(stopMenuItem);

		menuMonitor = new JMenu("监测脉动");
		this.add(menuMonitor);

		monitorMenuItem = new JMenuItem("开始监测");
		menuMonitor.add(monitorMenuItem);

		

		this.setOpenActionListener();
		this.setExitActionListener();
		this.setStartActionListener();
		this.setStopActionListener();
		this.setMonitorActionListener();
	
	}
public void disControl(){
	openFileMenuItem.setEnabled(false);
	menuPlay.setEnabled(false);
	menuMonitor.setEnabled(false);
}
public void setControl(){
	openFileMenuItem.setEnabled(true);
	menuPlay.setEnabled(true);
	menuMonitor.setEnabled(true);
}
	private void setOpenActionListener() {
		openFileMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();// 创建文件选择对话框
				// 创建文件过滤对话框
				FileFilter filter = new FileNameExtensionFilter(
						"音频文件(*.mp3;*.wav*;*.wma*;*.wmv*)",new String[]{"mp3", "wav"});
				fileChooser.setFileFilter(filter);// 为文件选择对话框设置文件过滤器
				// 打开文件选择对话框
				int returnValue = fileChooser.showOpenDialog(null);
				if (returnValue == JFileChooser.APPROVE_OPTION) {
					file = fileChooser.getSelectedFile();
					String url = file.getAbsolutePath();
					control.initialize(file);
					mp3Panel.getMp3Info().setText(url);
					mp3Panel.getJSlider().setValue(0);
					System.out.println("选择的文件路径 ：  " + url);

				}
			}
		});
	}

	private void setExitActionListener() {
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				setVisible(false);
				System.exit(0);
			}
		});
	}

	private void setStartActionListener() {
		startMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(file!=null){
                played=true;
				control.start();
				System.out.println("开始播放");
				}
				else{
					System.out.println("no file ");
				}
			}

		});
	}

	private void setStopActionListener() {
		stopMenuItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(file!=null){
				played=false;
				control.stop();
				}
				System.out.println("停止播放");
			}
		});
	}

	private void setMonitorActionListener() {
		monitorMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("脉冲检测");
				if(file!=null&&beatView==null&&played){
				beatView=new BeatView();
				beatView.updateBeat();
				beatView.setBpm(getBpm());
				disControl();
				}
				else if(file==null){
					System.out.println("无文件");
				}
				else if(beatView!=null&&played){
					beatView.setVisible(true);
				}
				
				temp = false;
			}

		});
	}



	public JMenuItem getStartMenuItem() {
		return startMenuItem;
	}

	public JMenuItem getStopMenuItem() {
		return stopMenuItem;
	}

	public JMenuItem getOpenFileMenuItem() {
		return openFileMenuItem;
	}

	public JMenuItem getExitMenuItem() {
		return exitMenuItem;
	}

	public JMenuItem getMonitorMenuItem() {
		return monitorMenuItem;
	}

	public JMenuItem getAboutMenuItem() {
		return aboutMenuItem;
	}

}



private class BPMInputPanel extends JPanel {
	private JLabel bpmLabel;
	private JTextField bpmTextField;

	private BPMInputPanel() {
		this.bpmLabel = new JLabel("Enter BPM:",SwingConstants.CENTER);
		this.bpmTextField = new JTextField();
		this.setLayout(new GridLayout(2, 3));
		this.add(bpmLabel);
		this.add(bpmTextField);
		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());
	}

	public JTextField getBpmTextField() {
		return bpmTextField;
	}
	
	
}




private class ButtonPanel extends JPanel {
	
	private SetButton setButton;
	private UpButton upButton;
	private DownButton downButton;
	
	private ButtonPanel(){
		super();
		this.setButton = new SetButton();
		this.upButton = new UpButton();
		this.downButton = new DownButton();
		this.setLayout(new GridLayout(2,3));
		this.add(downButton);
		this.add(setButton);
		this.add(upButton);
		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());
	}
	
	private class SetButton extends JButton {

		private SetButton() {
			super();
			this.setLabel("设置脉冲");
			this.addActionListener(new ButtonListener());
		}

		private class ButtonListener implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				int data = IsNumber(bpmInputPanel.getBpmTextField().getText());
				System.out.println(data);
				if(data > 0&&file!=null){
					control.setBPM(data);
				   System.out.println("press set");
				}else{
					if(file==null){
						System.out.println("no file");
					}
					
				}
			}
		}
		
		private int IsNumber(String str) {
			Pattern pattern = Pattern.compile("[0-9]*");
			Matcher isNum = pattern.matcher(str);
			if (isNum.matches() && (str.length() != 0)) {
				int i = Integer.parseInt(str);
				return i;
			}
			return -1;
		}
	}

	private class UpButton extends JButton {

		private UpButton() {
			super();
			this.setLabel(">>");
			this.addActionListener(new ButtonListener());
		}

		private class ButtonListener implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				if(file!=null){
				control.increaseBPM();
				System.out.println("press >>");
				}
				else{
					System.out.println("no file");
				}
			}
		}
	}

	private class DownButton extends JButton {

		private DownButton() {
			super();
			this.setLabel("<<");
			this.addActionListener(new ButtonListener());
		}

		private class ButtonListener implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				if(null!=file){
					control.decreaseBPM();
					System.out.println("press <<");
				}
				else{
					System.out.println("no file");
				}

			}
		}
	}

}





public class closeListener extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		setVisible(false);
	}
}

public File getFile(){
	return file;
}
public void setBpm(int bpm){
	this.bmp=bpm;
	bpmInputPanel.getBpmTextField().setText(""+bpm);
	if(null!=beatView){
		beatView.setBpm(bpm);
		beatView.repaint();
	}
}
public void disControl(){
	buttonpanel.setEnabled(false);
	mp3menubar.disControl();
}
public void setControl(){
	mp3menubar.setControl();
}
public int getBpm(){
	return this.bmp;
}

}
	
	
