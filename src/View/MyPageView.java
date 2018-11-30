package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;

public class MyPageView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtGodwh;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyPageView frame = new MyPageView();
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
	public MyPageView() {
		setTitle("\uB9C8\uC774\uD398\uC774\uC9C0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC774\uB984");
		label.setBounds(29, 28, 84, 31);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setText("\uC870\uC6A9\uD604");
		textField.setEditable(false);
		textField.setBounds(122, 35, 195, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("  ID");
		lblId.setBounds(29, 73, 84, 31);
		contentPane.add(lblId);
		
		txtGodwh = new JTextField();
		txtGodwh.setText("godWH");
		txtGodwh.setEditable(false);
		txtGodwh.setColumns(10);
		txtGodwh.setBounds(122, 77, 195, 27);
		contentPane.add(txtGodwh);
		
		JLabel label_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label_1.setBounds(29, 113, 84, 31);
		contentPane.add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 117, 195, 27);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("\uBE44\uBC00\uBC88\uD638 \uBCC0\uACBD");
		btnNewButton.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnNewButton.setBounds(334, 114, 125, 31);
		contentPane.add(btnNewButton);
		
		JLabel label_2 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_2.setBounds(29, 166, 84, 31);
		contentPane.add(label_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(122, 168, 195, 27);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0 \uC815\uBCF4 \uC218\uC815");
		btnNewButton_1.setBounds(95, 225, 164, 44);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uCDE8\uC18C");
		btnNewButton_2.setBounds(290, 225, 125, 44);
		contentPane.add(btnNewButton_2);
	}
}
