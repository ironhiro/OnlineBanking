package View;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class NewItemPopupView extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public NewItemPopupView() {
		setTitle("\uC0C8\uC0C1\uD488\uC774 \uCD9C\uC2DC\uB418\uC5C8\uC2B5\uB2C8\uB2E4.");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 505, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC801\uAE08 \uACC4\uC88C");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 29));
		lblNewLabel.setBounds(84, 56, 158, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uAC00 \uCD9C\uC2DC\uB418\uC5C8\uC2B5\uB2C8\uB2E4.");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(230, 81, 206, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblWh = new JLabel("\uC54C\uB9BC) WH \uC740\uD589\uC5D0 \uC0C8 \uC0C1\uD488\uC774 \uCD9C\uC2DC \uB418\uC5C8\uC2B5\uB2C8\uB2E4!");
		lblWh.setFont(new Font("����", Font.PLAIN, 20));
		lblWh.setForeground(Color.BLACK);
		lblWh.setBounds(27, 17, 409, 27);
		contentPane.add(lblWh);
	}

}
