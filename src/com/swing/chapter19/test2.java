//��γ��������ҪΪ����չʾ���Ϊһ��ͼ�ν�����Ӹ��ֲ�ͬ�ĸ�ʽ
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class test2  
{
	private static final long serialVersionUID = 1L;
	�� static final int WIDTH=600;
    static final int HEIGHT=300;
    JPopupMenu pop;
    JMenuItem item2;
    JFrame f;
    JMenuItem item1;
    JPanel p;
    JTabbedPane tp;
    public test2() 
    {
///���ö��㴰�ڱ������ɫ
      f=new JFrame("<html><font color=red>�ǻ��֯����Ϣϵͳ</font></html>");
      JMenuBar menubar1=new JMenuBar();
      tp=new JTabbedPane();
      p=new JPanel();
      f.setJMenuBar(menubar1);
      BorderLayout bord = new BorderLayout();
      p.setLayout(bord);
      f.add(p);
      p.add("Center",tp);
      JMenu menu1=new JMenu("<html><font color=red>ְ����Ϣϵͳ</font></html>");
      JMenu menu2=new JMenu("<html><font color=red>�в�ɲ���Ϣϵͳ</font></html>");
      JMenu menu3=new JMenu("<html><font color=red>����ϵͳ</font></html>����ϵͳ");
      JMenu menu4=new JMenu("<html><font color=red>����ϵͳ��ѯϵͳ</font></html>");
      JMenu menu5=new JMenu("��½ϵͳ");
      JMenu menu6=new JMenu("����ϵͳ");
      menu1.setMnemonic('Z');
      menu2.setMnemonic('C');
      menu3.setMnemonic('G');
      menu4.setMnemonic('F');
      menu5.setMnemonic('D');
      menu6.setMnemonic('H');
      menubar1.add(menu1);
      menubar1.add(menu2);
      menubar1.add(menu3);
      menubar1.add(menu4);
      menubar1.add(menu5);
      menubar1.add(menu6);
      item1=new JMenuItem("ĥɰ�ֳ�ְ����Ϣ");
      item2=new JMenuItem("��ɴ�ֳ�ְ����Ϣ");
      JMenuItem item3=new JMenuItem("���²�ְ����Ϣ");
      JMenuItem item4=new JMenuItem("����ְ����Ϣ");
      JMenuItem item5=new JMenuItem("���Ͽ�ְ����Ϣ");
      JMenuItem item6=new JMenuItem("���ۿ�ְ����Ϣ");
      JMenuItem item7=new JMenuItem("��Ʒ����ְ����Ϣ");
      JMenuItem item8=new JMenuItem("�ֳ�������Ϣ");
      JMenuItem item9=new JMenuItem("���ž�����Ϣ");
      JMenuItem item10=new JMenuItem("ְ��������Ϣ");
      JMenuItem item11=new JMenuItem("�쵼������Ϣ");
      JMenuItem item12=new JMenuItem("����������ѯ");
      JMenuItem item13=new JMenuItem("���չ��Ų�ѯ");
      JMenuItem item14=new JMenuItem("��ӵ�½�û���");
      JMenuItem item15=new JMenuItem("�汾��Ϣ");
      JMenuItem item16=new JMenuItem("������Ϣ");
      item1.setAccelerator( KeyStroke.getKeyStroke('M', java.awt.Event.CTRL_MASK, false) );
      item2.setAccelerator( KeyStroke.getKeyStroke('F', java.awt.Event.CTRL_MASK, false) );
      item3.setAccelerator( KeyStroke.getKeyStroke('R', java.awt.Event.CTRL_MASK, false) );
      item4.setAccelerator( KeyStroke.getKeyStroke('C', java.awt.Event.CTRL_MASK, false) );
      menu1.add(item1);
      menu1.add(item2);
      menu1.addSeparator();
      menu1.add(item3);
      menu1.add(item4);
      menu1.add(item5);
      menu1.add(item6);
      menu1.add(item7);
      menu2.add(item8);
      menu2.add(item9);
      menu3.add(item10);
      menu3.add(item11);
      menu4.add(item12);
      menu4.add(item13);
      menu5.add(item14);
      menu6.add(item15);
      menu6.add(item16);
///����������ť�������������ť����ϵ��ı��ֱ����ó���ɫ
      JButton button1 = new JButton("<html><font color=blue>ĥɰ�ֳ�ְ����Ϣ</font></html>");
      JButton button2 = new JButton("<html><font color=blue>��ɴ�ֳ�ְ����Ϣ</font></html>");
      JButton button3 = new JButton("<html><font color=blue>���²�ְ����Ϣ</font></html>");
      JToolBar bar = new JToolBar();
      bar.add(button1);   
      bar.add(button2);        
      bar.add(button3);
      p.add("North",bar);
      f.setVisible(true);
      f.setSize(WIDTH,HEIGHT);
      Toolkit kit=Toolkit.getDefaultToolkit();
      Dimension screenSize=kit.getScreenSize();
      int width=screenSize.width;
      int height=screenSize.height;
      int x=(width-WIDTH)/2;
      int y=(height-HEIGHT)/2;
      f.setLocation(x,y);
      button1.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
        	       info con1=new info();
                 JPanel con2 = new JPanel ();
                 JPanel con3 = new JPanel ();
                 JPanel con4 = new JPanel ();
                 JPanel con5 = new JPanel ();
                 tp.addTab("con1", con1);
                 tp.setEnabledAt(0,true);
///����JTabbedPane����ϵ�ÿһҳ���ı���ɫΪ��ɫ
                 tp.setTitleAt(0,"<html><font color=green>һ������Ϣ</font></html>");
                 tp.addTab ("con2", con2);
                 tp.setEnabledAt (1, true);
                 tp.setTitleAt (1,"<html><font color=green>��������Ϣ</font></html>");
                 tp.addTab ("con3", con3);
                 tp.setEnabledAt (2, true);
                 tp.setTitleAt (2,"<html><font color=green>��������Ϣ</font></html>");
                 tp.addTab ("con4", con4);
                 tp.setEnabledAt(0,true);
                 tp.setTitleAt(3,"<html><font color=green>�ĳ�����Ϣ</font></html>");
                 tp.addTab ("con5", con5);
                 tp.setEnabledAt(4,true);
                 tp.setTitleAt(4,"<html><font color=green>�峵����Ϣ</font></html>");
                 tp.setPreferredSize (new Dimension (500,200));
                 tp.setTabPlacement (JTabbedPane.TOP);
                 tp.setTabLayoutPolicy (JTabbedPane.SCROLL_TAB_LAYOUT);
          }
      }
      );
