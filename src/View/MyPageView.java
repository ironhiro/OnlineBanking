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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyPageView extends JFrame {

	private JPanel contentPane;
	private JTextField nameInfo;
	private JTextField idInfo;
	private JPasswordField passInfo;
	private JPasswordField phoneInfo;
	private JButton changePassButton;

	

	/**
	 * Create the frame.
	 */
	public MyPageView() {
		setTitle("\uB9C8\uC774\uD398\uC774\uC9C0");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 497, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC774\uB984");
		label.setBounds(29, 28, 84, 31);
		contentPane.add(label);
		
		nameInfo = new JTextField();
		nameInfo.setEditable(false);
		nameInfo.setBounds(122, 35, 195, 27);
		contentPane.add(nameInfo);
		nameInfo.setColumns(10);
		
		JLabel lblId = new JLabel("  ID");
		lblId.setBounds(29, 73, 84, 31);
		contentPane.add(lblId);
		
		idInfo = new JTextField();
		idInfo.setEditable(false);
		idInfo.setColumns(10);
		idInfo.setBounds(122, 77, 195, 27);
		contentPane.add(idInfo);
		
		JLabel label_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label_1.setBounds(29, 113, 84, 31);
		contentPane.add(label_1);
		
		passInfo = new JPasswordField();
		passInfo.setBounds(122, 117, 195, 27);
		contentPane.add(passInfo);
		
		changePassButton = new JButton("\uBE44\uBC00\uBC88\uD638 \uBCC0\uACBD");
		changePassButton.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		changePassButton.setBounds(334, 114, 125, 31);
		contentPane.add(changePassButton);
		
		JLabel label_2 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_2.setBounds(29, 166, 84, 31);
		contentPane.add(label_2);
		
		phoneInfo = new JPasswordField();
		phoneInfo.setBounds(122, 168, 195, 27);
		contentPane.add(phoneInfo);
		
		JButton updateButton = new JButton("\uD68C\uC6D0 \uC815\uBCF4 \uC218\uC815");
		updateButton.setBounds(95, 225, 164, 44);
		contentPane.add(updateButton);
		
		JButton cancelButton = new JButton("\uCDE8\uC18C");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		cancelButton.setBounds(290, 225, 125, 44);
		contentPane.add(cancelButton);
	}
}
