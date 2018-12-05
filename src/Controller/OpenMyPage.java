package Controller;

import java.util.Observable;

import javax.swing.JFrame;

import View.DepositView;
import View.MyPageView;

public class OpenMyPage implements Controller{
	private Observable observable;
	
	public OpenMyPage(Observable observable){
		this.observable = observable;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		MyPageView mainFrame = new MyPageView(observable);
		mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainFrame.setVisible(true);
	}
}
