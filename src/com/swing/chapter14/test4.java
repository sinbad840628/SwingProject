//��γ������Ϊ����չʾ��ν������ӵ������У�������Ӻ��
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test4
{
	public test4()
{
		 JFrame f=new JFrame();
		 Object[][] playerInfo={
				 {"����",new Integer(91),new Integer(100),new Integer(191),new Boolean(true)},
				 {"��ѩ��",new Integer(82),new Integer(69),new Integer(151),new Boolean(true)},
				 {"÷ͥ",new Integer(47),new Integer(57),new Integer(104),new Boolean(false)},
				 {"����",new Integer(61),new Integer(57),new Integer(118),new Boolean(false)},
				 {"���",new Integer(90),new Integer(87),new Integer(177),new Boolean(true)},
	};
		 String[] Names={"����","����","��ѧ","�ܷ�","����"};
		 JTable table=new JTable(playerInfo,Names);
		 table.setPreferredScrollableViewportSize(new Dimension(550,30));
		 f.getContentPane().add(table,BorderLayout.CENTER);
      f.getContentPane().add(table.getTableHeader(),BorderLayout.NORTH);//��ӱ��ĺ����
		 f.setTitle("�����Դ���");
		 f.pack();
		 f.setVisible(true);
		 f.addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e) {
				 System.exit(0);
			 }
		 });
	}
		 public static void main(String[] args){
			 test4 b=new test4();
		 }
	 }
