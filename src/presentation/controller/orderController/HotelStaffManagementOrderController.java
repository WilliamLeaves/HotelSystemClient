package presentation.controller.orderController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import main.Main;

public class HotelStaffManagementOrderController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button setToException;//����Ϊ�쳣����
	@FXML
	private Button setToDone;//����Ϊ��ִ�ж���
	@FXML
	private Button back;
	@FXML
	private Label IdLabel;
	@FXML
	private Label nameLabel;
	@FXML
	private Label hotelName;
	@FXML
	private Label roomType;
	@FXML
	private Label roomNumber;
	@FXML
	private Label orderDuration;//����ʱ��
	@FXML
	private Label arriveTime;//����ʱ��
	@FXML
	private Label orderPayment;
	@FXML
	private Label stateOfOrder;
	
	public HotelStaffManagementOrderController() {

	}

	public void HotelStaffManagementOrderShow(Main mainScene) {

	}
}
