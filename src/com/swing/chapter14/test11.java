package com.swing.chapter14;

//��γ��������Ҫ��Ϊ����չʾʹ����Ⱦ���ñ����ż���е���ɫΪ��ɫ�������в���
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.table.*; 
public class test11 extends JFrame 
{ 
	 Object[][] p = 
{
   			 {"����","91","100","191"},
   			 {"��ѩ��","82","100","182"},
   			 {"÷ͥ","47","100","147"},
   			 {"����","61","100","161"},
   			 {"���","90","100","190"},
       };
       String[] n = {"����","����","��ѧ","�ܷ�"};
//�������----------------------// 
private JScrollPane scroPanel = new JScrollPane(); //�еײ������� 
private DefaultTableModel model; //�б�Ĭ��TableModel 
private JTable table; 
public test11() 
{ 
config(); 
addListener(); 
confcolor(); 
} 
/** 
* ����: ���湹��  
*/ 
private void config() 
{ 
table = new JTable(model = new DefaultTableModel(p,n)); 
DefaultTableCellRenderer tcr = new DefaultTableCellRenderer() 
{ 
public Component getTableCellRendererComponent(JTable table, Object value, 
boolean isSelected, boolean hasFocus, int row, int column) 
{ 
///����ż������ɫ
if(row%2 == 0) 
setBackground(Color.white); 
///������������ɫ
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
//������沼��------------------------// 
getContentPane().add(scroPanel, BorderLayout.CENTER); 
} 
/** 
* ����: ������ʾ
*/ 
private void confcolor() 
{ 
setTitle("�༭���Ĳ���"); 
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
* ����: ����¼����� addListener() 
*/ 
private void addListener() { 
this.addWindowListener(new WindowAdapter()
{ //��Ӵ��ڹر��¼� 
public void windowClosing(WindowEvent e)
{ 
new JFrame().setVisible(false); 
dispose(); 
} 
}); 
} 
/** 
* ������� main() 
*/ 
public static void main(String args[]) 
{ 
new test11(); 
} 
}
