//��γ��������Ҫ��Ϊ����չʾ���Ϊ���ָ����������Ӳ�ͬ�ı߿�
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class test5 extends JPanel
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH=600;
	 static final int HEIGHT=300;
	 public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
	    {
	        constraints.gridx=x;
	        constraints.gridy=y;
	        constraints.gridwidth=w;
	        constraints.gridheight=h;
	        add(c,constraints);
	    }       
	 public test5()
	 {
		   JFrame frame=new JFrame("�߿���Գ���");
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
		    frame.setContentPane(this);

		    Border b1=BorderFactory.createLineBorder(Color.red); //����ʮ�ֲ�ͬ�ı߿�ģʽ
		    Border b2=BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		    Border b3=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		    Border b4=BorderFactory.createRaisedBevelBorder();
		    Border b5=BorderFactory.createLoweredBevelBorder();
		    Border b6=BorderFactory.createTitledBorder("�߿����");
         Border b7=BorderFactory.createTitledBorder(b1,"�߿����");
         Border b8=BorderFactory.createTitledBorder(b3,"�߿����");
         Border b9=BorderFactory.createTitledBorder(b5,"�߿����");
         Border b10=BorderFactory.createCompoundBorder(b4,b5);
         JLabel lable1=new JLabel("��ťһ");
         JLabel lable2=new JLabel("��ť��");
         JLabel lable3=new JLabel("��ť��");
         JLabel lable4=new JLabel("��ť��");
         JLabel lable5=new JLabel("��ť��");
         JLabel lable6=new JLabel("��ť��");
         JLabel lable7=new JLabel("��ť��");
         JLabel lable8=new JLabel("��ť��");
         JLabel lable9=new JLabel("����");
         JTextField text1=new JTextField(10);
         JTextField text2=new JTextField(10);
         JTextField text3=new JTextField(10);
         JTextField text4=new JTextField(10);
         JTextField text5=new JTextField(10);
         JTextField text6=new JTextField(10);
         JTextField text7=new JTextField(10);
         JTextField text8=new JTextField(10);
         setBorder(b1);
         lable1.setBorder(b2);
         lable2.setBorder(b3);
         lable3.setBorder(b4);
         lable4.setBorder(b5);
         lable5.setBorder(b6);
         lable6.setBorder(b7);
         lable7.setBorder(b8);
         lable8.setBorder(b9);
         lable9.setBorder(b10);
         text1.setBorder(b2);
         text2.setBorder(b3);
         text3.setBorder(b4);
         text4.setBorder(b5);
         text5.setBorder(b6);
         text6.setBorder(b7);
         text7.setBorder(b8);
         text8.setBorder(b9);
         GridBagLayout lay=new GridBagLayout();
 	    setLayout(lay);
 	    GridBagConstraints constraints=new GridBagConstraints();
	        constraints.fill=GridBagConstraints.NONE;
	        constraints.weightx=4;
	        constraints.weighty=6;
		   add(lable9,constraints,0,0,4,1); 
	        add(lable1,constraints,0,1,1,1);
	        add(lable2,constraints,0,2,1,1);
	        add(lable3,constraints,0,3,1,1);
	        add(lable4,constraints,0,4,1,1);
	        add(lable5,constraints,1,1,1,1);
	        add(text1,constraints,1,2,1,1);
	        add(text2,constraints,1,3,1,1);
	        add(text3,constraints,1,4,1,1);
	        add(text4,constraints,2,1,1,1);
	        add(text5,constraints,2,2,1,1);
	        add(lable6,constraints,2,3,1,1);
	        add(lable7,constraints,2,4,1,1);
	        add(text6,constraints,3,1,1,1);
	        add(text7,constraints,3,2,1,1);
	        add(text8,constraints,3,3,1,1);
	        add(lable8,constraints,3,4,1,1);
	 }

	public static void main(String[] args)
	{
	    new test5();
 }
}
