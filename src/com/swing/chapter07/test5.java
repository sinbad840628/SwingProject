//��γ��������Ҫ��Ϊ����չʾ��δ������¼�����������ť���ʱ�����ϵ��ı��ᷢ���仯
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
///����һ�������¼��࣬��������У����������ť�Ļ�����ô��ť�ϵ��ı��ᷢ���仯
public class test5 extends Frame 
{
    JButton b;
    public test5(String str)
    {
        super(str);
        b=new JButton("ȷ��");
        add(b);
        ActionListener ac=new actionhandler();
        b.addActionListener(ac);
    }
    public static void main(String[] args)
    {
        test5 me=new test5("�����¼����Դ���");
        me.pack();
        me.setVisible(true);
    }
    class actionhandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            ((JButton)e.getSource()).setLabel("ȡ��");
        }
    }
}
