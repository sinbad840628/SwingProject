//��γ��������ҪΪ����չʾ��ν����ŵ������У���������������û�к��
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test3{
	public test3(){
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
		 f.getContentPane().add(table,BorderLayout.CENTER);//ʹ�õĽ����ֱ����ӵ��м�������
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
			 test3 b=new test3();
		 }
	 }
