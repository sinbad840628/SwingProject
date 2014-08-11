//这段程序代码主要是为读者展示使用渲染器让表格中偶数行的颜色为蓝色，奇数行不变
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.table.*; 
public class test11 extends JFrame 
{ 
	 Object[][] p = 
{
   			 {"王鹏","91","100","191"},
   			 {"朱雪莲","82","100","182"},
   			 {"梅庭","47","100","147"},
   			 {"赵龙","61","100","161"},
   			 {"李兵","90","100","190"},
       };
       String[] n = {"姓名","语文","数学","总分"};
//界面组件----------------------// 
private JScrollPane scroPanel = new JScrollPane(); //中底层滚动面板 
private DefaultTableModel model; //列表默认TableModel 
private JTable table; 
public test11() 
{ 
config(); 
addListener(); 
confcolor(); 
} 
/** 
* 方法: 界面构建  
*/ 
private void config() 
{ 
table = new JTable(model = new DefaultTableModel(p,n)); 
DefaultTableCellRenderer tcr = new DefaultTableCellRenderer() 
{ 
public Component getTableCellRendererComponent(JTable table, Object value, 
boolean isSelected, boolean hasFocus, int row, int column) 
{ 
///设置偶数行颜色
if(row%2 == 0) 
setBackground(Color.white); 
///设置奇数行颜色
else if(row%2 == 1) 
setBackground(new Color(206,231,255)); 
return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
} 
}; 
for(int i=0;i<=3;i++)
{
table.getColumn(n[i]).setCellRenderer(tcr); 
}
scroPanel.getViewport().setBackground(Color.white); 
scroPanel.getViewport().add(table); 
//总体界面布局------------------------// 
getContentPane().add(scroPanel, BorderLayout.CENTER); 
} 
/** 
* 方法: 界面显示
*/ 
private void confcolor() 
{ 
setTitle("编辑器的测试"); 
setSize(500,400); 
Toolkit tmpTK = Toolkit.getDefaultToolkit(); 
Dimension dime = tmpTK.getScreenSize(); 
Dimension frameSize = this.getPreferredSize(); 
setLocation(dime.width/2 - (frameSize.width/2), 
dime.height/2 - (frameSize.height/2)); 
setResizable(false); 
setVisible(true); 
} 
/** 
* 方法: 添加事件监听 addListener() 
*/ 
private void addListener() { 
this.addWindowListener(new WindowAdapter()
{ //添加窗口关闭事件 
public void windowClosing(WindowEvent e)
{ 
new JFrame().setVisible(false); 
dispose(); 
} 
}); 
} 
/** 
* 程序入口 main() 
*/ 
public static void main(String args[]) 
{ 
new test11(); 
} 
}
