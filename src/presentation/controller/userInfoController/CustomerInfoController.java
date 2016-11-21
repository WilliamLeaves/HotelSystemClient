package presentation.controller.userInfoController;

import VO.CustemorInfoChangeVO;
import VO.CustomerVO;
import blservice.UserInfo_blservice;
import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.Main;
import other.ResultMessage;
import other.memberState;

public class CustomerInfoController {
	@FXML
	private Button modifyPersonalInfo;
	@FXML
	private Button modifyPassword;
	@FXML
	private Button backTOSuper;
	@FXML
	private Label idLabel;
	@FXML
	private Label nameLabel;
	@FXML
	private Label memberLabel;
	@FXML
	private Label birthdayLabel;
	@FXML
	private Label companyLabel;
	@FXML
	private Label creditLabel;
	@FXML
	private Label stateLabel;
	@FXML
	private Label leftMenuNameLabel;
	@FXML
	private Label leftMenuIdLabel;
	@FXML
	private ImageView leftMenuImage;
	@FXML
	private ImageView image;

	private Main mainsence;
	private CustomerVO Customer;

	public UserInfo_blservice blservice;

	public CustomerInfoController() {
		blservice = new UserInfo_bl();
	}

	public void initialize() {

	}

	// 暂时用不到的方法
	private void getCustomer(String id) {
		this.Customer = blservice.getCustomerInfo(id);
	}

	public ResultMessage getCustomerinfoModify(CustomerVO Customer) {
		return ResultMessage.FAILED;
	}

	public ResultMessage CustomerinfoShow(Main mainScene) {
		this.getCustomer("123456");
		this.mainsence = mainScene;
		this.idLabel.setText(Customer.getId());
		this.nameLabel.setText(Customer.getUsername());
		this.birthdayLabel.setText(Customer.getBirthday().toString());
		this.companyLabel.setText(Customer.getCompanyName());
		this.creditLabel.setText(String.valueOf(Customer.getCredit()));

		if (Customer.getMemberState() == memberState.NON_MEMBER) {
			this.memberLabel.setText("非会员");
		} else if (Customer.getMemberState() == memberState.NORMAL_MEMBER) {
			this.memberLabel.setText("企业会员");
		} else if (Customer.getMemberState() == memberState.NORMAL_MEMBER) {
			this.memberLabel.setText("普通会员");
		}

		this.leftMenuIdLabel.setText(Customer.getId());
		this.leftMenuNameLabel.setText(Customer.getUsername());
		// this.leftMenuImage.setImage(new Image("D:/我的文档/Pictures/as"));
		return ResultMessage.SUCCESSFUL;
	}

}
