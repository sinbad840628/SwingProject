import java.util.Hashtable;

import javax.swing.*;
public class test8
{
	static final int WIDTH=300;
	static final int HEIGHT=800;
	test8()
	{
		JFrame frame=new JFrame();
		frame.setTitle("��������Դ���");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		
		String[] s1={"���ӻ�","ϴ�»�","Ӱ����","�յ�","����","΢��¯"};	
	    String[] s2={"���¹�","����","��","����","���"};
	    String[] s3={"��","����","�����","����","�˵�"};
	    String[] s4={"������","С˵","�α�","�ֵ�"};
	    Hashtable hashtable=new Hashtable();
	    hashtable.put("���õ���", s1);
	    hashtable.put("�Ҿ�", s2);
	    hashtable.put("����", s3);
	    hashtable.put("��", s4);
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
