package presentation.controller.userInfoController;

import VO.CustomerVO;
import blservice.UserInfo_blservice;
import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import main.Main;
import other.ResultMessage;
import other.memberState;

public class CustomerMemberModifyController {
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Label idLabel;
	@FXML
	private Label nameLabel;
	@FXML
	private Label memberLabel;
	@FXML
	private Label CreditLabel;
	@FXML
	private Button leftNormalMemberButton;
	@FXML
	private Button leftCompanyMemberButton;
	@FXML
	private Button back;

	private Main mainScene;
	private UserInfo_blservice blservice;
	private CustomerVO customer;

	public CustomerMemberModifyController() {
		blservice = new UserInfo_bl();
	}

	public void initialize(Main mainScene, CustomerVO customer) {
		this.mainScene = mainScene;
		this.customer = customer;
		this.CustomerinfoShow();
	}

	private void getCustomerInfo(String id) {
		this.customer = this.blservice.getCustomerInfo(id);
	}

	public ResultMessage CustomerinfoShow() {
		this.leftIdLabel.setText(this.customer.getId());
		this.leftNameLabel.setText(this.customer.getUsername());
		this.nameLabel.setText(this.customer.getUsername());
		this.idLabel.setText(this.customer.getId());
		this.CreditLabel.setText(String.valueOf(this.customer.getCredit()));
		if (customer.getMemberState() == memberState.NON_MEMBER) {
			this.memberLabel.setText("非会员");
		} else if (customer.getMemberState() == memberState.NORMAL_MEMBER) {
			this.memberLabel.setText("企业会员");
		} else if (customer.getMemberState() == memberState.NORMAL_MEMBER) {
			this.memberLabel.setText("普通会员");
		}
		return ResultMessage.SUCCESSFUL;
	}

	public void handleback() {
		this.mainScene.showCustomerInfoScene(customer);
	}

	public void handleNormalMemberModify() {
		this.mainScene.showCustomerInfoScene(customer);
	}

	public void handleCompanyMemberModify() {
		this.mainScene.showCustomerInfoScene(customer);
	}
}
