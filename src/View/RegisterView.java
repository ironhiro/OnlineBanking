package View;
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

public class RegisterView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterView frame = new RegisterView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegisterView() {
		setTitle("\uD68C\uC6D0\uAC00\uC785");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
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
		
		textField = new JTextField();
		textField.setBounds(160, 70, 162, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 120, 162, 21);
		contentPane.add(textField_1);
		
		JLabel label_5 = new JLabel("\uC8FC\uC18C");
		label_5.setBounds(51, 340, 78, 15);
		contentPane.add(label_5);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(160, 173, 162, 18);
		contentPane.add(passwordField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(160, 216, 41, 21);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(213, 216, 41, 21);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(266, 216, 45, 21);
		contentPane.add(comboBox_2);
		
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
		btnNewButton.setBounds(51, 410, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\uCDE8\uC18C");
		button.setBounds(225, 410, 97, 23);
		contentPane.add(button);
	}
}
