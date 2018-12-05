package Controller;
import View.*;
import Model.*;
import java.sql.*;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login implements Controller {

	LoginView view;
	
	
	public Login(LoginView view)
	{
		this.view = view;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		String inputid = view.getTextField().getText();
		char[] pass=view.getPasswordField().getPassword();
		String inputpassword = new String(pass);
		
		String userid= "";
		String userpassword = "";
		String userName= "", userAddr = "", userPhoneNo = "";
		
		Boolean userGender = false;
		Date userBirth = null;
		
		Connection conn = null;
		Statement st = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/bank?serverTimezone=UTC&useSSL=false", "root","");
			st = conn.createStatement();
			
			String sql = "select * FROM member WHERE member_id='" + inputid + "'";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				userid = rs.getString(1);
				userpassword = rs.getString(2);
				userName = rs.getString(3);
				userAddr = rs.getString(4);
				userPhoneNo = rs.getString(5);
				userGender = rs.getBoolean(6);
				userBirth = rs.getDate(7);
			}
			
			if(inputpassword.equals(userpassword))
			{
				JOptionPane.showMessageDialog(null, userName + "님 환영합니다.");
				view.dispose();
				Member member = new Normal();
				Calendar calendar = Calendar.getInstance();
				calendar.setTimeInMillis(System.currentTimeMillis());
				
				
				String now = calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH)+1) + "-" + calendar.get(Calendar.DAY_OF_MONTH);
				calendar.add(Calendar.DAY_OF_MONTH, -5);
				String before5days = calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH)+1) + "-" + calendar.get(Calendar.DAY_OF_MONTH);
				sql  = "select * FROM product WHERE account_date between '" + before5days + "' and '" + now + "'";
				rs = st.executeQuery(sql);
				
				String account_name;
				Date account_date;
				
				
				MainView mainFrame = new MainView(member);
				member.setValues(userid, userpassword, userName, userPhoneNo, userAddr, userGender, userBirth);
					
				mainFrame.setLocationRelativeTo(null);
				mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				mainFrame.setVisible(true);
				
				
				
				while(rs.next())
				{
					account_name = rs.getString(2);
					account_date = rs.getDate(3);
						
					Product product = new Product();
					NewItemPopupView popup = new NewItemPopupView(product);
					product.setData(account_name, account_date);
					popup.setLocationRelativeTo(null);
					popup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					popup.setVisible(true);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null,"아이디 또는 비밀번호가 맞지 않습니다.");
			}
				
			
		} catch(Exception ex){
			
			ex.printStackTrace();
		}
	}
	
	

}
