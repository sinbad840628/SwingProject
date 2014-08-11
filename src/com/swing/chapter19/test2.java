//这段程序代码主要为读者展示如何为一个图形界面添加各种不同的格式
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class test2  
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
    public test2() 
    {
///设置顶层窗口标题的颜色
      f=new JFrame("<html><font color=red>星火纺织厂信息系统</font></html>");
      JMenuBar menubar1=new JMenuBar();
      tp=new JTabbedPane();
      p=new JPanel();
      f.setJMenuBar(menubar1);
      BorderLayout bord = new BorderLayout();
      p.setLayout(bord);
      f.add(p);
      p.add("Center",tp);
      JMenu menu1=new JMenu("<html><font color=red>职工信息系统</font></html>");
      JMenu menu2=new JMenu("<html><font color=red>中层干部信息系统</font></html>");
      JMenu menu3=new JMenu("<html><font color=red>工资系统</font></html>工资系统");
      JMenu menu4=new JMenu("<html><font color=red>工资系统查询系统</font></html>");
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
///设置三个按钮组件，这三个按钮组件上的文本分别设置成蓝色
      JButton button1 = new JButton("<html><font color=blue>磨砂分厂职工信息</font></html>");
      JButton button2 = new JButton("<html><font color=blue>纺纱分厂职工信息</font></html>");
      JButton button3 = new JButton("<html><font color=blue>人事部职工信息</font></html>");
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
///设置JTabbedPane组件上的每一页的文本颜色为绿色
                 tp.setTitleAt(0,"<html><font color=green>一车间信息</font></html>");
                 tp.addTab ("con2", con2);
                 tp.setEnabledAt (1, true);
                 tp.setTitleAt (1,"<html><font color=green>二车间信息</font></html>");
                 tp.addTab ("con3", con3);
                 tp.setEnabledAt (2, true);
                 tp.setTitleAt (2,"<html><font color=green>三车间信息</font></html>");
                 tp.addTab ("con4", con4);
                 tp.setEnabledAt(0,true);
                 tp.setTitleAt(3,"<html><font color=green>四车间信息</font></html>");
                 tp.addTab ("con5", con5);
                 tp.setEnabledAt(4,true);
                 tp.setTitleAt(4,"<html><font color=green>五车间信息</font></html>");
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
///创建八个标签，并且将每个标签的文本颜色设置成红色
		  JLabel name=new JLabel("<html><font color=red>姓名</font></html>");
	      JLabel code=new JLabel("<html><font color=red>工号</font></html>");
	      JLabel sexy=new JLabel("<html><font color=red>性别</font></html>");
	      JLabel age=new JLabel("<html><font color=red>年龄</font></html>");
	      JLabel birthday=new JLabel("<html><font color=red>出生年月</font></html>");
	      JLabel address=new JLabel("<html><font color=red>家庭地址</font></html>");
	      JLabel cj=new JLabel("<html><font color=red>车间</font></html>");
	      JLabel zw=new JLabel("<html><font color=red>职位</font></html>");       
		  final JTextField codeinput=new JTextField(10);
	      final JTextField nameinput=new JTextField(10);
	      final JTextField sexyinput=new JTextField(10);
	      final JTextField ageinput=new JTextField(10);
	      final JTextField birthdayinput=new JTextField(10);
	      final JTextField addressinput=new JTextField(10);
	      final  JTextField gradeinput=new JTextField(10);
	      final JTextField majorinput=new JTextField(10);
///设置标签的文本颜色为蓝色
	      JLabel title=new JLabel("<html><font color=blue>基本信息</font></html>");
	      JButton additionbutton=new JButton("<html><font color=blue>添加</font></html>");       
	      GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=4;
	      constraints.weighty=6;
		  add(title,constraints,0,0,4,1);                 //使用网格组布局添加控件
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
