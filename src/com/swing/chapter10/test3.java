//这段程序代码主要是为读者展示如何创建一个颜色选择框，在程序中，主要是创建了五个普通按钮组件，第一个按钮组件用来获得在颜色选择框中选择的颜色，后面四个普通按钮组件主要是显示所选颜色的参数
import java.awt.Dimension;
import javax.swing.JColorChooser;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.FlowLayout;
public class test3 implements ActionListener
{
 public static void main(String[] args)
 {
  JFrame frame = new JFrame ("JColorChooserDemo");
  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  MyPanel panel = new MyPanel();
  frame.getContentPane ().add (panel);
  frame.pack();
  frame.setVisible(true);
 }
}
class MyPanel extends JPanel implements ActionListener
{
 private JButton button, rgb, red, green, blue;
 private Color color = new Color (0, 0, 0);
 public MyPanel()
 {
  button = new JButton ("Get Color");
  rgb = new JButton ("RGB: ");
  red = new JButton ("Red: ");
  green = new JButton ("Green: ");
  blue = new JButton ("Blue: ");
  button.addActionListener (this);
  setPreferredSize (new Dimension (550,250));
  setLayout (new FlowLayout (FlowLayout.CENTER, 5,5));
  setBackground (color);
  add (button);
  add (rgb);
  add (red);
  add (green);
  add (blue);
 }
 public void actionPerformed(ActionEvent e)
 {
  color = JColorChooser.showDialog(this, "Choose Color", color);//创建一个颜色选择器
  setBackground (color);
  button.setText ("Get again");
///通过get方法来获取颜色库中的颜色
  rgb.setText ("RGB: " + color.getRGB());
  red.setText ("Red: " + color.getRed());
  green.setText ("Green: " + color.getGreen());
  blue.setText ("Blue: " + color.getBlue());
 }
}
