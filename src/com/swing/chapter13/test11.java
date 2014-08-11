import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class test11 
{
    static final int WIDTH=300;
    static final int HEIGHT=400;
    JCheckBoxMenuItem item1;
    JRadioButtonMenuItem item2;
    JMenuItem item3;
    JMenuItem item4;
    JMenuItem item5;
    JMenuItem item6;
    JMenuItem item7;
    JMenuItem item8;
    test11()
    {
    	JFrame frame=new JFrame();
    	frame.setTitle("菜单测试程序");
    	frame.setSize(WIDTH,HEIGHT);
    	frame.setVisible(true);
    	
    	JMenuBar menubar=new JMenuBar();
    	JMenu menu1=new JMenu("菜单一");
    	JMenu menu2=new JMenu("菜单二");
    	item1=new JCheckBoxMenuItem("让菜单项都不可用"); 
    	item2=new JRadioButtonMenuItem("让菜单项都恢复可用");
    	item3=new JMenuItem("菜单项一");
    	item4=new JMenuItem("菜单项二");
    	item5=new JMenuItem("菜单项三");
    	item6=new JMenuItem("菜单项四");
    	item7=new JMenuItem("菜单项五");
    	item8=new JMenuItem("菜单项六");
    	
    	menubar.add(menu1);
    	menubar.add(menu2);
    	menu1.add(item1);
    	menu1.add(item3);
    	menu1.add(item4);
    	menu1.add(item5);
    	menu2.add(item2);
    	menu2.add(item6);
    	menu2.add(item7);
    	menu2.add(item8);
    	frame.setJMenuBar(menubar);
    	
    	item1.addActionListener(new ActionListener()
    	{
    		 public void actionPerformed(ActionEvent Event) 
             {
                 item3.setEnabled(false);
                 item4.setEnabled(false);
                 item5.setEnabled(false);
                 item6.setEnabled(false);
                 item7.setEnabled(false);
                 item8.setEnabled(false);  
                 item2.setSelected(false);//当选择item1时，item2应该没有被选择
             }
    	});
    	item2.addActionListener(new ActionListener()
    	{
    		 public void actionPerformed(ActionEvent Event) 
             {
    			 item3.setEnabled(true);
                 item4.setEnabled(true);
                 item5.setEnabled(true);
                 item6.setEnabled(true);
                 item7.setEnabled(true);
                 item8.setEnabled(true);  
                 item1.setSelected(false);//当选择了item2时，item1应该没有被选择
             }
    	});
    }
    public static void main(String[] args)
    {
    	new test11();
    }
}
