package com.swing.chapter10;

//��γ��������Ҫ�Ǵ���һ���ļ�����Ի����Ҵ������¼����Լ�����һ���򿪶Ի����Ҵ������¼�
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class test1 implements ActionListener//�����ʵ���˶���������
{
    JFrame f = null;
    JLabel label = null;
    JTextArea textarea = null;
    JFileChooser fileChooser = null;
    public test1()
    {
        f = new JFrame("FileChooser Example");
        Container contentPane = f.getContentPane();
        textarea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textarea);
        scrollPane.setPreferredSize(new Dimension(350,300));
        JPanel panel = new JPanel();
        JButton b1 = new JButton("�½��ļ�");
        b1.addActionListener(this);
        JButton b2 = new JButton("�洢�ļ�");
        b2.addActionListener(this);
        panel.add(b1);
        panel.add(b2);
        label = new JLabel(" ",JLabel.CENTER);
        fileChooser = new JFileChooser("D:\\");//����һ��FileChooser����,��ָ��D:��Ŀ¼ΪĬ���ļ��Ի���·��.
        contentPane.add(label,BorderLayout.NORTH);
        contentPane.add(scrollPane,BorderLayout.CENTER);
        contentPane.add(panel,BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
 public static void main(String[] args) {
        new test1();
    }
    public void actionPerformed(ActionEvent e)
    {
        File file = null;
        int result;
        /*���û�����"���ļ�"��ťʱ,JFileChooser��showOpenDialog()����������ļ��Ի���,������setApproveButtonText()����ȡ����ť��"Open"����;��setDialogTitle()�������ô��ļ��Ի���Title���ƣ���ʹ��ѡ�����,�Ὣѡ�����浽result������.
         */
        if (e.getActionCommand().equals("�½��ļ�"))
        {
            fileChooser.setApproveButtonText("ȷ��");
            fileChooser.setDialogTitle("���ļ�");
            result = fileChooser.showOpenDialog(f);
            textarea.setText("");
            /*���û����´��ļ��Ի����"ȷ��"ť��,���ǾͿ�������getSelectedFile()����ȡ���ļ�����.�����û����´��ļ��Ի����"Cancel"ť,����label����ʾ"��û��ѡ���κ��ļ�"����.*/
            if (result == JFileChooser.APPROVE_OPTION)
            {
                file = fileChooser.getSelectedFile();
                label.setText("��ѡ��򿪵��ļ�����Ϊ��"+file.getName());
            }
            else if(result == JFileChooser.CANCEL_OPTION)
            {
                label.setText("��û��ѡ���κ��ļ�");
            }
 FileInputStream fileInStream = null;
            if(file != null)
            {
                try{
                    //����FileInputStream���ļ����ݷ�������������Ա��ȡ.
                    fileInStream = new FileInputStream(file);
                }catch(FileNotFoundException fe){
                    label.setText("File Not Found");
                    return;
                }
                int readbyte;
                try{
                    //��read()������ȡFileInputStream��������,������ֵΪ-1ʱ��������������.�����������ַ���ʾ
                    //��textarea��.
                    while( (readbyte = fileInStream.read()) != -1)
                    {
                        textarea.append(String.valueOf((char)readbyte));
                    }
                }catch(IOException ioe){
                    label.setText("��ȡ�ļ�����");
                }
                finally{//����FileInputStream����,������Դ���˷�.
                    try{
                        if(fileInStream != null)
                            fileInStream.close();
                    }catch(IOException ioe2){}
                }
            }
        }
//ʵ��д���ļ��Ĺ���.
        if (e.getActionCommand().equals("�洢�ļ�"))
        {
            result = fileChooser.showSaveDialog(f);
            file = null;
            String fileName;
            //���û�û��ѡ���ļ�,�����Լ������ļ�����ʱ,ϵͳ���Զ��Դ��ļ����������ļ�.
            if (result == JFileChooser.APPROVE_OPTION)
            {
                file = fileChooser.getSelectedFile();
                label.setText("��ѡ��洢���ļ�����Ϊ��"+file.getName());
            }
            else if(result == JFileChooser.CANCEL_OPTION)
            {
                label.setText("��û��ѡ���κ��ļ�");
            }
/д���ļ�ʹ��FileOutputStream,�����������,д���ļ��ķ�ʽ�ǽ�֮ǰ�������������д��.��������������ݼ���ԭ�е��ļ����ݺ��棬����ʹ��FileOutputStream(String name,Boolean append)������캯��.
 FileOutputStream fileOutStream = null;
            if(file != null)
            {
                try{
                    fileOutStream = new FileOutputStream(file);
                }catch(FileNotFoundException fe){
                    label.setText("File Not Found");
                    return;
                }
                String content = textarea.getText();
                try{
                    fileOutStream.write(content.getBytes());
                }catch(IOException ioe){
                    label.setText("д���ļ�����");
                }
                finally{
                    try{
                        if(fileOutStream != null)
                            fileOutStream.close();
                    }catch(IOException ioe2){}
                }
            }
        }
    }
}
