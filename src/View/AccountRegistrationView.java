package View;
import java.awt.BorderLayout;
import Controller.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import javax.swing.border.TitledBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class AccountRegistrationView extends JFrame implements Observer{

	private String newAccountNum; //자동으로 생성되는 계좌 번호
	
	private JPanel contentPane;
	private JLabel label;
	private JPanel panel;
	private JLabel lblNewLabel_2;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_3;
	private JTextField textField;


	

	/**
	 * Create the frame.
	 */
	public AccountRegistrationView() {
		setTitle("\uACC4\uC88C \uB4F1\uB85D");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 467, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Controller c = new AddAccount(this);
		
		label = new JLabel("\uACC4\uC88C \uC720\uD615");
		label.setBounds(56, 42, 78, 30);
		contentPane.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC790\uC720\uC785\uCD9C\uAE08\uACC4\uC88C", "\uB9C8\uC774\uB108\uC2A4\uACC4\uC88C"}));
		comboBox.setBounds(158, 44, 244, 27);
		contentPane.add(comboBox);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\uB9C8\uC774\uB108\uC2A4 \uACC4\uC88C\uC77C \uACBD\uC6B0", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(56, 99, 362, 96);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_2 = new JLabel("\uC2E0\uC6A9 \uB4F1\uAE09");
		lblNewLabel_2.setBounds(29, 44, 78, 21);
		panel.add(lblNewLabel_2);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1\uB4F1\uAE09", "2\uB4F1\uAE09", "3\uB4F1\uAE09", "4\uB4F1\uAE09", "5\uB4F1\uAE09", "6\uB4F1\uAE09", "7\uB4F1\uAE09", "8\uB4F1\uAE09"}));
		comboBox_1.setBounds(124, 41, 210, 27);
		if((String)comboBox.getSelectedItem() == "마이너스통장")
		{
			comboBox_1.setEnabled(true);
		}
		panel.add(comboBox_1);
		
		lblNewLabel_3 = new JLabel("\uAC70\uB798\uD55C\uB3C4");
		lblNewLabel_3.setBounds(56, 236, 78, 33);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(151, 236, 251, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uB4F1\uB85D");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.execute();
			}
		});
		btnNewButton.setBounds(84, 295, 125, 56);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.setBounds(247, 295, 125, 56);
		contentPane.add(btnNewButton_1);
	}




	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

	/*
	String makeAccountNum() {
		String newAccountNum = "1011";
		int value;
		Random r = new Random();
		for(int i = 0; i < 7; i++)
		{
			value = r.nextInt(10);
			newAccountNum += Integer.toString(value);
		}
		return newAccountNum;
	}
	
	String getNewAccountNum() {return newAccountNum;}
	*/
}
