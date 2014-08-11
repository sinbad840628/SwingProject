import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
public class test5 
{
	   static final int WIDTH=300;
    static final int HEIGHT=200;   
    public static void main(String[] args)
    {
    	JFrame jf=new JFrame("如何使用滑块");
    	jf.setSize(WIDTH,HEIGHT);
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     jf.setVisible(true);
	     JPanel contentPane=new JPanel( );
	     jf.setContentPane(contentPane);
	     contentPane.setLayout(new BorderLayout());
	     final JSlider s=new JSlider(0,100,0);//创建一个滑块对象
	     contentPane.add(s,"South");     
	     s.setMajorTickSpacing(20);//设置主刻度
	     s.setMinorTickSpacing(5);//设置次刻度
	     s.setPaintTicks(true);//让刻度显示出来
	     s.setSnapToTicks(true);//让滑块能够滑到附近整数刻度上
	     s.setPaintLabels(true);//让刻度数字显示出来
      final JLabel l=new JLabel("目前刻度："+s.getValue());;
      contentPane.add(l,"North");
///当拖动滑块时，产生的事件
      s.addChangeListener(new ChangeListener()
      {
	    	      public void stateChanged(ChangeEvent e)
	    	      {
///当滑动滑块时，就会将刻度数显示在标签上
	    	       	  if ((JSlider)e.getSource() == s)
	    	            l.setText("目前刻度："+s.getValue());
	    	      }
	    	 });    	    	         	    	        	    	    
}
}
