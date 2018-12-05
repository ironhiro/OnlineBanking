package Controller;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.Member;
import Model.Normal;
import Model.Product;
import View.*;

public class AdForNew implements Controller {

	ManagerModeView manager;
    public AdForNew(ManagerModeView manager) {
    	this.manager = manager;
    }

    public void execute() {
        // TODO implement here
    	String newAccountName = manager.getNewAccountName();
    	Calendar now = Calendar.getInstance();
    	now.setTimeInMillis(System.currentTimeMillis());
    	
    	String s = now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH)+1) + "-" + now.get(Calendar.DAY_OF_MONTH);
    	
    	Connection conn = null;
		Statement st = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/bank?serverTimezone=UTC&useSSL=false", "root","");
			st = conn.createStatement();
			
			String sql = "select * FROM product where account_name='" + newAccountName + "'";
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next())
			{
				JOptionPane.showMessageDialog(null, "중복된 상품명입니다.");
			}
			else
			{
				sql = "insert INTO product(account_name, account_date) values ('" + newAccountName + "' ,'"+ s + "')";
				st.executeUpdate(sql);
				JOptionPane.showMessageDialog(null, "등록 성공했습니다.");
			}
			
			
			
			
				
			
		} catch(Exception ex){
			
			ex.printStackTrace();
		}
		
    }

	

}