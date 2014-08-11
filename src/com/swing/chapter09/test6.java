import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class test6 implements ActionListener,ChangeListener
{
    JFrame f = null;
    JProgressBar progressbar;
    JLabel label;
    Timer timer;
    JButton b1;
    JButton b2;
    public test6()                           
    {
        
        b1=new JButton("��ʼ");
        b2=new JButton("ֹͣ");
        b1.addActionListener(this);//Ϊ��ť��Ӷ����¼�
        b2.addActionListener(this);
        panel.add(b1);
        panel.add(b2);
        timer = new Timer(50,this);//����һ���¼��������
        f = new JFrame("progressbar Example");
        Container contentPane = f.getContentPane();
        label = new JLabel(" ",JLabel.CENTER);
        progressbar = new JProgressBar();//����һ��������
        progressbar.setOrientation(JProgressBar.HORIZONTAL);//�����䷽��Ϊˮƽ����
        progressbar.setMinimum(0);//��С�̶�0
        progressbar.setMaximum(100);//���̶�100
        progressbar.setValue(0);
        progressbar.setStringPainted(true);
        progressbar.addChangeListener(this);//��ӽ������仯�¼�
        progressbar.setPreferredSize(new Dimension(200,30));
        JPanel panel = new JPanel();
        b = new JButton("Start");
        b.addActionListener(this);//Ϊ��ť��Ӷ����¼�
        panel.add(b);
        timer = new Timer(50,this);//����һ���¼��������
        contentPane.add(panel,BorderLayout.NORTH);
        contentPane.add(progressbar,BorderLayout.CENTER);
        contentPane.add(label,BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        });
    }
    public static void main(String[] args)
    {
        new test6();
    }
    public void actionPerformed(ActionEvent e)
    {
///��������ť�����ʱ��ʼ
        if(e.getSource() == b1)
        {
            timer.start();
        }
        if(e.getSource() == b2)
        {
            timer.stop();
        }
///�������¼���������������ʼ�仯
        if(e.getSource() == timer)
        {
            int value = progressbar.getValue();
            if( value < 100)
            {
                value++;//��������ǰ�˶�
                progressbar.setValue(value);
            }
            else
            {
                timer.stop();
                progressbar.setValue(0);
            }
        }
    }
    public void stateChanged(ChangeEvent e1)
    {
        int value = progressbar.getValue();
        ///������������ʱ���ͽ��������ʾ�ڱ�ǩ��
        if(e1.getSource() == progressbar)
        {
            label.setText("Ŀǰ����ɽ��ȣ�"+Integer.toString(value)+" %"); 
        }

    }
}
