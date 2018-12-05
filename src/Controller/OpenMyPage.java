package Controller;


import java.util.Observable;


import View.*;
import javax.swing.JFrame;
import Model.*;

public class OpenMyPage implements Controller {
	MainView main;
	public OpenMyPage(MainView main)
	{
		this.main = main;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		MyPageView mainFrame = new MyPageView();
		mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainFrame.setVisible(true);
	}


}
