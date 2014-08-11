//这段程序代码主要是为读者展示如何使用编辑器让第一列数据为不可编辑状态
import   java.awt.BorderLayout; 
import   javax.swing.JFrame; 
import   javax.swing.JScrollPane; 
import   javax.swing.JTable; 
import javax.swing.table.DefaultTableModel;
public  class  test12   
{  
    public   static   void   main(String[]   args)   
    { 
        JFrame frame = new  JFrame("编辑器测试"); 
        frame.setSize(300,200); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.getContentPane().setLayout(new   BorderLayout()); 
        Object[][] p = 
{
      			 {"王鹏","91","100","191"},
      			 {"朱雪莲","82","100","182"},
      			 {"梅庭","47","100","147"},
      			 {"赵龙","61","100","161"},
      			 {"李兵","90","100","190"},
         };
        String[] n = {"姓名","语文","数学","总分"};    
        JTable  table = new  JTable(); 
        frame.getContentPane().add(new   JScrollPane(table)); 
        frame.setVisible(true); 
        table.setModel(new  DefaultTableModel(p,n) 
{
        public   boolean   isCellEditable(int  rowIndex,int  columnIndex)
        {   	
            if(columnIndex==0) 
            return   false; 
            return   true;
        } 
    });
    }
    }
