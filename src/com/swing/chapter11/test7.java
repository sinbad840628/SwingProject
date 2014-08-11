//这段程序代码主要创建文本区组件，在文本区中处理了有关事件处理
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.undo.*;
import javax.swing.event.*;
import javax.swing.text.*;
public class test7 extends JFrame implements UndoableEditListener,DocumentListener
{
   private UndoableEdit edit;//表示编辑的对象，该编辑已完成并且可以对其进行撤消和恢复操作。
   private JTextArea  jta;
   private JTextArea  message;
   private JMenuItem undoitem;
   private JMenuItem redoitem;
   public test7()
{
      super("文本区事件处理测试窗口");
      jta=new JTextArea();
      jta.getDocument().addUndoableEditListener(this);
      jta.getDocument().addDocumentListener(this);	
      message = new JTextArea();
      message.setEditable(false);
        JPanel p1 = new JPanel();
       p1.setLayout(new GridLayout(1,1));
       p1.setBorder(BorderFactory.createTitledBorder("Edit Area"));//BorderFactory.createTitledBorder创建一个新标题边框，使用默认边框（浮雕化）、默认文本位置（位于顶线上）、默认调整 (leading) 以及由当前外观确定的默认字体和文本颜色，并指定了标题文本。
        
        p1.add(new JScrollPane(jta));

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,1));
        p2.setBorder(BorderFactory.createTitledBorder("Message"));  
        p2.add(new JScrollPane(message));        
        
    	getContentPane().setLayout(new GridLayout(2,1));
    	getContentPane().add(p1);
    	getContentPane().add(p2);
    	
    	JMenuBar bar  = new JMenuBar();
    	JMenu theMenu = new JMenu("Edit");
    	undoitem = new JMenuItem("Undo");
    	redoitem = new JMenuItem("Redo");
    	theMenu.add(undoitem);
    	theMenu.add(redoitem);
    	bar.add(theMenu);
    	///创建菜单项
    	updateMenuItem();
    	setJMenuBar(bar);
    	setSize(300,300);
    	undoitem.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent ev){
    			edit.undo();///撤销所有操作
    			updateMenuItem();
    			message.append("- Undo -\n");
    		}	
    	});

    	redoitem.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent ev){
    			edit.redo();//假定编辑已被撤消，则重新应用该编辑
    			updateMenuItem();
    			message.append("- Redo -\n");
    		}	
    	});    	
   }	//end of JTextArea5
    public void undoableEditHappened(UndoableEditEvent ev){
    	StringBuffer buf = new StringBuffer(200);
    	edit = ev.getEdit();
    	buf.append("undoableEdit:");
    	buf.append(edit.getPresentationName());
    	buf.append("\n");
    	message.append(buf.toString());
    	updateMenuItem();
    }//取消操作的事件处理

    public void updateMenuItem(){
    	
    	if (edit != null){
		  undoitem.setEnabled(edit.canUndo());
		  redoitem.setEnabled(edit.canRedo());
		  undoitem.setText(edit.getUndoPresentationName());
		  redoitem.setText(edit.getRedoPresentationName());
	    }else{
		  undoitem.setEnabled(false);
	  	  redoitem.setEnabled(false);
		  undoitem.setText("Undo");
		  redoitem.setText("Redo");
	    }
    }//菜单的变化后的结果
    public void showDE(DocumentEvent de){
      StringBuffer debuf=new StringBuffer(100);
      debuf.append(de.getType());
      debuf.append("Offset:");
      debuf.append(de.getOffset());
      debuf.append("Length:");
      debuf.append(de.getLength());
      
      Element Eroot=jta.getDocument().getDefaultRootElement();
      DocumentEvent.ElementChange Echange=de.getChange(Eroot);
     
      if (Echange==null)	{
      	debuf.append("(No Element Change)"); //获得给定元素的更改信息。
      }else{
      	debuf.append("Element Change:index");
      	debuf.append("Echange.getIndex()");
      }
      debuf.append("\n");
      message.append(debuf.toString());
    }
    
    public void changedUpdate(DocumentEvent de){ //显示出信息
      showDE(de);	
    }
    public void insertUpdate(DocumentEvent de){
      showDE(de);	
    }
    public void removeUpdate(DocumentEvent de){
      showDE(de);
    }
    public static void main(String[] args){
      JFrame f=new test7()	;
      f.addWindowListener(new WindowAdapter(){
      	public void windowClosing(WindowEvent e){
      	  System.exit(0);	
      	}
      });
      f.setVisible(true);
    }
}
