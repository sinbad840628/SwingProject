import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
public class test13 extends JPanel
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
    JPopupMenu pop;
    test12()
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

    	
    	   Container con=new Container();
           frame.setContentPane(con);
    	   pop=new JPopupMenu();
    	   pop.add(item1);
         pop.addSeparator();
         pop.add(item2);
         con.addMouseListener(new MouseAdapter()
         {
             public void mouseReleased(MouseEvent event) 
             {
           	if(event.isPopupTrigger())
           		pop.show(event.getComponent(),event.getX(),event.getY());
             }
         }
         );
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
    	new test13();
    }
}
