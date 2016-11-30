package main;

import java.util.Date;

import VO.OrderVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public class SystemStaffMainController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button ExceptionOrderManagement;
	@FXML
	private Button creditManagement;
	@FXML
	private Button makeSystemStrategy;
	@FXML
	private Button adcviceManagement;
	@FXML
	private Button maintainPersonalInfo;// ά��������Ϣ
	@FXML
	private Button exit;
	@FXML
	private Label districtName;
	@FXML
	private TableView<OrderVO> orderTable;
	@FXML
	private TableColumn<OrderVO, String> customerId;
	@FXML
	private TableColumn<OrderVO, String> hotelId;
	@FXML
	private TableColumn<OrderVO, String> orderId;//��������������
	@FXML
	private TableColumn<OrderVO, Date> arriveTime;//���
	@FXML
	private TableColumn<OrderVO, String> orderDuration;//����ʱ��
	
	public SystemStaffMainController() {
	}
	
	public void SystemStaffMainShow(Main mainScene) {
		leftIdLabel.setText("123");		
	}	
}
