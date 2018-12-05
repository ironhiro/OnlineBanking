package Controller;

import View.ManagerModeLoginView;

public class OpenManagerModeLoginView implements Controller{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ManagerModeLoginView register = new ManagerModeLoginView();
		register.setLocationRelativeTo(null);
		register.setVisible(true);
	}

}
