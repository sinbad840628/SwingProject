import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
public class test14 extends JPanel
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
    test14()
    {JFrame frame=new JFrame();
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

    	item1=new JCheckBoxMenuItem("�ò˵��������",��C��); 
    	item2=new JRadioButtonMenuItem("�ò˵���ָ�����",��R��);
    	item3=new JMenuItem("�˵���һ",'E');
    	item4=new JMenuItem("�˵����",'F');
    	item5=new JMenuItem("�˵�����",'G');
    	item6=new JMenuItem("�˵�����",'H');
    	item7=new JMenuItem("�˵�����",'I');
    	item8=new JMenuItem("�˵�����",'J');
    	

    	menu1.setMnemonic('O');
    	menu2.setMnemonic('T');
    	

    }
    public static void main(String[] args)
    {
    	new test14();
    }
}
