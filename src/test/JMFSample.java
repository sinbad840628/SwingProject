package test;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.media.ControllerEvent;
import javax.media.ControllerListener;
import javax.media.EndOfMediaEvent;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.media.PrefetchCompleteEvent;
import javax.media.RealizeCompleteEvent;
import javax.media.Time;

public class JMFSample implements ControllerListener {
    public static void main(String[] args) {
        JMFSample sp = new JMFSample();
        sp.play();
    }
   
    private Frame f;
    private Player player;
    private Panel panel;
    private Component visual;
    private Component control = null;
   
    public void play(){
        f = new Frame("JMF Sample1");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                if(player != null) {
                    player.close();
                }
                System.exit(0);
            }
        });
        f.setSize(500,400);

        f.setVisible(true);
        URL url = null;
        try {
            //׼��һ��Ҫ���ŵ���Ƶ�ļ���URL
            url = new URL("file:/E:/c-d.avi");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }       
        try {
            //ͨ������Manager��createPlayer����������һ��Player�Ķ���
            //���������ý�岥�ŵĺ��Ŀ��ƶ���
            player = Manager.createPlayer(url);
        } catch (NoPlayerException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        //��player����ע����������ܸ�ż������¼�������ʱ��ִ����صĶ���
        player.addControllerListener(this);
       
        //��player���������ص���Դ����
        player.realize();
    }
   
    private int videoWidth = 0;
    private int videoHeight = 0;
    private int controlHeight = 30;
    private int insetWidth = 10;
    private int insetHeight = 30;
   
    //����player������¼�
    public void controllerUpdate(ControllerEvent ce) {
        if (ce instanceof RealizeCompleteEvent) {
            //playerʵ������ɺ����player����ǰԤ����
            player.prefetch();
        } else if (ce instanceof PrefetchCompleteEvent) {
            if (visual != null)
                return;

            //ȡ��player�еĲ�����Ƶ����������õ���Ƶ���ڵĴ�С
            //Ȼ�����Ƶ���ڵ������ӵ�Frame�����У�
            if ((visual = player.getVisualComponent()) != null) {
                Dimension size = visual.getPreferredSize();
                videoWidth = size.width;
                videoHeight = size.height;
                f.add(visual);
            } else {
                videoWidth = 320;
            }
           
            //ȡ��player�е���Ƶ���ſ�������������Ѹ������ӵ�Frame������
            if ((control = player.getControlPanelComponent()) != null) {
                controlHeight = control.getPreferredSize().height;
                f.add(control, BorderLayout.SOUTH);
            }
           
            //�趨Frame���ڵĴ�С��ʹ��������Ƶ�ļ���Ĭ�ϴ�С
            f.setSize(videoWidth + insetWidth, videoHeight + controlHeight + insetHeight);
            f.validate();
           
            //������Ƶ���������ʼ����
            player.start();
        } else if (ce instanceof EndOfMediaEvent) {
            //��������Ƶ��ɺ󣬰�ʱ��������ָ�����ʼ�����ٴ����¿�ʼ����
            player.setMediaTime(new Time(0));
            player.start();
        }
    }

}
