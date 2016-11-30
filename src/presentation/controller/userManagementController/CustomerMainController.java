package presentation.controller.userManagementController;

import VO.HotelInfoVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import main.Main;

public class CustomerMainController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button viewHotel;
	@FXML
	private Button viewOrder;
	@FXML
	private Button maintainPersonalInfo;// 维护个人信息
	@FXML
	private Button adviceFeedBack;
	@FXML
	private Button exit;
	@FXML
	private Label districtName;
	@FXML
	private TableView<HotelInfoVO> hotelTable;
	@FXML
	private TableColumn<HotelInfoVO, String> hotelId;
	@FXML
	private TableColumn<HotelInfoVO, String> address;//地址
	@FXML
	private TableColumn<HotelInfoVO, String> introduction;//简介
	
	public CustomerMainController() {
	}
	
	public void CustomerMainShow(Main mainScene) {
		leftIdLabel.setText("123");		
	}	

}
