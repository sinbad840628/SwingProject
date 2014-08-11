//这段程序主要是创建一个有关"星火纺织厂信息系统"的菜单，并且创建一个JTabbedPane组件，将有关信息放在其中，当选择菜单中的第一项时，会弹出这个JTabbedPane组件，显示出相应的信息
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
      f=new JFrame("星火纺织厂信息系统");
      JMenuBar menubar1=new JMenuBar();
      tp=new JTabbedPane();
      p=new JPanel();
      f.setJMenuBar(menubar1);
      f.add(p);
      p.add(tp);
      JMenu menu1=new JMenu("职工信息系统");
      JMenu menu2=new JMenu("中层干部信息系统");
      JMenu menu3=new JMenu("工资系统");
      JMenu menu4=new JMenu("查询系统");
      JMenu menu5=new JMenu("登陆系统");
      JMenu menu6=new JMenu("帮助系统");
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
      item1=new JMenuItem("磨砂分厂职工信息");
      item2=new JMenuItem("纺纱分厂职工信息");
      JMenuItem item3=new JMenuItem("人事部职工信息");
      JMenuItem item4=new JMenuItem("财务部职工信息");
      JMenuItem item5=new JMenuItem("材料科职工信息");
      JMenuItem item6=new JMenuItem("销售科职工信息");
      JMenuItem item7=new JMenuItem("成品车间职工信息");
      JMenuItem item8=new JMenuItem("分厂厂长信息");
      JMenuItem item9=new JMenuItem("部门经理信息");
      JMenuItem item10=new JMenuItem("职工工资信息");
      JMenuItem item11=new JMenuItem("领导工资信息");
      JMenuItem item12=new JMenuItem("按照姓名查询");
      JMenuItem item13=new JMenuItem("按照工号查询");
      JMenuItem item14=new JMenuItem("添加登陆用户名");
      JMenuItem item15=new JMenuItem("版本信息");
      JMenuItem item16=new JMenuItem("帮助信息");
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
      {//处理菜单项的动作事件，当单击菜单项时，会在中间容器中显示出一个JTabbedPane组件，在这个组件中，会有一些排列好的组件
          public void actionPerformed(ActionEvent Event) 
          {
///info是一个组件排列类
           info con1=new info();
///下面是创建一个JTabbedPane组件
           JPanel con2 = new JPanel ();
           JPanel con3 = new JPanel ();
           JPanel con4 = new JPanel ();
           JPanel con5 = new JPanel ();
           tp.addTab("con1", con1);
           tp.setEnabledAt(0,true);
           tp.setTitleAt(0,"一车间信息");
           tp.addTab ("con2", con2);
           tp.setEnabledAt (1, true);
           tp.setTitleAt (1,"二车间信息");
           tp.addTab ("con3", con3);
           tp.setEnabledAt (2, true);
           tp.setTitleAt (2,"三车间信息");
           tp.addTab ("con4", con4);
           tp.setEnabledAt(0,true);
           tp.setTitleAt(3,"四车间信息");
           tp.addTab ("con5", con5);
           tp.setEnabledAt(4,true);
           tp.setTitleAt(4,"五车间信息");
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
        	int i=JOptionPane.showConfirmDialog(null,"是否真的需要退出系统","退出确认对话框", JOptionPane.YES_NO_CANCEL_OPTION);
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
class info extends JPanel//创建一个组件排列布局类
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
		  JLabel name=new JLabel("姓名");
	      JLabel code=new JLabel("工号");
	      JLabel sexy=new JLabel("性别");
	      JLabel age=new JLabel("年龄");
	      JLabel birthday=new JLabel("出生年月");
	      JLabel address=new JLabel("家庭地址");
	      JLabel cj=new JLabel("车间");
	      JLabel zw=new JLabel("职位");       
		  final JTextField codeinput=new JTextField(10);
	      final JTextField nameinput=new JTextField(10);
	      final JTextField sexyinput=new JTextField(10);
	      final JTextField ageinput=new JTextField(10);
	      final JTextField birthdayinput=new JTextField(10);
	      final JTextField addressinput=new JTextField(10);
	      final  JTextField gradeinput=new JTextField(10);
	      final JTextField majorinput=new JTextField(10);
	      JLabel title=new JLabel("基本信息");
	      JButton additionbutton=new JButton("添加");       
	      GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=4;
	      constraints.weighty=6;
		  add(title,constraints,0,0,4,1); //使用网格组布局添加控件
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
