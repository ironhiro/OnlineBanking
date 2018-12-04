package Controller;
import View.*;
import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.text.ParseException;

public class Register implements Controller {

	RegisterView register;
	boolean isValid = false;
		
    public Register(RegisterView register) {
    	this.register = register;
    }

    public void execute() {
        // TODO implement here
    	String inputID = register.getIDField();
    	String inputPass = register.getPassField();
    	String inputName = register.getMemberName();
    	Boolean inputGender = register.getGender();
    	String inputAddress = register.getAddress();
    	String inputPhoneNo = register.getPhoneNo();
    	Date inputBirthday = null;
		try {
			inputBirthday = register.getBirthday();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    	
    	
    	Connection conn = null;
		Statement st = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/bank?serverTimezone=UTC&useSSL=false", "root","");
			st = conn.createStatement();
			
			String sql = "select * FROM member WHERE member_id='"+inputID+"'";
			ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
				isValid = false;
			}
			else
			{
				sql = "INSERT INTO member VALUES ('" + inputID + "', '" + inputPass+"', '"+inputName+"', '"+inputPhoneNo+"', '" +inputAddress + "', " + inputGender + ", '"+ inputBirthday + "')";
				st.executeUpdate(sql);
				isValid = true;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

	@Override
	public boolean isSuccess() {
		// TODO Auto-generated method stub
		if(isValid)
			return true;
		else
			return false;
	}

}