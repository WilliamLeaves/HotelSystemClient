package main;

import java.util.Date;

import VO.HotelInfoVO;
import VO.OrderVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public class HotelStaffMainController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button viewOrder;
	@FXML
	private Button maintainHotelInfo;
	@FXML
	private Button makeStrategy;
	@FXML
	private Button maintainPersonalInfo;// ά��������Ϣ
	@FXML
	private Button exit;
	@FXML
	private Label hotelName;
	@FXML
	private TableView<OrderVO> orderTable;
	@FXML
	private TableColumn<OrderVO, String> customerId;
	@FXML
	private TableColumn<OrderVO, String> roomInfo;//��������������
	@FXML
	private TableColumn<OrderVO, Date> arriveTime;//���
	@FXML
	private TableColumn<OrderVO, String> orderDuration;//����ʱ��
	
	public HotelStaffMainController() {
	}
	
	public void HotelStaffMainShow(Main mainScene) {
		leftIdLabel.setText("123");		
	}	

}
