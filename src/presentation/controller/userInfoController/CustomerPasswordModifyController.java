package presentation.controller.userInfoController;

import VO.CustomerVO;
import blservice.UserInfo_blservice;
import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import main.Main;
import other.ResultMessage;

public class CustomerPasswordModifyController {
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button save;
	@FXML
	private Button back;
	@FXML
	private Label idLabel;
	@FXML
	private Label nameLabel;
	@FXML
	private PasswordField passWord;
	@FXML
	private PasswordField newPassword;
	@FXML
	private PasswordField confirmPassword;

	private Main mainScene;
	private UserInfo_blservice blservice;
	private CustomerVO customer;

	public CustomerPasswordModifyController() {
		blservice = new UserInfo_bl();
	}

	public void initialize(Main mainScene, CustomerVO customer) {
		this.customer = customer;
		this.mainScene = mainScene;
		this.CustomerPasswordModifyShow(mainScene);
	}

	public ResultMessage CustomerPasswordModifyShow(Main mainScene) {
		this.mainScene = mainScene;
		leftIdLabel.setText(customer.getId());
		leftNameLabel.setText(customer.getUsername());
		idLabel.setText(customer.getId());
		nameLabel.setText(customer.getUsername());
		return ResultMessage.SUCCESSFUL;

	}
	public void handleBack(){
		this.mainScene.showCustomerInfoScene(customer);
	}
	public void handleSave(){
		this.mainScene.showCustomerInfoScene(customer);
	}
}
