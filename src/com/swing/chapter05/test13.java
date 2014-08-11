mport java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
//Download by http://www.codefans.net
import javax.swing.*;
public class test13 extends JPanel
{
	    static final int WIDTH=300;
	    static final int HEIGHT=150;
	    JFrame computer;
	    test13()
	    {
	    	   computer=new JFrame("简单计算器模拟界面");
	    	   computer.setContentPane(this);
	    	   computer.setSize(WIDTH,HEIGHT);
	           computer.setVisible(true);
	           setLayout(new BorderLayout());   
	    	   JPanel pane1=new JPanel();
	    	   JPanel pane2=new JPanel();
	    	   pane1.setLayout(new GridLayout(4,5));
	    	   pane2.setLayout(new FlowLayout());
	           add(pane2,"North");
	           add(pane1,"Center");
	        
                   JTextField text=new JTextField(20);
	    	   JButton button1=new JButton("ON");
	           JButton button2=new JButton("AC");
	           JButton button3=new JButton("+/-");
	           JButton button4=new JButton("C");
	           JButton button5=new JButton("1");
	           JButton button6=new JButton("2");
	           JButton button7=new JButton("3");
	           JButton button8=new JButton("4");
	           JButton button9=new JButton("5");
	    	   JButton button10=new JButton("6");
	           JButton button11=new JButton("7");
	           JButton button12=new JButton("8");
	           JButton button13=new JButton("9");
	           JButton button14=new JButton("0");
	           JButton button15=new JButton("%");
	           JButton button16=new JButton("*");
	           JButton button17=new JButton("+");
	    	   JButton button18=new JButton("_");	       
	           JButton button19=new JButton("=");
	           JButton button20=new JButton(".");

	           pane2.add(text);
	           pane1.add(button5);
	           pane1.add(button6);
	           pane1.add(button7);
	           pane1.add(button16);
	           pane1.add(button1);
	           pane1.add(button8);
	           pane1.add(button9);
	           pane1.add(button10);
	           pane1.add(button8);
	           pane1.add(button2);
	           pane1.add(button11);
	           pane1.add(button12);
	           pane1.add(button13);
	           pane1.add(button20);
	           pane1.add(button3);
	           pane1.add(button14);
	           pane1.add(button17);
	           pane1.add(button18);
	           pane1.add(button4);
	           pane1.add(button15);
	           pane1.add(button19);
	        
	    }
        public static void main(String[] args)
        {
        	new test13();
        }
}
