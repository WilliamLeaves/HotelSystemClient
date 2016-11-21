package presentation.controller.loginController;

import presentation.view.login_ui.LoginControllerService;

public class LoginController implements LoginControllerService {

	public Boolean comfirm(String user_id, String user_password) {
		if (user_id == "15105199359" && user_password == "qwer123")
			return true;
		else
			return false;
	}

}
