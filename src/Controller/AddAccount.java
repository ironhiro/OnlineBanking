package Controller;
import View.AccountRegistrationView;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.*;

import java.sql.*;
import java.sql.Date;

public class AddAccount implements Controller {
	AccountRegistrationView accountRegister;
	
    public AddAccount(AccountRegistrationView accountRegister) {
    	this.accountRegister = accountRegister;
    }

    public void execute() {
        // TODO implement here
        String accountName = accountRegister.getSelectedItems();
        String credit_rate = null;
        String currentId = accountRegister.getId();
        int limit = accountRegister.getLimit();
        if(accountName=="마이너스통장")
        	credit_rate = accountRegister.getMinusSelectedItems();
        Connection conn = null;
		Statement st = null;
		Account account = null;
		int accountType = 0;
		switch(accountName)
		{
		case "자유입출금통장":
			accountType=1;
			account = new FreeAccount();
			break;
		case "마이너스통장":
			accountType=2;
			account = new MinusAccount();
			break;
		case "적금통장":
			JOptionPane.showMessageDialog(null, "준비중입니다.");
			accountRegister.dispose();
			break;
		}
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/bank?serverTimezone=UTC&useSSL=false", "root","");
			st = conn.createStatement();
			
			String sql = "insert into account(account_type,member_id) values ('" + accountType + "', '" + currentId + "')";
			st.executeUpdate(sql);
			
			JOptionPane.showMessageDialog(null, "등록이 완료되었습니다.");
			sql = "select * FROM account WHERE member_id='" + currentId + "'";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				int accountNo = rs.getInt(1);
				int balance = rs.getInt(3);
				account.setValues(balance, accountNo);
			}
			
			
			
			
			
			
			accountRegister.dispose();
			
			
		} catch(Exception ex){
			
			ex.printStackTrace();
		}
    }

	

}