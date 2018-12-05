package Controller;

import javax.swing.JFrame;

import View.AccountTransferView;

public class OpenAccountTransferView implements Controller {
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		AccountTransferView accountTransferView = new AccountTransferView();
		accountTransferView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		accountTransferView.setVisible(true);
	}
	
}
