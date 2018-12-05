package Controller;

import View.LoginView;

public class OpenLoginView implements Controller {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		LoginView login = new LoginView();
		login.setLocationRelativeTo(null);
		login.setVisible(true);
	}

}
