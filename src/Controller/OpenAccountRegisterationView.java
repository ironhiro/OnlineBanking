package Controller;
import View.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.*;
public class OpenAccountRegisterationView implements Controller {
	
	String userId;
	public OpenAccountRegisterationView(String userId)
	{
		this.userId = userId;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement st = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/bank?serverTimezone=UTC&useSSL=false", "root","");
			st = conn.createStatement();
			
			String sql = "select * FROM product";
			ResultSet rs = st.executeQuery(sql);
			ArrayList<String> name = new ArrayList<String>();
			ArrayList<Date> date = new ArrayList<Date>();
			
			while(rs.next())
			{
				name.add(rs.getString(2));
				date.add(rs.getDate(3));
			}
			
			Product p = new Product();
			AccountRegistrationView mainFrame = new AccountRegistrationView(p,userId);
			for(int i=0; i<name.size();i++)
			{
				p.setData(name.get(i), date.get(i));
			}
			mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			mainFrame.setVisible(true);
		} catch(Exception ex){
			
			ex.printStackTrace();
		}
		
		
		
	}

}
