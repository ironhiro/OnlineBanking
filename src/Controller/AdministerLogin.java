package Controller;
import View.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.*;

public class AdministerLogin implements Controller {
	ManagerModeLoginView admin;
	boolean isCorrect = false;
	
	public AdministerLogin(ManagerModeLoginView admin)
	{
		this.admin = admin;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		String id = admin.getId();
		char[] c = admin.getPass();
		String password = new String(c);
		
		String userid = "", userpassword ="",username="";
		Connection conn = null;
		Statement st = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/bank?serverTimezone=UTC&useSSL=false", "root","");
			st = conn.createStatement();
			
			String sql = "select * FROM member WHERE member_id='" + id + "' AND member_type=0";
			
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				userid = rs.getString(1);
				userpassword = rs.getString(2);
				username = rs.getString(3);
			}
			
			if(password.equals(userpassword))
			{
				JOptionPane.showMessageDialog(null, username+"님 환영합니다.");
				ManagerModeView managerFrame = new ManagerModeView();
				managerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				managerFrame.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"아이디 또는 비밀번호가 맞지 않습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	

}
