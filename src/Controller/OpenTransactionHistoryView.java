package Controller;

import javax.swing.JFrame;

import View.TransactionHistoryView;

public class OpenTransactionHistoryView implements Controller {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		TransactionHistoryView transactionHistoryView = new TransactionHistoryView();
		transactionHistoryView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		transactionHistoryView.setVisible(true);
	}

}
