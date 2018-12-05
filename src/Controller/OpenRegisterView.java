package Controller;

import View.RegisterView;

public class OpenRegisterView implements Controller {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		RegisterView register = new RegisterView();
		register.setLocationRelativeTo(null);
		register.setVisible(true);
	}

}
