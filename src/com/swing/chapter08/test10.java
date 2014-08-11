//这段程序代码是创建一个下拉列表框，然后通过选择下拉列表框中的数字，来改变字体的大小，
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class test10 implements ItemListener,ActionListener
{
  	String[] fontsize={"12","14","16","18","20","22","24","26","28"};
  	String defaultMessage="请选择或直接输入文字大小!";
  	Font font=null;
  	JComboBox combo=null;
  	JLabel label=null;
  	public test10()
{
  	  JFrame f=new JFrame("JComboBox");	
  	  Container contentPane=f.getContentPane();
  	  contentPane.setLayout(new GridLayout(2,1));
  	  label=new JLabel("Swing",JLabel.CENTER);
  	  font=new Font("SansSerif",Font.PLAIN,12);
  	  label.setFont(font);
  	  combo=new JComboBox(fontsize);
  	  combo.setBorder(BorderFactory.createTitledBorder("请选择你要的文字大小:"));
  	  combo.setEditable(true);
  	  ComboBoxEditor editor=combo.getEditor();
  	  combo.configureEditor(editor,defaultMessage);// 返回用于绘制和编辑 JComboBox 字段中所选项的编辑器
  	  combo.addItemListener(this);
  	  combo.addActionListener(this);
  	  
  	  contentPane.add(label);
  	  contentPane.add(combo);
       f.pack();
       f.show();
       f.addWindowListener(new WindowAdapter(){
    	  public void windowClosing(WindowEvent e){
    	  System.exit(0);	
    	}
      });   
  	}
   public static void main(String[] args)
{
   	 new test10();
   }
   public void actionPerformed(ActionEvent e)
{
   	  boolean isaddItem=true;
   	  int fontsize=0;
   	  String tmp=(String)combo.getSelectedItem();
   	  try{//判断用户所输入的项目是否有重复，若有重复则不增加到JComboBox中。
   	  	  fontsize=Integer.parseInt(tmp);
   	  	  for(int i=0;i<combo.getItemCount();i++){
   	  	  	  if (combo.getItemAt(i).equals(tmp)){
   	  	  	  	 isaddItem=false;
   	  	  	  	 break;
   	  	  	  }
   	  	  }
   	  	  if (isaddItem){
   	  	  	combo.insertItemAt(tmp,0);//插入项目tmp到0索引位置(第一列中).
   	  	  }
   	  	  font=new Font("SansSerif",Font.PLAIN,fontsize);
   	  	  label.setFont(font);   	  	  
   	  }catch(NumberFormatException ne){
   	  	  combo.getEditor().setItem("你输入的值不是整数值，请重新输入!");
   	  }
   }
   public void itemStateChanged(ItemEvent e) //ItemListener界面只有itemStateChanged()一个方法，在此实现它。
{
   	  if (e.getStateChange()==ItemEvent.SELECTED) //当用户的选择改变时，则在JLabel上会显示出Swing目前字形大小信息
{.
   	  	  int fontsize=0;
   	  	  try
{
   	  	  	 fontsize=Integer.parseInt((String)e.getItem());
   	  	  	 label.setText("Swing 目前字形大小:"+fontsize);   	  	  	 
   	  	  }
catch(NumberFormatException ne){//若所输入的值不是整数，则不作任何的操作.
   	  	  	
   	  	  }
   	  }
   }
}
