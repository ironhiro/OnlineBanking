package Controller;
import View.LoginView;
import Model.*;
import java.sql.*;

public class Login implements Controller {

	LoginView view;
	boolean isAuthenticated = false;
	
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
			
			String sql = "select * FROM member WHERE member_id=" + inputid;
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
				
				isAuthenticated = true;
				
				Member member = new Normal(userid,userpassword,userName,userPhoneNo,userAddr,userGender,userBirth);
				
			}
			else
			{
				isAuthenticated = false;
			}
				
			
		} catch(Exception ex){
			
			ex.printStackTrace();
		}
	}
	
	public boolean isSuccess()
	{
		if(isAuthenticated)
			return true;
		else
			return false;
	}

}
