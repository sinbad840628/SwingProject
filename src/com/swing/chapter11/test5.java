//这段程序代码主要是创建三个JFormattedTextField组件，这三个组件都是固定格式的文本输入组件
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.util.*;
import java.text.*;
public class test5 
{
  public static void main (String args[]) throws ParseException 
{
    JFrame f = new JFrame("JFormattedTextField 测试窗口");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container content = f.getContentPane();
    content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));
    DateFormat format = new SimpleDateFormat("yyyy--MMMM--dd");//创建一个对象，此对象用来设置所显示时间的格式 
    DateFormatter df = new DateFormatter(format);//对上面的对象格式化处理
    JFormattedTextField ftf1 = new  JFormattedTextField(df);//创建一个显示时间格式的文本框
    ftf1.setValue(new Date());
    content.add(ftf1);
    MaskFormatter mf1 = new MaskFormatter("###-##-####");//通过掩码的形式设置文本框中显示数据的格式
    mf1.setPlaceholderCharacter('_');
    JFormattedTextField ftf2 = new  JFormattedTextField(mf1);
    content.add(ftf2);
    MaskFormatter mf2 = new MaskFormatter("(###) ###-####");//通过掩码的形式设置文本框中显示数据的格式
    JFormattedTextField ftf3 = new  JFormattedTextField(mf2);//创建一个事先设置好格式的文本框
    content.add(ftf3);
f.setSize(300, 100);
f.setVisible(true);
   }
}
