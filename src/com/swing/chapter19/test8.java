import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Download by http://www.codefans.net
import javax.swing.event.*;
public class test8  
{
	   private static final long serialVersionUID = 1L;
	   static final int WIDTH=600;
    static final int HEIGHT=300;
    JPopupMenu pop;
    JMenuItem item2;
    static JFrame f;
    JMenuItem item1;
    JPanel p;
    static JTabbedPane tp;
    public test8() 
    {
      f=new JFrame("星火纺织厂信息系统");
      ……………………….//后面的代码内容与前面章节中的实例加黑部分内容相同

      buttonAction buttonaction=new buttonAction("磨砂分厂职工信息");//创建按钮，并且引用动作类buttonaction和menuaction
      button1.setAction(buttonaction);
      menuAction menuaction=new menuAction("退出");
      item4.setAction(menuaction);
    }
public static void main(String args[]) 
{
  new test8();
 }
}
class info extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		…………………………………//与前面章节中相同实例中的加黑部分内容相同
	      
	}
}
///创建一个类，继承AbstractAction类，执行动作事件
class buttonAction extends AbstractAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public buttonAction(String text)
	{
		  super(text);
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		  …………………………………//与前面章节中相同实例中的加黑部分内容相同
		
	}
}
///创建一个类，继承AbstractAction类，执行动作事件
class menuAction extends AbstractAction
{
	public menuAction(String text)
	{
		super(text);
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		int i=JOptionPane.showConfirmDialog(null,"是否真的需要退出系统","退出确认对话框", JOptionPane.YES_NO_CANCEL_OPTION);
    	if(i==0)
    	{
    		test.f.dispose();
    	}
		
	}
}
