package View;
import Controller.*;
import Model.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerModeLoginView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	

	/**
	 * Create the frame.
	 */
	public ManagerModeLoginView() {
		Controller c = new AdministerLogin(this);
		
		setTitle("\uAD00\uB9AC\uC790\uBAA8\uB4DClogin");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 469, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC544\uC774\uB514");
		label.setBounds(54, 29, 87, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		label_1.setBounds(54, 82, 116, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(187, 26, 203, 21);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(187, 77, 203, 21);
		contentPane.add(passwordField);
		
		JButton button = new JButton("\uB85C\uADF8\uC778");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.execute();			
			}
		});
		button.setBounds(93, 128, 109, 36);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\uCDE8\uC18C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(252, 128, 116, 36);
		contentPane.add(button_1);
	}
	
	public String getId()
	{
		return textField.getText();
	}
	
	public char[] getPass()
	{
		return passwordField.getPassword();
	}
}
