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
		String id = view.getTextField().getText();
		String password = view.getPasswordField().getPassword().toString();
		
		Connection conn = null;
	}
	
	boolean isSuccess()
	{
		if(isAuthenticated)
			return true;
		else
			return false;
	}

}
