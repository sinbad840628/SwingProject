package com.Control;

import java.io.File;

import com.Model.mainModel;
import com.Model.timeThread;
import com.View.mainView;

public class mainControl {
   private boolean stoped;
   File file;
   mainModel model;
   mainView view;
   timeThread timeThread;
   Thread t;
   Thread l;
public mainControl() {
	this.model=new mainModel();
	stoped=false;
}
	public  void initialize(File file) {
		this.file = file;
		model.setFile(file);
		model.inital();
		this.timeThread = new timeThread(this);		
	}


	public  void start() {
		//得到音乐长度
		int length=(int)model.on();
		this.timeThread.setLength(length);
		if(t==null||t.isAlive()){
			t=new Thread(timeThread);
		}
		//点击停止时
		if(stoped)
		{
			stoped=false;
		}
		else{
			t.start();
		}
		view.setBpm(90);
		System.out.println(model.getPlayer());
	}

	public  void stop() {
       model.off();		 
       stoped=true;
       System.out.println("stoped");
	}
	public  void slider(double newtime) {
		timeThread.setLocation((int)newtime);
		model.slider(timeThread.getLength()*(newtime/100));
	}
	public  void setBPM(int bpm) {
		System.out.println("setbpm is :"+bpm);
		model.getPlayer().setRate((float) ((float) bpm /90));
		model.setBpm(bpm);
		view.setBpm(bpm);
	}

	public  void increaseBPM() {
		int bpm=model.getBpm();
		model.getPlayer().setRate((float) ((float) (bpm+5) / 90));
		model.setBpm(bpm+5);
		view.setBpm(bpm+5);
		System.out.println("increase to:"+(bpm+5)+"  the rate is"+((float) (bpm+5) / 90));
	}

	public  void decreaseBPM() {
		int bpm=model.getBpm();
		if(bpm>10){
			model.getPlayer().setRate((float) ((float) (bpm-5) / 90));
			model.setBpm(bpm-5);
			view.setBpm(bpm-5);
			System.out.println("decrease to:"+(bpm-5)+"  the rate is"+ ((float) (bpm-5) / 90));
		}
		else{
			System.out.println("bpm 已经不能减了");
		}
				
	}

	public void updateTimeSlider() {
		try {
			while(stoped)
				Thread.sleep(500);
			    view.updateTimeSlider();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("i am running");
	}
    public void setView(mainView view){
    	this.view=view;
    }
   
    
}
