package Controller;
import java.util.*;

import javax.swing.JOptionPane;

import View.*;

public class AdForNew implements Controller {

	ManagerModeView manager;
    public AdForNew(ManagerModeView manager) {
    	this.manager = manager;
    }

    public void execute() {
        // TODO implement here
    	String newAccountName = manager.getNewAccountName();
		JOptionPane.showMessageDialog(null,"�� ��ǰ�� ���������� ����Ͽ����ϴ�!");
    }

	

}