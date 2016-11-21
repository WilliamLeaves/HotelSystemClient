package presentation.controller.userInfoController;

import java.util.Date;

import VO.CustomerVO;
import blservice.UserInfo_blservice;
import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.Main;
import other.ResultMessage;
import other.memberState;

public class CustomerInfoModifyController {
	@FXML
	private Button save;
	@FXML
	private Button back;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Label idLabel;
	@FXML
	private Label memberLabel;
	@FXML
	private Label creditLabel;
	@FXML
	private TextField nameTextField;
	@FXML
	private DatePicker datePicker;
	@FXML
	private TextField companyTextField;

	private Main mainScene;
	private CustomerVO customer;
	private UserInfo_blservice blservice;

	public CustomerInfoModifyController() {
		blservice = new UserInfo_bl();
	}

	public void initialize(Main mainScene) {
		this.CustomerinfoShow(mainScene);
	}

	private void getCustomerModifyFromScene() {
		this.customer = new CustomerVO();
	}

	private void getCustomerInfo(String id) {
		this.customer=this.blservice.getCustomerInfo(id);
	}

	public ResultMessage CustomerinfoShow(Main mainScene) {
		this.mainScene = mainScene;
		getCustomerInfo("123456");
		this.leftIdLabel.setText(this.customer.getId());
		this.leftNameLabel.setText(this.customer.getUsername());
		this.idLabel.setText(this.customer.getId());
		this.creditLabel.setText(String.valueOf(this.customer.getCredit()));
		if (customer.getMemberState() == memberState.NON_MEMBER) {
			this.memberLabel.setText("非会员");
		} else if (customer.getMemberState() == memberState.NORMAL_MEMBER) {
			this.memberLabel.setText("企业会员");
		} else if (customer.getMemberState() == memberState.NORMAL_MEMBER) {
			this.memberLabel.setText("普通会员");
		}
		return ResultMessage.SUCCESSFUL;
	}
	public ResultMessage CustomerInfoModify(){
		String newName=this.nameTextField.getText();
		//Date newbirthday=this.datePicker
		return ResultMessage.SUCCESSFUL;
	}
}
