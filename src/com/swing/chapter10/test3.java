//��γ��������Ҫ��Ϊ����չʾ��δ���һ����ɫѡ����ڳ����У���Ҫ�Ǵ����������ͨ��ť�������һ����ť��������������ɫѡ�����ѡ�����ɫ�������ĸ���ͨ��ť�����Ҫ����ʾ��ѡ��ɫ�Ĳ���
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
  color = JColorChooser.showDialog(this, "Choose Color", color);//����һ����ɫѡ����
  setBackground (color);
  button.setText ("Get again");
///ͨ��get��������ȡ��ɫ���е���ɫ
  rgb.setText ("RGB: " + color.getRGB());
  red.setText ("Red: " + color.getRed());
  green.setText ("Green: " + color.getGreen());
  blue.setText ("Blue: " + color.getBlue());
 }
}
