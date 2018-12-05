package Controller;

import javax.swing.JFrame;

import View.DepositView;

public class OpenDepositView implements Controller{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		DepositView depoistView = new DepositView();
		depoistView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		depoistView.setVisible(true);
	}

}
