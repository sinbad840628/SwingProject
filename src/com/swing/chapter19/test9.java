//��γ��������Ҫ��Ϊ����չʾ���Ϊ���ָ��Ĭ�Ͻ���
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test9  
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=600;
	static final int HEIGHT=300;
	static JButton button;
 public test9() 
 {
    	  JFrame frame=new JFrame("������Գ���");
    	  JPanel pane=new JPanel();
		  frame.setContentPane(pane);
		  button=new JButton("���԰�ť");
		  pane.add(button);
		  Toolkit kit=Toolkit.getDefaultToolkit();
		  Dimension screenSize=kit.getScreenSize();
		  int width=screenSize.width;
		  int height=screenSize.height;
		  int x=(width-WIDTH)/2;
		  int y=(height-HEIGHT)/2;
		  frame.setLocation(x,y);
	      frame.setSize(WIDTH, HEIGHT);
		  frame.setVisible(true);
		  frame.pack();
		  
		  frame.addWindowListener(new WindowAdapter()
		  {
			  public void windowActivated(WindowEvent e)
			  {
				  button.requestFocusInWindow();//�ð�ť����ڴ��ڱ�����ʱ��������ö�������
			  }
		  });
    }
public static void main(String args[]) 
{
  new test9();
 }
}
