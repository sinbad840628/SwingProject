//��γ��������Ҫ��Ϊ����չʾ���ʹ�ñ༭���õ�һ������Ϊ���ɱ༭״̬
import   java.awt.BorderLayout; 
import   javax.swing.JFrame; 
import   javax.swing.JScrollPane; 
import   javax.swing.JTable; 
import javax.swing.table.DefaultTableModel;
public  class  test12   
{  
    public   static   void   main(String[]   args)   
    { 
        JFrame frame = new  JFrame("�༭������"); 
        frame.setSize(300,200); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.getContentPane().setLayout(new   BorderLayout()); 
        Object[][] p = 
{
      			 {"����","91","100","191"},
      			 {"��ѩ��","82","100","182"},
      			 {"÷ͥ","47","100","147"},
      			 {"����","61","100","161"},
      			 {"���","90","100","190"},
         };
        String[] n = {"����","����","��ѧ","�ܷ�"};    
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
