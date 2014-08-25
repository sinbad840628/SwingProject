package com.Model;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.media.Time;

public class mainModel {
Player player;
File file;
int bpm;
public double on(){
	player.start();
	this.setBpm(90);
	return player.getDuration().getSeconds();
}
public void off(){
	setBpm(0);
	player.stop();
}
public void inital(){
	if(player!=null){
		player.close();
	}
	try {
		player=Manager.createRealizedPlayer(file.toURL());
	} catch (NoPlayerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (CannotRealizeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(null==player){
		System.out.println("无法加载播放器");
		return;
	}
	//提取路径里的内容
	player.prefetch();
}

public void slider(double time){
	if(null!=player){
		player.setMediaTime(new Time(time));
		System.out.println("歌曲移动到。。。"+time);
		player.start();
	}else{
		System.out.println("加载播放器失败");
	}
}

public Player getPlayer() {
	return player;
}

public void setPlayer(Player player) {
	this.player = player;
}

public File getFile() {
	return file;
}

public void setFile(File file) {
	this.file = file;
}

public int getBpm() {
	return bpm;
}

public void setBpm(int bpm) {
	this.bpm = bpm;
}

	
	
}
