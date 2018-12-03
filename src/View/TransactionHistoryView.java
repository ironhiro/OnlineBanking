package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class TransactionHistoryView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table_2;

	

	/**
	 * Create the frame.
	 */
	public TransactionHistoryView() {
		setTitle("\uAC70\uB798 \uB0B4\uC5ED");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 524, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(49, 32, 394, 138);
		contentPane.add(panel);
		
		JLabel label = new JLabel("\uC790\uC720\uC785\uCD9C\uAE08\uACC4\uC88C");
		label.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		label.setBounds(17, 30, 167, 21);
		panel.add(label);
		
		JLabel label_1 = new JLabel("1011-15234-07");
		label_1.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		label_1.setBounds(218, 29, 143, 21);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\uC794\uC561");
		label_2.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		label_2.setBounds(81, 66, 47, 21);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("1,555,569,030");
		label_3.setFont(new Font("±¼¸²", Font.BOLD, 24));
		label_3.setBounds(117, 84, 176, 39);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("\uC6D0");
		label_4.setBounds(295, 90, 40, 21);
		panel.add(label_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(49, 185, 394, 313);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("\uC624\uB298", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 15, 355, 247);
		panel_2.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"\uAC70\uB798 \uB0A0\uC9DC", "\uAC70\uB798\uBA85", "\uAE08\uC561"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("1\uAC1C\uC6D4", null, panel_3, null);
		panel_3.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"01\uC6D4", "02\uC6D4", "03\uC6D4", "04\uC6D4", "05\uC6D4", "06\uC6D4", "07\uC6D4", "08\uC6D4", "09\uC6D4", "10\uC6D4", "11\uC6D4", "12\uC6D4"}));
		comboBox.setBounds(245, 15, 127, 27);
		panel_3.add(comboBox);
		
		table_1 = new JTable();
		table_1.setBounds(17, 57, 355, 263);
		panel_3.add(table_1);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("\uC9C1\uC811\uC124\uC815", null, panel_4, null);
		panel_4.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(17, 15, 120, 27);
		panel_4.add(textField);
		textField.setColumns(10);
		
		JLabel label_5 = new JLabel("~");
		label_5.setBounds(141, 18, 29, 21);
		panel_4.add(label_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 15, 110, 27);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC870\uD68C");
		btnNewButton.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		btnNewButton.setBounds(289, 14, 83, 29);
		panel_4.add(btnNewButton);
		
		table_2 = new JTable();
		table_2.setBounds(17, 67, 355, 253);
		panel_4.add(table_2);
	}
}
