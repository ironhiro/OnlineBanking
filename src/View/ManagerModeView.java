package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ManagerModeView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	

	/**
	 * Create the frame.
	 */
	public ManagerModeView() {
		setTitle("\uAD00\uB9AC\uC790\uBAA8\uB4DC");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 434, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC0C8\uC0C1\uD488 \uB4F1\uB85D");
		label.setFont(new Font("±¼¸²", Font.BOLD, 21));
		label.setBounds(141, 15, 186, 30);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(169, 73, 207, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uB4F1\uB85D");
		btnNewButton.setBounds(83, 131, 125, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.setBounds(235, 131, 125, 29);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(17, 54, 379, 136);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC0C8\uC0C1\uD488 \uBA85");
		lblNewLabel.setBounds(42, 26, 88, 30);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
	}

}
