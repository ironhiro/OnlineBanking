package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class AccountRegistrationView extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JLabel lblNewLabel_1;
	private JPanel panel;
	private JLabel lblNewLabel_2;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_3;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountRegistrationView frame = new AccountRegistrationView();
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
	public AccountRegistrationView() {
		setTitle("\uACC4\uC88C \uB4F1\uB85D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uACC4\uC88C \uBC88\uD638");
		lblNewLabel.setBounds(56, 26, 78, 30);
		contentPane.add(lblNewLabel);
		
		label = new JLabel("\uACC4\uC88C \uC720\uD615");
		label.setBounds(56, 71, 78, 30);
		contentPane.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC790\uC720\uC785\uCD9C\uAE08\uACC4\uC88C"}));
		comboBox.setBounds(158, 73, 244, 27);
		contentPane.add(comboBox);
		
		lblNewLabel_1 = new JLabel("1011-15234-08");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(158, 31, 244, 25);
		contentPane.add(lblNewLabel_1);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\uB9C8\uC774\uB108\uC2A4 \uACC4\uC88C\uC77C \uACBD\uC6B0", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(56, 125, 362, 96);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_2 = new JLabel("\uC2E0\uC6A9 \uB4F1\uAE09");
		lblNewLabel_2.setBounds(29, 44, 78, 21);
		panel.add(lblNewLabel_2);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1\uB4F1\uAE09", "2\uB4F1\uAE09", "3\uB4F1\uAE09", "4\uB4F1\uAE09", "5\uB4F1\uAE09", "6\uB4F1\uAE09", "7\uB4F1\uAE09", "8\uB4F1\uAE09"}));
		comboBox_1.setBounds(124, 41, 210, 27);
		panel.add(comboBox_1);
		
		lblNewLabel_3 = new JLabel("\uAC70\uB798\uD55C\uB3C4");
		lblNewLabel_3.setBounds(56, 236, 78, 33);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(151, 236, 251, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uB4F1\uB85D");
		btnNewButton.setBounds(84, 295, 125, 56);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.setBounds(247, 295, 125, 56);
		contentPane.add(btnNewButton_1);
	}
}
