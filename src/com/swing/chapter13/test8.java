//��γ�����Ҫ�Ǵ���һ���й�"�ǻ��֯����Ϣϵͳ"�Ĳ˵������Ҵ���һ��JTabbedPane��������й���Ϣ�������У���ѡ��˵��еĵ�һ��ʱ���ᵯ�����JTabbedPane�������ʾ����Ӧ����Ϣ
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class test8  
{
	private static final long serialVersionUID = 1L;
	   static final int WIDTH=600;
    static final int HEIGHT=300;
    JPopupMenu pop;
    JMenuItem item2;
    JFrame f;
    JMenuItem item1;
    JPanel p;
    JTabbedPane tp;
    public test8() 
    {
      f=new JFrame("�ǻ��֯����Ϣϵͳ");
      JMenuBar menubar1=new JMenuBar();
      tp=new JTabbedPane();
      p=new JPanel();
      f.setJMenuBar(menubar1);
      f.add(p);
      p.add(tp);
      JMenu menu1=new JMenu("ְ����Ϣϵͳ");
      JMenu menu2=new JMenu("�в�ɲ���Ϣϵͳ");
      JMenu menu3=new JMenu("����ϵͳ");
      JMenu menu4=new JMenu("��ѯϵͳ");
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
      f.setVisible(true);
      f.setSize(WIDTH,HEIGHT);
      Toolkit kit=Toolkit.getDefaultToolkit();
      Dimension screenSize=kit.getScreenSize();
      int width=screenSize.width;
      int height=screenSize.height;
      int x=(width-WIDTH)/2;
      int y=(height-HEIGHT)/2;
      f.setLocation(x,y);
      item1.addActionListener(new ActionListener()
      {//����˵���Ķ����¼����������˵���ʱ�������м���������ʾ��һ��JTabbedPane��������������У�����һЩ���кõ����
          public void actionPerformed(ActionEvent Event) 
          {
///info��һ�����������
           info con1=new info();
///�����Ǵ���һ��JTabbedPane���
           JPanel con2 = new JPanel ();
           JPanel con3 = new JPanel ();
           JPanel con4 = new JPanel ();
           JPanel con5 = new JPanel ();
           tp.addTab("con1", con1);
           tp.setEnabledAt(0,true);
           tp.setTitleAt(0,"һ������Ϣ");
           tp.addTab ("con2", con2);
           tp.setEnabledAt (1, true);
           tp.setTitleAt (1,"��������Ϣ");
           tp.addTab ("con3", con3);
           tp.setEnabledAt (2, true);
           tp.setTitleAt (2,"��������Ϣ");
           tp.addTab ("con4", con4);
           tp.setEnabledAt(0,true);
           tp.setTitleAt(3,"�ĳ�����Ϣ");
           tp.addTab ("con5", con5);
           tp.setEnabledAt(4,true);
           tp.setTitleAt(4,"�峵����Ϣ");
           tp.setPreferredSize (new Dimension (500,200));
           tp.setTabPlacement (JTabbedPane.TOP);
           tp.setTabLayoutPolicy (JTabbedPane.SCROLL_TAB_LAYOUT);
          }
      }
      );
      item4.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
        	int i=JOptionPane.showConfirmDialog(null,"�Ƿ������Ҫ�˳�ϵͳ","�˳�ȷ�϶Ի���", JOptionPane.YES_NO_CANCEL_OPTION);
        	if(i==0)
        	{
        		f.dispose();
        	}
          }
      }
      );
           menu1.addMenuListener(new MenuListener()
      {
    	  public void menuSelected(MenuEvent event)
    	  {
    		  item2.setEnabled(!item1.isSelected());
    	  }
    	  public void menuDeselected(MenuEvent event){}
    	  public void menuCanceled(MenuEvent event){}
      });
    }
public static void main(String args[]) 
{
  new test8();
 }
}
class info extends JPanel//����һ��������в�����
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
		  JLabel name=new JLabel("����");
	      JLabel code=new JLabel("����");
	      JLabel sexy=new JLabel("�Ա�");
	      JLabel age=new JLabel("����");
	      JLabel birthday=new JLabel("��������");
	      JLabel address=new JLabel("��ͥ��ַ");
	      JLabel cj=new JLabel("����");
	      JLabel zw=new JLabel("ְλ");       
		  final JTextField codeinput=new JTextField(10);
	      final JTextField nameinput=new JTextField(10);
	      final JTextField sexyinput=new JTextField(10);
	      final JTextField ageinput=new JTextField(10);
	      final JTextField birthdayinput=new JTextField(10);
	      final JTextField addressinput=new JTextField(10);
	      final  JTextField gradeinput=new JTextField(10);
	      final JTextField majorinput=new JTextField(10);
	      JLabel title=new JLabel("������Ϣ");
	      JButton additionbutton=new JButton("���");       
	      GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=4;
	      constraints.weighty=6;
		  add(title,constraints,0,0,4,1); //ʹ�������鲼����ӿؼ�
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
