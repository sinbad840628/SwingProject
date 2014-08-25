package test;

import com.Control.mainControl;
import com.View.mainView;



public class test {

public static void main(String[] args) {
	mainControl control=new mainControl();
	mainView view=new mainView(control);
	control.setView(view);
}
}
