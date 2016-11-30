package presentation.controller.registerController;

import VO.SystemStaffVO;
import VO.UserVO;
import blservice.UserInfo_blservice;
import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import main.Main;
import other.ResultMessage;

public class RegisterController {

	@FXML
	private TextField name;
	@FXML
	private TextField password;
	@FXML
	private TextField confirmPassword;
	@FXML
	private TextField setDistrict;
	@FXML
	private DatePicker birthday;
	@FXML
	private Button confirm;
	@FXML
	private Button cancel;
	
	private Main mainScene;
	private UserVO user;
	private UserInfo_blservice user_blservice;
	
	public RegisterController(){
		user_blservice = new UserInfo_bl();
	}
	
	public ResultMessage RegisterShow(Main mainScene) {
		this.mainScene = mainScene;
		return ResultMessage.SUCCESSFUL;
		
	}
	
}
