package com.swing.test;

import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
//�ڵ�Ԫ������ӻ������ ������
public class Table5 extends JFrame 
{
	JTable table;
	JScrollPane pane;
	TableModel model;
	//����
	Object[][] data = {{"����","��",3},
						{"����","��",4},
						{"С��","Ů",5}};
	//����
	Object[] clomnName = {"����","�Ա�","����"};
	Table5()
	{
		super("�����Գ���");
		init();
	}
	private void init()
	{
		//��ʼ��TableModel��ʹ������data������clomnName
		model = new DefaultTableModel(data, clomnName);
		//ʹ�������model��Ϊ������ʼ��JTabel
		table = new JTable(model);
		
		//��ʼ�������б��
		JComboBox box = new JComboBox();
		box.addItem("��");
		box.addItem("Ů");
		
		//��ȡ�Ա���һ�ж���
		TableColumn d = table.getColumn("�Ա�");
		
		//�������б�������༭��
		DefaultCellEditor dce = new DefaultCellEditor(box); 
		
		d.setCellEditor(dce);
		
		//��ʼ��JScrollPane
		pane = new JScrollPane();
		//��table��ӵ�JScrollPane�� ����ʹ������ĵ�һ�ַ����������
		//ʹ�õ�һ���Ȼ��JViewPort����Ȼ�������
		pane.getViewport().add(table);
		this.getContentPane().add(pane);
		setSize(400,300);//����Frame�Ĵ�С
		setResizable(false);//���ô��ڲ����Ե�����С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�˳�ʱ�رմ���
		setVisible(true);//���ô�����ʾ����
	}
	public static void main(String[] args)
	{
		new Table5();
	}
}

