package View;
import Controller.*;
import Model.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerModeView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	protected static String newAccountName = "";

	

	/**
	 * Create the frame.
	 */
	public ManagerModeView() {
		Controller c = new AdForNew();

		setTitle("\uAD00\uB9AC\uC790\uBAA8\uB4DC");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 434, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC0C8\uC0C1\uD488 \uB4F1\uB85D");
		label.setFont(new Font("굴림", Font.BOLD, 21));
		label.setBounds(141, 15, 186, 30);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(169, 73, 207, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uB4F1\uB85D");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.execute();
				if(c.isSuccess())
				{
					newAccountName = textField.getText();
					JOptionPane.showMessageDialog(null,"새 상품을 성공적으로 등록하였습니다!");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"새 상품이 등록되지 못 하였습니다.");
				}
			}
		});
		btnNewButton.setBounds(83, 131, 125, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
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
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
	}

	public String getNewAccountName() {return newAccountName;}
}
