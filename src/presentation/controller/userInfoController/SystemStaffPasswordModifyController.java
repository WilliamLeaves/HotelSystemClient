package presentation.controller.userInfoController;

import VO.SystemStaffVO;
import blservice.UserInfo_blservice;
import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import main.Main;
import other.ResultMessage;

public class SystemStaffPasswordModifyController {

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
	@FXML
	private Label passwordRightLabel;
	@FXML
	private Label newPasswordRightLabel;
	@FXML
	private Label confirmPasswordRightLabel;

	private Main mainScene;
	private UserInfo_blservice blservice;
	private SystemStaffVO systemStaff;

	public SystemStaffPasswordModifyController() {
		blservice = new UserInfo_bl();
	}

	public void initialize(Main mainScene, SystemStaffVO systemStaff2) {
		// TODO Auto-generated method stub
		this.mainScene = mainScene;
		this.systemStaff = systemStaff2;
		this.SystemStaffPasswordModifyShow();
	}

	public ResultMessage SystemStaffPasswordModifyShow() {
		this.idLabel.setText(this.systemStaff.getId());
		this.nameLabel.setText(this.systemStaff.getUsername());
		this.leftIdLabel.setText(this.systemStaff.getId());
		this.leftNameLabel.setText(this.systemStaff.getUsername());
		this.passwordRightLabel.setVisible(false);
		this.newPasswordRightLabel.setVisible(false);
		this.confirmPasswordRightLabel.setVisible(false);
		return ResultMessage.SUCCESSFUL;
	}

	public void handleSave() {
		this.mainScene.showSystemStaffInfoScene(systemStaff);
	}

	public void handleBack() {
		this.mainScene.showSystemStaffInfoScene(systemStaff);
	}
}
