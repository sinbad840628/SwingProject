import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class test6 implements ActionListener,ChangeListener
{
    JFrame f = null;
    JProgressBar progressbar;
    JLabel label;
    Timer timer;
    JButton b1;
    JButton b2;
    public test6()                           
    {
        
        b1=new JButton("开始");
        b2=new JButton("停止");
        b1.addActionListener(this);//为按钮添加动作事件
        b2.addActionListener(this);
        panel.add(b1);
        panel.add(b2);
        timer = new Timer(50,this);//创建一个事件组件对象
        f = new JFrame("progressbar Example");
        Container contentPane = f.getContentPane();
        label = new JLabel(" ",JLabel.CENTER);
        progressbar = new JProgressBar();//创建一个进度条
        progressbar.setOrientation(JProgressBar.HORIZONTAL);//设置其方向为水平方向
        progressbar.setMinimum(0);//最小刻度0
        progressbar.setMaximum(100);//最大刻度100
        progressbar.setValue(0);
        progressbar.setStringPainted(true);
        progressbar.addChangeListener(this);//添加进度条变化事件
        progressbar.setPreferredSize(new Dimension(200,30));
        JPanel panel = new JPanel();
        b = new JButton("Start");
        b.addActionListener(this);//为按钮添加动作事件
        panel.add(b);
        timer = new Timer(50,this);//创建一个事件组件对象
        contentPane.add(panel,BorderLayout.NORTH);
        contentPane.add(progressbar,BorderLayout.CENTER);
        contentPane.add(label,BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        });
    }
    public static void main(String[] args)
    {
        new test6();
    }
    public void actionPerformed(ActionEvent e)
    {
///当单击按钮，则计时开始
        if(e.getSource() == b1)
        {
            timer.start();
        }
        if(e.getSource() == b2)
        {
            timer.stop();
        }
///当单击事件组件，则进度条开始变化
        if(e.getSource() == timer)
        {
            int value = progressbar.getValue();
            if( value < 100)
            {
                value++;//进度条往前运动
                progressbar.setValue(value);
            }
            else
            {
                timer.stop();
                progressbar.setValue(0);
            }
        }
    }
    public void stateChanged(ChangeEvent e1)
    {
        int value = progressbar.getValue();
        ///当进度条运行时，就将其进度显示在标签中
        if(e1.getSource() == progressbar)
        {
            label.setText("目前已完成进度："+Integer.toString(value)+" %"); 
        }

    }
}
