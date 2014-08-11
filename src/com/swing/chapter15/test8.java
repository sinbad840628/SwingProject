import java.util.Hashtable;

import javax.swing.*;
public class test8
{
	static final int WIDTH=300;
	static final int HEIGHT=800;
	test8()
	{
		JFrame frame=new JFrame();
		frame.setTitle("树组件测试窗口");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		
		String[] s1={"电视机","洗衣机","影碟机","空调","冰箱","微波炉"};	
	    String[] s2={"大衣柜","饭桌","床","书桌","书柜"};
	    String[] s3={"锅","汤勺","搅拌机","锅铲","菜刀"};
	    String[] s4={"电脑书","小说","课本","字典"};
	    Hashtable hashtable=new Hashtable();
	    hashtable.put("家用电器", s1);
	    hashtable.put("家具", s2);
	    hashtable.put("厨具", s3);
	    hashtable.put("书", s4);
	    JTree tree=new JTree(hashtable);
	    
	    JScrollPane scrollPane=new JScrollPane();
	    scrollPane.setViewportView(tree);
	    frame.getContentPane().add(scrollPane);
	    frame.pack();


	}
	public static void main(String[] args)
	{
		new test8();
	}
}
