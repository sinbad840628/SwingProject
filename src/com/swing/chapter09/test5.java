import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
public class test5 
{
	   static final int WIDTH=300;
    static final int HEIGHT=200;   
    public static void main(String[] args)
    {
    	JFrame jf=new JFrame("���ʹ�û���");
    	jf.setSize(WIDTH,HEIGHT);
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     jf.setVisible(true);
	     JPanel contentPane=new JPanel( );
	     jf.setContentPane(contentPane);
	     contentPane.setLayout(new BorderLayout());
	     final JSlider s=new JSlider(0,100,0);//����һ���������
	     contentPane.add(s,"South");     
	     s.setMajorTickSpacing(20);//�������̶�
	     s.setMinorTickSpacing(5);//���ôο̶�
	     s.setPaintTicks(true);//�ÿ̶���ʾ����
	     s.setSnapToTicks(true);//�û����ܹ��������������̶���
	     s.setPaintLabels(true);//�ÿ̶�������ʾ����
      final JLabel l=new JLabel("Ŀǰ�̶ȣ�"+s.getValue());;
      contentPane.add(l,"North");
///���϶�����ʱ���������¼�
      s.addChangeListener(new ChangeListener()
      {
	    	      public void stateChanged(ChangeEvent e)
	    	      {
///����������ʱ���ͻὫ�̶�����ʾ�ڱ�ǩ��
	    	       	  if ((JSlider)e.getSource() == s)
	    	            l.setText("Ŀǰ�̶ȣ�"+s.getValue());
	    	      }
	    	 });    	    	         	    	        	    	    
}
}
