//��γ��������Ҫ�Ǵ����ı���ļ����¼�����
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
    	gbc.anchor = GridBagConstraints.WEST; //�趨Layout��λ��
    	gbc.insets = new Insets(2,2,2,2); //�趨��߽�ľ���(��,��,��,��)
    	p1.setBorder(BorderFactory.createTitledBorder("ѧ���Ļ�������"));         
    	JLabel l1 = new JLabel("ѧ��������");        
    	JLabel l2 = new JLabel("ѧ���Ա�");        
    	JLabel l3 = new JLabel("ѧ����ߣ�");        
    	JLabel l4 = new JLabel("ѧ�����أ�");   
//������JTextField3_FixedLengthDocument()�����ַ���Ϊ�գ�ָ�����ȵ��ı������    
    	JTextField t1 = new JTextField(new JTextField3_FixedLengthDocument(10),"",10);
    	JTextField t2 = new JTextField(new JTextField3_FixedLengthDocument(1),"",1);
    	JTextField t3 = new JTextField(new JTextField3_FixedLengthDocument(5),"",5);        
    	JTextField t4 = new JTextField(new JTextField3_FixedLengthDocument(5),"",5);
///������ϴ���������������鲼�ַ�ʽ���в���
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

    	
    t1.addActionListener(new ActionListener()//������̻س��Ķ����¼�
{
	      public void actionPerformed(ActionEvent Event)
	     {
		    t1.setText("");//���س���t1�ı���ᱻ���
	     }
});
}
}
///����JTextField3_FixedLengthDocument�࣬��������PlainDocument��
class JTextField3_FixedLengthDocument extends PlainDocument
{
//����JTextField3_FixedLengthDocument�࣬��������PlainDocument��
	private int maxLength;

	public JTextField3_FixedLengthDocument(int maxLength) //�ڹ����������������ı�����󳤶�
		this.maxLength = maxLength;
	}
///�˷��������ĵ��в�������
	public void insertString(int offset,String str,AttributeSet att) throws BadLocationException
	{ //offset�ǲ������ݵ�ƫ������str�ǲ�����������ݣ�att�ǲ������������
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
