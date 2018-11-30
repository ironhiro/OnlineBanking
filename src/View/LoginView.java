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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_id = new JLabel("\uC544\uC774\uB514");
		label_id.setBounds(36, 65, 87, 15);
		contentPane.add(label_id);
		
		JLabel label_password = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		label_password.setBounds(36, 118, 116, 15);
		contentPane.add(label_password);
		
		textField = new JTextField();
		textField.setBounds(169, 62, 203, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(169, 113, 203, 21);
		contentPane.add(passwordField);
		
		JButton button = new JButton("\uB85C\uADF8\uC778");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainView mainFrame = new MainView();
				mainFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				mainFrame.setVisible(true);
				
			}
		});
		button.setBounds(75, 158, 109, 36);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\uCDE8\uC18C");
		button_1.setBounds(234, 158, 116, 36);
		contentPane.add(button_1);
	}
}
