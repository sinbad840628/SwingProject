//��δ�����Ҫ������߶�������ڶ��������������ͨ���
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class test4
{
    static  final int WIDTH=300;
    static  final int HEIGHT=400;
    static JTextField text1;
    static JTextField text2;
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("���Դ���");
        JPanel pane=new JPanel();
        frame.setContentPane(pane);
        text1=new JTextField(10);
        text2=new JTextField(10);
        JLabel label1=new JLabel("tan ");
        JButton button=new JButton("=");
        
        pane.add(label1);
        pane.add(text1);
        pane.add(button);
        pane.add(text2);
        button.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event) 
            {
                String str1=text1.getText();
                Double d1=Double.parseDouble(str1);
                Double d2=Math.tan(d1);//����Math���е����к��� 
                String str=""+d2;
                text2.setText(str);
            }
        });
        frame.setSize(WIDTH,HEIGHT);
        frame.setVisible(true);
    }
}
