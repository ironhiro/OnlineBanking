package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InitView extends JFrame {

	private JPanel contentPane;
	Object currentWindow = this;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitView frame = new InitView();
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
	public InitView() {
		setTitle("WHBank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegister = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegisterView register = new RegisterView();
				register.setVisible(true);
			}
		});
		btnRegister.setToolTipText("");
		btnRegister.setBounds(147, 56, 140, 23);
		contentPane.add(btnRegister);
		
		JButton btnLogin = new JButton("\uB85C\uADF8\uC778");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginView login = new LoginView();
				login.addWindowListener(new WindowAdapter()
				{
					
				}
				);
				login.setVisible(true);
				
				
			}
		});
		btnLogin.setBounds(147, 107, 140, 23);
		contentPane.add(btnLogin);
		
		
		JButton btnNewButton_1 = new JButton("About");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "WHBank ver 0.10", "Information", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		btnNewButton_1.setBounds(147, 161, 140, 23);
		
		contentPane.add(btnNewButton_1);
		
		
		
		JButton button = new JButton("\uAD00\uB9AC\uC790 \uBAA8\uB4DC \uB85C\uADF8\uC778");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerModeLoginView register = new ManagerModeLoginView();
				register.setVisible(true);
			}
		});
		button.setBounds(229, 225, 199, 29);
		contentPane.add(button);
	}
}