public static void main(String args[]) 
{
  new test2();
 }
}
class info extends JPanel
{
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);
    }         
	info()
	{  
		GridBagLayout lay=new GridBagLayout();
		setLayout(lay);
///�����˸���ǩ�����ҽ�ÿ����ǩ���ı���ɫ���óɺ�ɫ
		  JLabel name=new JLabel("<html><font color=red>����</font></html>");
	      JLabel code=new JLabel("<html><font color=red>����</font></html>");
	      JLabel sexy=new JLabel("<html><font color=red>�Ա�</font></html>");
	      JLabel age=new JLabel("<html><font color=red>����</font></html>");
	      JLabel birthday=new JLabel("<html><font color=red>��������</font></html>");
	      JLabel address=new JLabel("<html><font color=red>��ͥ��ַ</font></html>");
	      JLabel cj=new JLabel("<html><font color=red>����</font></html>");
	      JLabel zw=new JLabel("<html><font color=red>ְλ</font></html>");       
		  final JTextField codeinput=new JTextField(10);
	      final JTextField nameinput=new JTextField(10);
	      final JTextField sexyinput=new JTextField(10);
	      final JTextField ageinput=new JTextField(10);
	      final JTextField birthdayinput=new JTextField(10);
	      final JTextField addressinput=new JTextField(10);
	      final  JTextField gradeinput=new JTextField(10);
	      final JTextField majorinput=new JTextField(10);
///���ñ�ǩ���ı���ɫΪ��ɫ
	      JLabel title=new JLabel("<html><font color=blue>������Ϣ</font></html>");
	      JButton additionbutton=new JButton("<html><font color=blue>���</font></html>");       
	      GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=4;
	      constraints.weighty=6;
		  add(title,constraints,0,0,4,1);                 //ʹ�������鲼����ӿؼ�
	      add(name,constraints,0,1,1,1);
	      add(code,constraints,0,2,1,1);
	      add(sexy,constraints,0,3,1,1);
	      add(age,constraints,0,4,1,1);
	      add(nameinput,constraints,1,1,1,1);
	      add(codeinput,constraints,1,2,1,1);
	      add(sexyinput,constraints,1,3,1,1);
	      add(ageinput,constraints,1,4,1,1);
	      add(birthday,constraints,2,1,1,1);
	      add(address,constraints,2,2,1,1);
	      add(cj,constraints,2,3,1,1);
	      add(zw,constraints,2,4,1,1);
	      add(birthdayinput,constraints,3,1,1,1);
	      add(addressinput,constraints,3,2,1,1);
	      add(gradeinput,constraints,3,3,1,1);
	      add(majorinput,constraints,3,4,1,1);
	      
	}
}
