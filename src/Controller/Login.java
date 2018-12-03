package Controller;
import View.LoginView;
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
			}
			
			
			
			if(inputpassword.equals(userpassword))
				isAuthenticated = true;
			
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
