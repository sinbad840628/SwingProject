//��γ��������Ҫ����һ���˵��Ķ����¼�����ķ�������ʵ���ķ����밴ť���һ����������ʵ���У��������˳����˵����ͻᵯ���Ի���ѯ���Ƿ�Ҫ�˳���
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test3  
{
private static final long serialVersionUID = 1L;
	   static final int WIDTH=600;
    static final int HEIGHT=300;
    JFrame f;
    public test3() 
    {
      f=new JFrame("���Դ���");
      JRootPane rp=new JRootPane();
      f.setContentPane(rp);
      f.setContentPane(rp);
      JMenuBar menubar1=new JMenuBar();
      rp.setJMenuBar(menubar1);
      JMenu menu1=new JMenu("�ļ�");
      JMenu menu2=new JMenu("�༭");
      JMenu menu3=new JMenu("��ͼ");
      JMenu menu4=new JMenu("����");
      JMenu menu5=new JMenu("����");
      JMenu menu6=new JMenu("����");
      menubar1.add(menu1);
      menubar1.add(menu2);
      menubar1.add(menu3);
      menubar1.add(menu4);
      menubar1.add(menu5);
      menubar1.add(menu6);
      JMenuItem item1=new JMenuItem("��");
      JMenuItem item2=new JMenuItem("����");
      JMenuItem item3=new JMenuItem("��ӡ");
      JMenuItem item4=new JMenuItem("�˳�");
      JMenuItem item5=new JMenuItem("����");
      JMenuItem item6=new JMenuItem("�滻");
      JMenuItem item7=new JMenuItem("����");
      JMenuItem item8=new JMenuItem("����");
      JMenuItem item9=new JMenuItem("չ��ͼ");
      JMenuItem item10=new JMenuItem("����ͼ");
      JMenuItem item11=new JMenuItem("��dos������");
      JMenuItem item12=new JMenuItem("��windows������");
      JMenuItem item13=new JMenuItem("��ͼ����");
      JMenuItem item14=new JMenuItem("�������й���");
      JMenuItem item15=new JMenuItem("�汾��Ϣ");
      JMenuItem item16=new JMenuItem("������Ϣ");
      menu1.add(item1);
      menu1.add(item2);
      menu1.addSeparator();
      menu1.add(item3);
      menu1.addSeparator();
      menu1.add(item4);
      menu2.add(item5);
      menu2.add(item6);
      menu2.addSeparator();
      menu2.add(item7);
      menu2.add(item8);
      menu3.add(item9);
      menu3.add(item10);
      menu4.add(item11);
      menu4.add(item12);
      menu5.add(item13);
      menu5.add(item14);
      menu6.add(item15);
      menu6.add(item16);
      f.setVisible(true);
      f.setSize(WIDTH,HEIGHT);
      Toolkit kit=Toolkit.getDefaultToolkit();
      Dimension screenSize=kit.getScreenSize();
      int width=screenSize.width;
      int height=screenSize.height;
      int x=(width-WIDTH)/2;
      int y=(height-HEIGHT)/2;
      f.setLocation(x,y);
///�����˳��˵���Ķ����¼�
      item4.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
        	int i=JOptionPane.showConfirmDialog(null,"�Ƿ������Ҫ�˳�ϵͳ","�˳�ȷ�϶Ի���", JOptionPane.YES_NO_CANCEL_OPTION); //ͨ���Ի����а�ť��ѡ��������������������ǵ������Ի���ť�е�yes��ťʱ����ô�����ڻ�ֱ����ʧ��
        	if(i==0)
        	{
        		f.dispose();
        	}
          }
      }
      );
    }
public static void main(String args[]) 
{
  new test2();
 }
}
