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
      f=new JFrame("�ǻ��֯����Ϣϵͳ");
      ������������������.//����Ĵ���������ǰ���½��е�ʵ���Ӻڲ���������ͬ

      buttonAction buttonaction=new buttonAction("ĥɰ�ֳ�ְ����Ϣ");//������ť���������ö�����buttonaction��menuaction
      button1.setAction(buttonaction);
      menuAction menuaction=new menuAction("�˳�");
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
		��������������������������//��ǰ���½�����ͬʵ���еļӺڲ���������ͬ
	      
	}
}
///����һ���࣬�̳�AbstractAction�ִ࣬�ж����¼�
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
		  ��������������������������//��ǰ���½�����ͬʵ���еļӺڲ���������ͬ
		
	}
}
///����һ���࣬�̳�AbstractAction�ִ࣬�ж����¼�
class menuAction extends AbstractAction
{
	public menuAction(String text)
	{
		super(text);
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		int i=JOptionPane.showConfirmDialog(null,"�Ƿ������Ҫ�˳�ϵͳ","�˳�ȷ�϶Ի���", JOptionPane.YES_NO_CANCEL_OPTION);
    	if(i==0)
    	{
    		test.f.dispose();
    	}
		
	}
}
