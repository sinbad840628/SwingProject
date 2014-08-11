import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class test5  
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=600;
    static final int HEIGHT=300;
    JFrame f;
    JMenuItem item1;
    static JPanel p;
    JTable table;	
    public test5() 
    {
    …………………………………..//与上一章中如何定义个性化菜单一节中实例中的创建菜单步骤内容相同
      Object[][] playerInfo={
				 {"王鹏",new Integer(91),new Integer(1949),new Integer(1910)},
				 {"朱雪莲",new Integer(82),new Integer(1969),new Integer(1510)},
				 {"梅庭",new Integer(47),new Integer(1957),new Integer(1040)},
				 {"赵龙",new Integer(61),new Integer(1957),new Integer(1180)},
				 {"李兵",new Integer(90),new Integer(1987),new Integer(1770)},
		 };
		 String[] Names={"姓名","工号","出生年月","薪水"};
		 table=new JTable(playerInfo,Names);
		 table.setPreferredScrollableViewportSize(new Dimension(850,300));
  	     item1.addActionListener(new ActionListener()
  	     {
  	    	public void actionPerformed(ActionEvent Event)
      	  {
  	 		 table.setPreferredScrollableViewportSize(new Dimension(850,300));
  	  		 p.add(table.getTableHeader(),BorderLayout.NORTH);
  	   	     p.add(table,BorderLayout.CENTER);  
      	  }
  	     });
} 	 	
public static void main(String args[]) 
{
  new test5();
 }
}
