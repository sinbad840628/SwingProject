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
    	frame.setTitle("�˵����Գ���");
    	frame.setSize(WIDTH,HEIGHT);
    	frame.setVisible(true);
    	
    	JMenuBar menubar=new JMenuBar();
    	JMenu menu1=new JMenu("�˵�һ");
    	JMenu menu2=new JMenu("�˵���");
    	item1=new JCheckBoxMenuItem("�ò˵��������"); 
    	item2=new JRadioButtonMenuItem("�ò˵���ָ�����");
    	item3=new JMenuItem("�˵���һ");
    	item4=new JMenuItem("�˵����");
    	item5=new JMenuItem("�˵�����");
    	item6=new JMenuItem("�˵�����");
    	item7=new JMenuItem("�˵�����");
    	item8=new JMenuItem("�˵�����");
    	
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
                 item2.setSelected(false);//��ѡ��item1ʱ��item2Ӧ��û�б�ѡ��
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
                 item1.setSelected(false);//��ѡ����item2ʱ��item1Ӧ��û�б�ѡ��
             }
    	});
    }
    public static void main(String[] args)
    {
    	new test11();
    }
}
