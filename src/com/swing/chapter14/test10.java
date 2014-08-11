//这段程序代码主要是为读者展示如何创建选择器，和使用选择器来以不同的方式选择表格中的单元格
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class test10 implements ActionListener,ListSelectionListener
{
   JTable table=null;
   ListSelectionModel selectionMode=null;
   JLabel label=null;//显示用户选取表格之用
   public test10()
{
   	   JFrame f=new JFrame();
  	   Object[][] p = {
   			 {"王鹏","91","100","191"},
   			 {"朱雪莲","82","100","182"},
   			 {"梅庭","47","100","147"},
   			 {"赵龙","61","100","161"},
   			 {"李兵","90","100","190"},
       };
       String[] n = {"姓名","语文","数学","总分"};    
   	   table=new JTable(p,n);
   	   table.setPreferredScrollableViewportSize(new Dimension(400,80));
   	   table.setCellSelectionEnabled(true);//使得表格的选取是以cell为单位,而不是以列为单位.若你没有写此行,则在选取表格数据时以整列为单位.
   	   selectionMode=table.getSelectionModel();//取得table的ListSelectionModel.
   	   selectionMode.addListSelectionListener(this);
   	   JScrollPane s=new JScrollPane(table);
   	   JPanel panel=new JPanel();
   	   JButton b=new JButton("单一选择");
   	   panel.add(b);
   	   b.addActionListener(this);
   	   b=new JButton("连续区间选择");
   	   panel.add(b);
   	   b.addActionListener(this);
   	   b=new JButton("多重选择");   	   
   	   panel.add(b);
   	   b.addActionListener(this);
   	   label=new JLabel("你选取的数据是:");
   	   Container contentPane=f.getContentPane();
   	   contentPane.add(panel,BorderLayout.NORTH);
   	   contentPane.add(s,BorderLayout.CENTER);
   	   contentPane.add(label,BorderLayout.SOUTH);
   	   f.setTitle("选择器的测试实例");
   	   f.pack();
   	   f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });   	   
   }
      public void actionPerformed(ActionEvent e){ /*处理按钮事件,利用ListSelectionModel界面所定义的setSelectionMode()方法来设置表格选取模式.*/
   	  if (e.getActionCommand().equals("单一选择"))
   	     selectionMode.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   	  if (e.getActionCommand().equals("连续区间选择"))
   	     selectionMode.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
   	  if (e.getActionCommand().equals("多重选择"))
   	     selectionMode.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
   	  table.revalidate();
   }    
   
   public void valueChanged(ListSelectionEvent el) /*当用户选取表格数据时会触发ListSelectionEvent,我们实现ListSelectionListener界面来处理这一事件.ListSelectionListener界面只定义一个方法,那就是valueChanged().*/ 	
{
   	  String tempString="";
       //JTable的getSelectedRows()与getSelectedColumns()方法会返回已选取表格cell的index Array数据.
   	  int[] rows=table.getSelectedRows();
   	  int[] columns=table.getSelectedColumns();
      
   	    for (int i=0;i<rows.length;i++){ //JTable的getValueAt()方法会返回某行的cell数据,返回值是Object数据类型,因此要自行转成String数据类型.
   	      for (int j=0;j<columns.length;j++)
                tempString = tempString+" "+(String)table.getValueAt(rows[i], columns[j]);      
   	    }
   	   label.setText("你选取的数据是:"+tempString);
   }
   public static void main(String[] args){
   	  new test10();
   }
}
