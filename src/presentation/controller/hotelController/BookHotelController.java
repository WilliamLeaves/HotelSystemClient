package presentation.controller.hotelController;

import VO.CustomerVO;
import VO.HotelInfoVO;
import VO.OrderVO;
import blservice.UserInfo_blservice;
import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import main.Main;
import other.ResultMessage;
import other.RoomType;

public class BookHotelController {

	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button save;
	@FXML
	private Button back;
	@FXML
	private Label customerId;
	@FXML
	private Label customerName;
	@FXML
	private Label hotelName;

	@FXML
	private MenuButton typeOfRoom;
	@FXML
	private MenuItem doublePersonRoom;
	@FXML
	private MenuItem singlePersonRoom;
	@FXML
	private MenuItem multiPersonRoom;
	@FXML
	private MenuItem bigBedRoom;

	@FXML
	private MenuButton numberOfRoom;
	@FXML
	private MenuItem oneRoom;
	@FXML
	private MenuItem twoRoom;
	@FXML
	private MenuItem threeRoom;
	@FXML
	private MenuItem fourRoom;
	@FXML
	private MenuItem fiveRoom;

	@FXML
	private DatePicker dateOfCheckIn;
	@FXML
	private Label duration;// ��סʱ��
	@FXML
	private Button increase;
	@FXML
	private Button decrease;
	@FXML
	private Label memberDeals;// ��Ա�Ż�
	@FXML
	private Label holidayDeals;// �����Ż�
	@FXML
	private Label otherDeals;// �����Ż�
	@FXML
	private Label orderTotal;// �����ܶ�
	@FXML
	private Label actualPayment;// ʵ�ʸ���

	private Main mainScene;
	private UserInfo_blservice blservice;
	private CustomerVO customer;
	private HotelInfoVO hotel;
	private OrderVO order;

	private int days;
	private RoomType roomtype;
	private int roomNum;

	public BookHotelController() {
		blservice = new UserInfo_bl();
	}

	public void initialize(Main mainScene, CustomerVO customer, HotelInfoVO hotel) {
		// TODO Auto-generated method stub
		this.customer = customer;
		this.hotel = hotel;
		this.mainScene = mainScene;
		this.SystemManagerSystemStaffInfoModifyShow();
	}

	public ResultMessage SystemManagerSystemStaffInfoModifyShow() {
		this.leftIdLabel.setText(customer.getId());
		this.leftNameLabel.setText(customer.getUsername());
		this.customerName.setText(customer.getUsername());
		this.customerId.setText(customer.getId());

		this.hotelName.setText(this.hotel.getHotelName());
		this.typeOfRoom.setText("��ѡ�񷿼�����");
		this.numberOfRoom.setText("��ѡ�񷿼�����");
		this.days = 1;
		this.duration.setText(String.valueOf(days) + "��");
		return ResultMessage.SUCCESSFUL;
	}

	public void handleIncrease() {
		if (this.days < 30) {
			this.days++;
		}
		this.duration.setText(String.valueOf(days) + "��");
	}

	public void handleDecrease() {
		if (this.days > 1) {
			this.days--;
		}
		this.duration.setText(String.valueOf(days) + "��");
	}

	public void handleSinglePersonRoom() {
		this.roomtype = RoomType.singlePersonRoom;
		this.typeOfRoom.setText("���˼�");
	}

	public void handleMultiPersonRoom() {
		this.roomtype = RoomType.multiPersonRoom;
		this.typeOfRoom.setText("���˼�");
	}

	public void handleDoublePersonRoom() {
		this.roomtype = RoomType.doublePersonRoom;
		this.typeOfRoom.setText("˫�˼�");
	}

	public void handleBigBedRoom() {
		this.roomtype = RoomType.bigBedRoom;
		this.typeOfRoom.setText("�󴲷�");
	}

	public void handleOneRoom() {
		this.roomNum = 1;
		this.numberOfRoom.setText("1��");
	}

	public void handleTwoRoom() {
		this.roomNum = 2;
		this.numberOfRoom.setText("2��");
	}

	public void handleThreeRoom() {
		this.roomNum = 3;
		this.numberOfRoom.setText("3��");
	}

	public void handleFourRoom() {
		this.roomNum = 4;
		this.numberOfRoom.setText("4��");
	}

	public void handleFiveRoom() {
		this.roomNum = 5;
		this.numberOfRoom.setText("5��");
	}
	
	public void handleSave(){
		this.mainScene.showCustomerHotelInfoScene(customer, hotel);
	}
	public void handleBack(){
		this.mainScene.showCustomerHotelInfoScene(customer, hotel);
	}
}
