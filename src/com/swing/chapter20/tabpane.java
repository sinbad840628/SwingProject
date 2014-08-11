import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
public   class tabpane extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel1;
	static JPanel panel2;
	static JPanel panel3;
	static JPanel panel4;
	static JPanel panel5;
	static JTabbedPane tp;
 public tabpane()
 {    
	  setLayout(new BorderLayout());
	  tp=new JTabbedPane();
	  panel1 = new JPanel ();
	  panel2 = new JPanel ();
	  panel3 = new JPanel ();
	  panel4 = new JPanel ();
	  panel5 = new JPanel ();
	  panel1.setLayout(new BorderLayout());
	  tp.addTab("panel1", panel1);
	  tp.setEnabledAt(0,true);
	  tp.setTitleAt(0,"基本信息");
	  tp.addTab ("panel2", panel2);
	  tp.setEnabledAt (1, true);
	  tp.setTitleAt (1,"照片");
	  tp.addTab ("panel3", panel3);
	  tp.setEnabledAt (2, true);
	  tp.setTitleAt (2,"兴趣与爱好");
	  tp.addTab ("panel4", panel4);
	  tp.setEnabledAt(0,true);
	  tp.setTitleAt(3,"日常习惯");
	  tp.addTab ("panel5", panel5);
	  tp.setEnabledAt(4,true);
	  tp.setTitleAt(4,"评价");
	  tp.setPreferredSize (new Dimension (500,200));
	  tp.setTabPlacement (JTabbedPane.TOP);
	  tp.setTabLayoutPolicy (JTabbedPane.SCROLL_TAB_LAYOUT);
	  add("Center",tp);
	  tp.setVisible(false);
	  
 }
}
