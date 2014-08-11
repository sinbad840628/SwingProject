//这段程序代码主要是为读者展示如何利用渲染器在表的第三列和第三行位置再插入一个表格
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.table.*; 
public class test13 extends JTable
{
    public test13() 
{
    	JFrame f=new JFrame("测试窗口");
    	f.setVisible(true);
    	f.pack();
    	Object[][] p = {
      			 {"王鹏","91","100","191"},
      			 {"朱雪莲","82","100","182"},
      			 {"梅庭","47","100","147"},
      			 {"赵龙","61","100","161"},
      			 {"李兵","90","100","190"},
          };
          String[] n = {"姓名","语文","数学","总分"};    
//界面组件 
          JScrollPane scroPanel = new JScrollPane(this); //中底层滚动面板  
f.getContentPane().add(scroPanel, BorderLayout.CENTER);
          setModel(new DefaultTableModel(p,n));
          setRowHeight(1,super.getRowHeight()*4); //将第二行高度设置宽一些，使嵌入的表格显示起来好看些。
    }
    
          public TableCellRenderer getCellRenderer(int row, int column) 
{//重载getCellRenderer提供自己的TableCellRenderer
             if(row == 1 && column==2)
{
                 return new TableCellRenderer(){//在第二行、第三列提供一个子表的渲染器
                JTable subTable=new JTable(new DefaultTableModel(4,4)); //子表，可以自己定制子表的内容。
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) 
{//实现TableCellRenderer的方法，提供该子表渲染器
                    return subTable;
                }
            };
         }
else

            return super.getCellRenderer(row, column); //如果是其他地方的表格，沿用父类中提供的渲染器
    public static void main(String[] args)
    {
    	new test13();
    }
}
