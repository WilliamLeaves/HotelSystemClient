package blservice.impl;

import blservice.Login_blservice;

public class Login_bl implements Login_blservice {

	public Boolean comfirm(String user_id, String user_password) {
		if (user_id == "15105199359" && user_password == "qwet1234")
			return true;
		else
			return false;
	}

}
