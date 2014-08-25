package com.View;

import java.util.Random;

import javax.swing.JProgressBar;



public class BeatBar extends JProgressBar implements Runnable {
	// JProgressBar progressBar;
	Thread thread;

	public BeatBar() {
		this.setSize(50, 20);
		thread = new Thread(this);
		setValue(100);
		setMaximum(100);
		// thread.start();

	}

	public Thread getThread() {
		return thread;
	}

	public void run() {
		int temp = 1;
		for (;;) {
			int value = getValue();
			value = (int) (value * .75);
			// setValue(value);
			// temp=(int)Math.random()*100;
			Random i = new Random();
			temp = i.nextInt(100); // 要设置一个最大值！！！！！！！！
			setValue(temp);
			repaint();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
			;
		}
	}
}
