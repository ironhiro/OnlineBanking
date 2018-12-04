package Controller;
import View.*;
import Model.*;
import java.sql.*;

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
				Member member = new Normal(userid,userpassword,userName,userPhoneNo,userAddr,userGender,userBirth);
				
				JOptionPane.showMessageDialog(null, "로그인 성공했습니다.");
				view.dispose();
				MainView mainFrame = new MainView();
				member.addObserver(mainFrame);
				mainFrame.setLocationRelativeTo(null);
				mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				mainFrame.setVisible(true);
			
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
