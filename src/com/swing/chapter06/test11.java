//��γ��������Ҫ�Ǵ���һ��JRootPane��壬Ȼ��������������Ӳ˵�
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test11 extends JFrame 
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=600;
    static final int HEIGHT=300;
    public test11() 
    {
     super("���Դ���");//���ö��������ı��⣬���ҽ�rootPane����Ϊ�������ڶ��������ϵ����
     JRootPane rp=new JRootPane();
     super.setContentPane(rp);
      JMenuBar menubar1=new JMenuBar();//����һ���˵������ҽ��˵���ӵ�rootPane �С�
      rp.setJMenuBar(menubar1);
      JMenu menu1=new JMenu("�ļ�");
      JMenu menu2=new JMenu("�༭"); //�����˵���
      JMenu menu3=new JMenu("��ͼ");
      JMenu menu4=new JMenu("����");
      menubar1.add(menu1);
      menubar1.add(menu2);
      menubar1.add(menu3);
      JMenuItem item1=new JMenuItem("��");
      JMenuItem item2=new JMenuItem("����");
      JMenuItem item3=new JMenuItem("��ӡ");
      JMenuItem item4=new JMenuItem("�˳�");
      menu1.add(item1);
      menu1.add(item2);
      menu1.addSeparator();
      menu1.add(item3);
      menu1.addSeparator();
      menu1.add(item4);
      this.setVisible(true);
      }
public static void main(String args[]) {
  new test11();
 }
}
