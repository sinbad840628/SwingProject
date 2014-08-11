//这段程序代码主要是向读者展示如何打印文本组件
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.*;
public class test11  extends JPanel
{
	static JTextArea text;
	test11()
	{
	    JFrame frame=new JFrame("打印测试程序");
	    frame.setContentPane(this);
	    frame.setVisible(true);
	    text=new JTextArea(10,10);
	    JButton button=new JButton("打印文档");
	    setLayout(new FlowLayout());
	    add(text);
	    add(button);
	    button.addActionListener(new ActionListener()
	    {
	    	 public void actionPerformed(ActionEvent Event)
	    	  {
	    		 try
	    		 {
	    		 text.print();//调用文本的打印方法
	    	  }
	    		 catch(Exception e){}
	    	  }
	    	 
	    });
	}
    public static void main(String args[])    
    {
      new test11();
    }
}
