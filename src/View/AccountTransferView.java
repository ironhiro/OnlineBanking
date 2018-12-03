package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AccountTransferView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	

	/**
	 * Create the frame.
	 */
	public AccountTransferView() {
		setTitle("\uACC4\uC88C \uC774\uCCB4");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 480, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(34, 39, 394, 178);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\uC790\uC720\uC785\uCD9C\uAE08\uACC4\uC88C");
		label.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		label.setBounds(17, 30, 167, 21);
		panel.add(label);
		
		JLabel label_1 = new JLabel("1011-15234-07");
		label_1.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		label_1.setBounds(218, 29, 143, 21);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\uC794\uC561");
		label_2.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		label_2.setBounds(81, 66, 47, 21);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("1,555,569,030");
		label_3.setFont(new Font("±¼¸²", Font.BOLD, 24));
		label_3.setBounds(117, 84, 176, 39);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("\uC6D0");
		label_4.setBounds(295, 90, 40, 21);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("\uAC70\uB798\uD55C\uB3C4");
		label_5.setForeground(Color.RED);
		label_5.setBounds(17, 136, 78, 21);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("3,000,000 \uC6D0");
		label_6.setForeground(Color.RED);
		label_6.setBounds(106, 136, 121, 21);
		panel.add(label_6);
		
		JLabel lblNewLabel = new JLabel("\uBC1B\uB294 \uBD84");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel.setBounds(44, 232, 78, 21);
		contentPane.add(lblNewLabel);
		
		JLabel label_7 = new JLabel("\uC740\uD589");
		label_7.setBounds(54, 268, 57, 28);
		contentPane.add(label_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(17, 15, 424, 500);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"WH\uC740\uD589"}));
		comboBox.setBounds(103, 253, 216, 27);
		panel_1.add(comboBox);
		
		JLabel label_8 = new JLabel("\uACC4\uC88C\uBC88\uD638");
		label_8.setBounds(17, 288, 78, 28);
		panel_1.add(label_8);
		
		textField = new JTextField();
		textField.setBounds(103, 289, 216, 27);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setBounds(328, 252, 79, 65);
		panel_1.add(btnNewButton);
		
		JLabel label_9 = new JLabel("\uAE08\uC561");
		label_9.setFont(new Font("±¼¸²", Font.BOLD, 18));
		label_9.setBounds(27, 331, 78, 21);
		panel_1.add(label_9);
		
		textField_1 = new JTextField();
		textField_1.setBounds(67, 367, 289, 27);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC6D0");
		lblNewLabel_1.setBounds(363, 370, 44, 21);
		panel_1.add(lblNewLabel_1);
		
		JLabel label_10 = new JLabel("\uB0B4\uD1B5\uC7A5 \uD45C\uC2DC");
		label_10.setFont(new Font("±¼¸²", Font.BOLD, 18));
		label_10.setBounds(27, 409, 125, 21);
		panel_1.add(label_10);
		
		textField_2 = new JTextField();
		textField_2.setText("    \uBBF8 \uC785\uB825\uC2DC \uBC1B\uB294 \uBD84 \uC774\uB984 \uD45C\uC2DC");
		textField_2.setBounds(67, 445, 299, 27);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\uC774\uCCB4");
		btnNewButton_1.setBounds(17, 518, 424, 44);
		contentPane.add(btnNewButton_1);
	}
}
