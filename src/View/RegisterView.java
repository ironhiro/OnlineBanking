package View;
import Controller.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class RegisterView extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField name;
	private JPasswordField password;
	private JTextField textField_2;
	private JTextField textField_3;

	

	/**
	 * Create the frame.
	 */
	public RegisterView() {
		setTitle("\uD68C\uC6D0\uAC00\uC785");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		Controller c = new Register(this);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(51, 73, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\uC774\uB984");
		label.setBounds(51, 123, 57, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label_1.setBounds(51, 176, 57, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		label_2.setBounds(51, 219, 78, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_3.setBounds(51, 261, 57, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\uC131\uBCC4");
		label_4.setBounds(51, 301, 57, 15);
		contentPane.add(label_4);
		
		id = new JTextField();
		id.setBounds(160, 70, 162, 21);
		contentPane.add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(160, 120, 162, 21);
		contentPane.add(name);
		
		JLabel label_5 = new JLabel("\uC8FC\uC18C");
		label_5.setBounds(51, 340, 78, 15);
		contentPane.add(label_5);
		
		password = new JPasswordField();
		password.setBounds(160, 173, 162, 18);
		contentPane.add(password);
		
		JComboBox year = new JComboBox();
		year.setBounds(160, 216, 57, 21);
		for(int i=1900;i<=Calendar.YEAR; i++)
		{
			year.addItem(i);
		}
		contentPane.add(year);
		
		JComboBox month = new JComboBox();
		month.setBounds(229, 216, 44, 21);
		for(int i=1;i<=12;i++)
		{
			month.addItem(i);
		}
		contentPane.add(month);
		
		JComboBox day = new JComboBox();
		day.setBounds(285, 216, 37, 21);
		
		contentPane.add(day);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(160, 258, 162, 21);
		contentPane.add(textField_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uB0A8");
		rdbtnNewRadioButton.setBounds(160, 297, 62, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uB140");
		rdbtnNewRadioButton_1.setBounds(236, 297, 121, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(160, 337, 162, 21);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("\uB4F1\uB85D");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setBounds(51, 410, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\uCDE8\uC18C");
		button.setBounds(225, 410, 97, 23);
		contentPane.add(button);
	}
}
