package View;

import Model.*;
import Controller.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import Controller.*;
import View.MyPageView;
import java.awt.Color;

public class MainView extends JFrame implements Observer{

	private JPanel contentPane;
	private Controller c;
	Observable observable;
	JLabel username;
	String userId;
	String phoneNo, address, password,userName;

	/**
	 * Create the frame.
	 */
	public MainView(Observable observable) {
<<<<<<< HEAD

=======
		
		
>>>>>>> branch 'master' of https://github.com/ironhiro/OnlineBanking.git
		this.observable = observable;
		observable.addObserver(this);
		setTitle("WH Bank");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JButton btnNewButton = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		btnNewButton.addActionListener(new ActionListener() {
<<<<<<< HEAD
			public void actionPerformed(ActionEvent arg0) { //마이페이지 버튼
				c = new OpenMyPage(observable);
=======
			public void actionPerformed(ActionEvent arg0) {
				Controller c = new OpenMyPage(MainView.this);
>>>>>>> branch 'master' of https://github.com/ironhiro/OnlineBanking.git
				c.execute();
			}
		});
		btnNewButton.setBounds(288, 15, 123, 27);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(59, 168, 312, 27);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC124\uB41C \uACC4\uC88C\uD604\uD669");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel.setBounds(29, 136, 132, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4!");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(198, 87, 132, 27);
		contentPane.add(lblNewLabel_1);
		
		username = new JLabel("");
		username.setFont(new Font("굴림", Font.BOLD, 22));
		username.setBounds(111, 89, 78, 27);
		contentPane.add(username);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(29, 217, 370, 143);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel account_type = new JLabel("");
		account_type.setForeground(Color.RED);
		account_type.setFont(new Font("굴림", Font.PLAIN, 22));
		account_type.setBounds(17, 15, 215, 21);
		panel.add(account_type);
		
		JLabel account_No = new JLabel("");
		account_No.setFont(new Font("굴림", Font.PLAIN, 22));
		account_No.setBounds(210, 15, 143, 21);
		panel.add(account_No);
		
		JLabel account_balance = new JLabel("");
		account_balance.setFont(new Font("굴림", Font.BOLD, 24));
		account_balance.setBounds(83, 77, 176, 39);
		panel.add(account_balance);
		
		JLabel label_won = new JLabel("\uC6D0");
		label_won.setBounds(261, 83, 40, 21);
		if(comboBox.getItemCount()==0)
		{
			label_won.setText("");
		}
		else
		{
			label_won.setText("원");
		}
		panel.add(label_won);
		
		JLabel label_balance = new JLabel("\uC794\uC561");
		label_balance.setFont(new Font("굴림", Font.PLAIN, 15));
		label_balance.setBounds(12, 59, 341, 21);
		if(comboBox.getItemCount()==0)
		{
			label_balance.setText("개설된 계좌가 없습니다. 계좌를 추가해주세요.");
		}
		else
		{
			label_balance.setText("잔액");
		}
		panel.add(label_balance);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(17, 62, 394, 433);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\uC785\uAE08");
		btnNewButton_1.setBounds(17, 312, 69, 41);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uCD9C\uAE08");
		btnNewButton_2.setBounds(89, 312, 69, 41);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uACC4\uC88C\uC774\uCCB4");
		btnNewButton_3.setBounds(162, 312, 112, 41);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uAC70\uB798\uB0B4\uC5ED");
		btnNewButton_4.setBounds(276, 312, 107, 41);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\uACC4\uC88C \uB4F1\uB85D");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //계좌 등록
				AccountRegistrationView mainFrame = new AccountRegistrationView(observable);
				mainFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				mainFrame.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(17, 363, 360, 55);
		panel_1.add(btnNewButton_5);
		btnNewButton_4.addActionListener(new ActionListener() { //거래내역 버튼
			public void actionPerformed(ActionEvent e) {
				c = new OpenTransactionHistoryView();
				c.execute();
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {//계좌이체 버튼
			public void actionPerformed(ActionEvent e) {
				c = new OpenAccountTransferView();
				c.execute();
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() { //출금 버튼
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				WithdrawView withdrawView = new WithdrawView();
				withdrawView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				withdrawView.setVisible(true);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepositView depositView = new DepositView();
				depositView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				depositView.setVisible(true);
=======
				c = new OpenWithdrawView();
				c.execute();
>>>>>>> branch 'master' of https://github.com/ironhiro/OnlineBanking
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() { //입금 버튼
			public void actionPerformed(ActionEvent e) {				
				c = new OpenDepoistView();
				c.execute();
			}
		});
	}



	@Override
	public void update(Observable obs, Object arg) {
		// TODO Auto-generated method stub
		/*
		ManagerModeView mv = new ManagerModeView();
		String s = mv.getNewAccountName();
		NewItemPopupView adNewAccount = new NewItemPopupView(s);
		adNewAccount.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		adNewAccount.setVisible(true);
		*/
		if(obs instanceof Member) {
			Member member = (Member)obs;
			userName = member.getName();
			username.setText(userName);
			userId = member.getID();
			password = member.getPassword();
			address = member.getAddress();
		}
		else if(obs instanceof Account) {
			
		}
	}
}
