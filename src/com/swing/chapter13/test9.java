//��γ��������Ҫ��Ϊ����չʾ��δ���һ�����������
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test9 extends JFrame 
{
	   private static final long serialVersionUID = 1L;
	   static final int WIDTH=600;
    static final int HEIGHT=300;
    public test9() 
    {
    	   super("���������Դ���");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
///����������ͨ��ť���
        JButton button1 = new JButton("ͼ��һ");
        JButton button2 = new JButton("ͼ���");
        JButton button3 = new JButton("ͼ����");
///����һ�����������ٽ����洴����������ͨ��ť�����ӵ���������
        JToolBar bar = new JToolBar();
        bar.add(button1);   
        bar.add(button2);        
        bar.add(button3);
        JTextArea edit = new JTextArea(8,40);//����һ���ı������
        JScrollPane scroller = new JScrollPane(edit);
        JPanel pane = new JPanel();
        BorderLayout bord = new BorderLayout();
        pane.setLayout(bord);
        pane.add("North",bar);
        pane.add("Center",scroller);
        setContentPane(pane);
        pack();
        setVisible(true);
      }
public static void main(String args[]) {
	new test9();
 }
}
