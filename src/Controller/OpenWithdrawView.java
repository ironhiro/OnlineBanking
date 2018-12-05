package Controller;

import javax.swing.JFrame;

import View.WithdrawView;

public class OpenWithdrawView implements Controller {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		WithdrawView withdrawView = new WithdrawView();
		withdrawView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		withdrawView.setVisible(true);
	}

}
