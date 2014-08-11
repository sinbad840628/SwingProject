//这段程序代码主要是为读者展示如何使用系统托盘
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
			MenuItem item = new MenuItem("弹出菜单");
			popup.add(item);
			TrayIcon trayIcon = new TrayIcon(image, "系统托盘信息", popup);
		    try
            {
			tray.add(trayIcon);
			}
			catch (Exception e)
			{
			System.err.println("无法向这个托盘添加新项： " + e);
			}
		}
		else
		{
		System.err.println("无法使用系统托盘!");
		}
	}
}
