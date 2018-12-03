package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class DepositView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	

	/**
	 * Create the frame.
	 */
	public DepositView() {
		setTitle("\uC785\uAE08");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 415, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\uC785\uAE08\uD560 \uACC4\uC88C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(17, 15, 341, 83);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uC790\uC720\uC785\uCD9C\uAE08\uACC4\uC88C");
		lblNewLabel_1.setBounds(17, 34, 126, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1011-15234-07");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(175, 32, 149, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("\uC785\uAE08 \uAE08\uC561");
		lblNewLabel.setBounds(27, 123, 134, 21);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(37, 159, 287, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uC6D0");
		lblNewLabel_3.setBounds(333, 165, 35, 21);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("\uCDE8\uC18C");
		btnNewButton.setBounds(59, 219, 125, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC785\uAE08");
		btnNewButton_1.setBounds(216, 219, 125, 44);
		contentPane.add(btnNewButton_1);
	}

}
