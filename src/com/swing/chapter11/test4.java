//��γ��������Ҫ�Ǵ���һ����¼���ڣ�Ψһ�����µ�һ��ʵ����ͬ�������ｫԭ������������ı������������ı������
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
///����һ����¼�ࡣ��Ƴ�һ���̳��������ࡣ
class login extends JPanel
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=300;
    static final int HEIGHT=150;
    JFrame loginframe;

    public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
       constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);

}                                        ///����һ������������
    login()
    {
       ����������������.//�뱾�ڵ�һ������ͬλ��������ͬ
        final JPasswordField passwordinput=new JPasswordField(8);//����һ��JPasswordField����
        ����������������.//�뱾�ڵ�һ������ͬλ��������ͬ
}
 class windowsclose extends JPanel
 {
	 JFrame jf;
 
	 windowsclose()
	 {
		   jf=new JFrame("ȷ�ϴ���");
		   jf.setVisible(true);
		   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   jf.setContentPane(this);
		   JLabel l=new JLabel("���Ҫ������½��");
		   JLabel l2=new JLabel();
		   JButton b1=new JButton("��");
		   JButton b2=new JButton("��");
		   GridBagConstraints constraints1=new GridBagConstraints();
	        constraints1.fill=GridBagConstraints.NONE;
	        constraints1.anchor=GridBagConstraints.EAST;
	        constraints1.weightx=3;
	        constraints1.weighty=3;
	        GridBagLayout layout=new GridBagLayout();
	        setLayout(layout);
	        add(l,constraints1,1,0,1,1);                 //ʹ�������鲼��������
	        add(b1,constraints1,0,1,1,1);
	        add(b2,constraints1,2,1,1,1);
	        add(l2,constraints1,1,1,1,1);
	        jf.pack();
	        b1.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent Event) 
	            {
	               jf.dispose();
	            }
	    });
	     b2.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent Event) 
	            {
	               jf.dispose();	               
	            }
	    });
	 }
	 public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
	    {
	        constraints.gridx=x;
	        constraints.gridy=y;
	        constraints.gridwidth=w;
	        constraints.gridheight=h;
	        add(c,constraints);
	   }           
 }
public class test
{
    public static void main(String[] args)
    {
        login log=new login();
    }
}
