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
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.*;
import java.sql.Date;

import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ItemEvent;

public class RegisterView extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField name;
	private JPasswordField password;
	private JTextField phoneNo;
	private JTextField address;
	private int selectedMonth = 1;
	private int selectedYear = 1900;
	private int selectedDate;
	private int dayNum;
	private boolean gender;

	/**
	 * Create the frame.
	 */
	public RegisterView() {

		setTitle("\uD68C\uC6D0\uAC00\uC785");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		Controller c = new Register(this);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(51, 73, 57, 15);
		contentPane.add(lblNewLabel);

		JLabel label = new JLabel("\uC774\uB984");
		label.setBounds(51, 123, 57, 15);
		contentPane.add(label);

		JLabel label_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label_1.setBounds(51, 176, 92, 15);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		label_2.setBounds(51, 219, 78, 15);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_3.setBounds(51, 261, 97, 15);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("\uC131\uBCC4");
		label_4.setBounds(51, 301, 57, 15);
		contentPane.add(label_4);

		id = new JTextField();
		id.setBounds(160, 70, 162, 21);
		contentPane.add(id);
		id.setColumns(10);

		name = new JTextField();
		name.setColumns(10);
		name.setBounds(160, 120, 162, 21);
		contentPane.add(name);

		JLabel label_5 = new JLabel("\uC8FC\uC18C");
		label_5.setBounds(51, 340, 78, 15);
		contentPane.add(label_5);

		password = new JPasswordField();
		password.setBounds(160, 173, 162, 18);
		contentPane.add(password);

		JComboBox year = new JComboBox();
		year.setBounds(160, 216, 57, 21);
		for (int i = 1900; i <= 2018; i++) {
			// Calendar.YEAR
			year.addItem(i);
		}
		contentPane.add(year);

		JComboBox month = new JComboBox();

		month.setBounds(229, 216, 44, 21);
		for (int i = 1; i <= 12; i++) {
			month.addItem(i);
		}

		contentPane.add(month);

		JComboBox day = new JComboBox();
		day.setBounds(278, 216, 44, 21);
		for (int i = 1; i <= 31; i++) {
			day.addItem(i);
		}
		contentPane.add(day);

		month.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// String s = (String) e.getItem();
				day.removeAllItems();
				selectedMonth = (int) e.getItem();

				if (selectedMonth % 2 == 0)// 짝수 월
				{
					if (selectedMonth == 2) {
						dayNum = 28;
					} else if (selectedMonth == 8 || selectedMonth == 10 || selectedMonth == 12) {
						dayNum = 31;
					} else
						dayNum = 30;
				} else// 홀수 월
				{
					if (selectedMonth < 8) {
						dayNum = 31;
					} else
						dayNum = 30;
				}
				for (int i = 1; i <= dayNum; i++) {
					day.addItem(i);
				}
			}
		});

		phoneNo = new JTextField();
		phoneNo.setColumns(10);
		phoneNo.setBounds(160, 258, 162, 21);
		contentPane.add(phoneNo);

		JRadioButton male = new JRadioButton("\uB0A8");
		male.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) { // 남자 라디오 버튼
				gender = false;
			}
		});
		male.setBounds(160, 297, 62, 23);
		contentPane.add(male);

		JRadioButton female = new JRadioButton("\uC5EC");
		female.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) { // 여자 라디오 버튼
				gender = true;
			}
		});
		female.setBounds(236, 297, 121, 23);
		contentPane.add(female);

		ButtonGroup genderType = new ButtonGroup();
		genderType.add(male);
		genderType.add(female);

		address = new JTextField();
		address.setColumns(10);
		address.setBounds(160, 337, 162, 21);
		contentPane.add(address);

		JButton btnNewButton = new JButton("\uB4F1\uB85D");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectedYear = (int) year.getSelectedItem();
				selectedMonth = (int) month.getSelectedItem();
				selectedDate = (int) day.getSelectedItem();
				
				c.execute();
				if (c.isSuccess()) {
					JOptionPane.showMessageDialog(null, "회원 등록이 완료 되었습니다!");
					RegisterView.this.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "회원 등록이 실패하였습니다.");
				}

			}
		});
		btnNewButton.setBounds(51, 410, 97, 23);
		contentPane.add(btnNewButton);

		JButton button = new JButton("\uCDE8\uC18C");
		button.setBounds(225, 410, 97, 23);
		contentPane.add(button);
	}

	public String getIDField() {
		return id.getText();
	}

	public String getPassField() {
		String s = new String(password.getPassword());
		return s;
	}
	
	public String getMemberName()
	{
		return name.getText();
	}
	
	public Date getBirthday() throws ParseException
	{
		String s = selectedYear + "/" + selectedMonth + "/" + selectedDate;
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		java.util.Date date = sdf1.parse(s);
		Date birthday = new Date(date.getTime());
		return birthday;
	}
	
	public String getPhoneNo()
	{
		return phoneNo.getText();
	}
	
	public boolean getGender()
	{
		return gender;
	}
	
	public String getAddress()
	{
		return address.getText();
	}
	
	
}
