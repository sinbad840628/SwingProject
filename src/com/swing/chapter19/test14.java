//��γ��������Ҫ��Ϊ����չʾ���ʹ��ϵͳ����
import javax.swing.*;
import java.awt.*;
public class test14
{
	public static void main(String[] args)
	{
		if(SystemTray.isSupported()) 
		{
			SystemTray tray = SystemTray.getSystemTray();
			Image image = Toolkit.getDefaultToolkit().getImage("d:/btn120-spa.gif");
			PopupMenu popup = new PopupMenu();
			MenuItem item = new MenuItem("�����˵�");
			popup.add(item);
			TrayIcon trayIcon = new TrayIcon(image, "ϵͳ������Ϣ", popup);
		    try
            {
			tray.add(trayIcon);
			}
			catch (Exception e)
			{
			System.err.println("�޷���������������� " + e);
			}
		}
		else
		{
		System.err.println("�޷�ʹ��ϵͳ����!");
		}
	}
}
