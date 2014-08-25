package com.Model;

import com.Control.mainControl;

public class timeThread implements Runnable{
    private int sleeptime;
    private int location;
    private int length;
	mainControl control;
	
	
	public timeThread(mainControl control){
		this.control=control;
		sleeptime = 1000;
		location = 0;
		
	}
	
	
	public void run() {
		for(;location <= 100;location++){
			System.out.println("location = " + location);
			try {
				Thread.sleep(sleeptime);
				control.updateTimeSlider();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}		
	}



	
	
	

	public int getSleeptime() {
		return sleeptime;
	}




	public void setSleeptime(int sleeptime) {
		this.sleeptime = sleeptime;
	}




	public int getLocation() {
		return location;
	}




	public void setLocation(int location) {
		this.location = location;
	}




	public int getLength() {
		return length;
	}




	public void setLength(int length) {
		this.length = length;
		sleeptime=length*10;
	}




	

	
	
	
	
	
}
