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
	private Button leftNormalMemberButtom;
	
	private Main mainScene;
	private UserInfo_blservice blservice;
	private CustomerVO customer;
	
	public CustomerMemberModifyController() {
		blservice = new UserInfo_bl();
	}

	public void initialize() {

	}

	private void getCustomerInfo(String id) {
		this.customer=this.blservice.getCustomerInfo(id);
	}

	public ResultMessage CustomerinfoShow(Main mainScene) {
		this.mainScene = mainScene;
		getCustomerInfo("123456");
		this.leftIdLabel.setText(this.customer.getId());
		return ResultMessage.SUCCESSFUL;
		
	}
}
