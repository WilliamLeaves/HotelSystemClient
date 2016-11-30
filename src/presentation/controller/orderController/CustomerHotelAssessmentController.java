package presentation.controller.orderController;

import VO.SystemStaffVO;
import blservice.UserInfo_blservice;
import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import main.Main;

public class CustomerHotelAssessmentController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button save;
	@FXML
	private Button back;
	@FXML
	private Label nameOfHotel;
	@FXML
	private MenuButton starRateReviews;// 星级评价
	@FXML
	private MenuButton tagReviews;// 标签评价
	@FXML
	private Label Tag1;// 已添加标签
	@FXML
	private Label Tag2;
	@FXML
	private Label Tag3;
	@FXML
	private TextField assessmentTextField;

	public CustomerHotelAssessmentController(){
		
		}

	public void CustomerHotelAssessmentShow(Main mainScene) {

	}

}
