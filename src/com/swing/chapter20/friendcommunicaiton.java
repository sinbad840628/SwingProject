import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class friendcommunication

{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JComboBox nameinput;
	String sql="select * from comfriend ";
	friendstore store=new friendstore();
	Connection con=store.getConnection(); 
	static JTextField homephonetext;
	static JTextField moteltext;
	static JLabel name;
	static JLabel title;
	static JButton closebutton;
	static JLabel title1;
	static JPanel pane;
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        pane.add(c,constraints);
    } 
	friendcommunication()
	{
		pane=new JPanel();
		 GridBagLayout lay=new GridBagLayout();
		 pane.setLayout(lay);
		 GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=6;
	      constraints.weighty=6;
	      nameinput=new JComboBox();
	      name=new JLabel("姓名");
	      title=new JLabel("家乡家庭电话号码");
	      title1=new JLabel("目前个人电话号码");
	      homephonetext=new JTextField(20);
	      moteltext=new JTextField(20);
	      closebutton=new JButton("关闭此窗口");
	      add(title,constraints,1,1,3,1);
	      add(homephonetext,constraints,1,2,3,1);
	      add(title1,constraints,1,3,3,1);
	      add(moteltext,constraints,1,4,3,1);
	      add(closebutton,constraints,2,5,3,1);
	      add(name,constraints,1,0,1,1);
	      add(nameinput,constraints,2,0,1,1);
	      Vector vec=store.getfriend(con,sql);
	        for(int i=0;i<vec.size();i++)
	        {     
	            friend one =(friend)vec.get(i);
	            String nameselect=one.getname();
	            nameinput.addItem(nameselect);
	        }
	        String namestring=(String)nameinput.getSelectedItem();
	        friend p=store.getobject(con,namestring);       
	        String inputtel=p.gettel();
	        String inputmotel=p.getphone();
	        homephonetext.setText(inputtel);
	        moteltext.setText(inputmotel);
///当单击下拉列表框中的姓名选项，会在文本框中显示出相应姓名的电话号码和手机号码信息
	        nameinput.addItemListener(new ItemListener ()
	        { 
	            public void itemStateChanged(ItemEvent e)
	            {
	            	String namestring=(String)nameinput.getSelectedItem();
	    	        friend p=store.getobject(con,namestring);       
	    	        String inputtel=p.gettel();
	    	        String inputmotel=p.getphone();
	    	        homephonetext.setText(inputtel);
	    	        moteltext.setText(inputmotel);
	            }			
	        });
	        closebutton.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent Event) 
	            {
	            	pane.setVisible(false);            	 
	            }
	        });
	        pane.setVisible(false);
	}
}
