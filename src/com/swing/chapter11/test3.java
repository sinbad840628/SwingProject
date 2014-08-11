//这段程序代码主要是处理文本框的键盘事件处理
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.*;
public class test3 
{
 public static void main(String args[])    
{
    	JFrame f = new JFrame("JTextField3");
    	Container contentPane = f.getContentPane();
    	contentPane.setLayout(new BorderLayout());
    	JPanel p1 = new JPanel();        
    	p1.setLayout(new GridBagLayout());
    	GridBagConstraints gbc = new GridBagConstraints();
    	gbc.anchor = GridBagConstraints.WEST; //设定Layout的位置
    	gbc.insets = new Insets(2,2,2,2); //设定与边界的距离(上,左,下,右)
    	p1.setBorder(BorderFactory.createTitledBorder("学生的基本数据"));         
    	JLabel l1 = new JLabel("学生姓名：");        
    	JLabel l2 = new JLabel("学生性别：");        
    	JLabel l3 = new JLabel("学生身高：");        
    	JLabel l4 = new JLabel("学生体重：");   
//创建以JTextField3_FixedLengthDocument()对象，字符串为空，指定长度的文本域组件    
    	JTextField t1 = new JTextField(new JTextField3_FixedLengthDocument(10),"",10);
    	JTextField t2 = new JTextField(new JTextField3_FixedLengthDocument(1),"",1);
    	JTextField t3 = new JTextField(new JTextField3_FixedLengthDocument(5),"",5);        
    	JTextField t4 = new JTextField(new JTextField3_FixedLengthDocument(5),"",5);
///针对以上创建的组件以网格组布局方式进行布局
    	gbc.gridy=1;
    	gbc.gridx=0;
    	p1.add(l1,gbc);
    	gbc.gridx=1;
    	p1.add(t1,gbc);
    	gbc.gridy=2;
    	gbc.gridx=0;
    	p1.add(l2,gbc);
    	gbc.gridx=1;
    	p1.add(t2,gbc);
    	gbc.gridy=3;
    	gbc.gridx=0;        
     	p1.add(l3,gbc);
     	gbc.gridx=1;
    	p1.add(t3,gbc);
    	gbc.gridy=4;
    	gbc.gridx=0;        
    	p1.add(l4,gbc);
    	gbc.gridx=1;
    	p1.add(t4,gbc);        
    	contentPane.add(p1);        
    	f.pack();        
    	f.setVisible(true);        
    	f.addWindowListener(new WindowAdapter() {            
    		public void windowClosing(WindowEvent e) {                    
    			System.exit(0);            
    		}        
    	});    
    }

    	
    t1.addActionListener(new ActionListener()//处理键盘回车的动作事件
{
	      public void actionPerformed(ActionEvent Event)
	     {
		    t1.setText("");//当回车后，t1文本框会被清空
	     }
});
}
}
///创建JTextField3_FixedLengthDocument类，让它集成PlainDocument类
class JTextField3_FixedLengthDocument extends PlainDocument
{
//创建JTextField3_FixedLengthDocument类，让它集成PlainDocument类
	private int maxLength;

	public JTextField3_FixedLengthDocument(int maxLength) //在构造器方法中设置文本的最大长度
		this.maxLength = maxLength;
	}
///此方法是向文档中插入数据
	public void insertString(int offset,String str,AttributeSet att) throws BadLocationException
	{ //offset是插入数据的偏移量，str是插入的数据内容，att是插入的数据属性
		if ( getLength() + str.length() > maxLength )
{
			Toolkit.getDefaultToolkit().beep();
		}
else
{
			super.insertString(offset,str,att);
		}
	}

}
