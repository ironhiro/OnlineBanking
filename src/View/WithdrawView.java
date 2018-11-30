package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class WithdrawView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WithdrawView frame = new WithdrawView();
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
	public WithdrawView() {
		setTitle("\uCD9C\uAE08");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uCD9C\uAE08\uD560 \uACC4\uC88C");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel.setBounds(17, 15, 129, 21);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(17, 47, 415, 157);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uC790\uC720\uC785\uCD9C\uAE08\uACC4\uC88C");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(17, 15, 167, 21);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("1011-15234-07");
		label.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		label.setBounds(218, 14, 143, 21);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\uC794\uC561");
		label_1.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		label_1.setBounds(81, 51, 47, 21);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("1,555,569,030");
		label_2.setFont(new Font("±¼¸²", Font.BOLD, 24));
		label_2.setBounds(117, 69, 176, 39);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\uC6D0");
		label_3.setBounds(295, 75, 40, 21);
		panel.add(label_3);
		
		JLabel lblNewLabel_2 = new JLabel("\uAC70\uB798\uD55C\uB3C4");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(17, 121, 78, 21);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3,000,000 \uC6D0");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(106, 121, 121, 21);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uCD9C\uAE08 \uAE08\uC561");
		lblNewLabel_4.setBounds(27, 219, 78, 21);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(51, 255, 316, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\uC6D0");
		lblNewLabel_5.setBounds(370, 269, 30, 21);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("\uCDE8\uC18C");
		btnNewButton.setBounds(46, 320, 160, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCD9C\uAE08");
		btnNewButton_1.setBounds(255, 320, 153, 47);
		contentPane.add(btnNewButton_1);
	}

}
