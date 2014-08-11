//��γ��������Ҫ�Ǵ�������JFormattedTextField�����������������ǹ̶���ʽ���ı��������
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.util.*;
import java.text.*;
public class test5 
{
  public static void main (String args[]) throws ParseException 
{
    JFrame f = new JFrame("JFormattedTextField ���Դ���");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container content = f.getContentPane();
    content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));
    DateFormat format = new SimpleDateFormat("yyyy--MMMM--dd");//����һ�����󣬴˶���������������ʾʱ��ĸ�ʽ 
    DateFormatter df = new DateFormatter(format);//������Ķ����ʽ������
    JFormattedTextField ftf1 = new  JFormattedTextField(df);//����һ����ʾʱ���ʽ���ı���
    ftf1.setValue(new Date());
    content.add(ftf1);
    MaskFormatter mf1 = new MaskFormatter("###-##-####");//ͨ���������ʽ�����ı�������ʾ���ݵĸ�ʽ
    mf1.setPlaceholderCharacter('_');
    JFormattedTextField ftf2 = new  JFormattedTextField(mf1);
    content.add(ftf2);
    MaskFormatter mf2 = new MaskFormatter("(###) ###-####");//ͨ���������ʽ�����ı�������ʾ���ݵĸ�ʽ
    JFormattedTextField ftf3 = new  JFormattedTextField(mf2);//����һ���������úø�ʽ���ı���
    content.add(ftf3);
f.setSize(300, 100);
f.setVisible(true);
   }
}
