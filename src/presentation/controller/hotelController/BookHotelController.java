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
	private Label duration;// 入住时长
	@FXML
	private Button increase;
	@FXML
	private Button decrease;
	@FXML
	private Label memberDeals;// 会员优惠
	@FXML
	private Label holidayDeals;// 节日优惠
	@FXML
	private Label otherDeals;// 其他优惠
	@FXML
	private Label orderTotal;// 订单总额
	@FXML
	private Label actualPayment;// 实际付款

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
		this.typeOfRoom.setText("请选择房间类型");
		this.numberOfRoom.setText("请选择房间数量");
		this.days = 1;
		this.duration.setText(String.valueOf(days) + "天");
		return ResultMessage.SUCCESSFUL;
	}

	public void handleIncrease() {
		if (this.days < 30) {
			this.days++;
		}
		this.duration.setText(String.valueOf(days) + "天");
	}

	public void handleDecrease() {
		if (this.days > 1) {
			this.days--;
		}
		this.duration.setText(String.valueOf(days) + "天");
	}

	public void handleSinglePersonRoom() {
		this.roomtype = RoomType.singlePersonRoom;
		this.typeOfRoom.setText("单人间");
	}

	public void handleMultiPersonRoom() {
		this.roomtype = RoomType.multiPersonRoom;
		this.typeOfRoom.setText("多人间");
	}

	public void handleDoublePersonRoom() {
		this.roomtype = RoomType.doublePersonRoom;
		this.typeOfRoom.setText("双人间");
	}

	public void handleBigBedRoom() {
		this.roomtype = RoomType.bigBedRoom;
		this.typeOfRoom.setText("大床房");
	}

	public void handleOneRoom() {
		this.roomNum = 1;
		this.numberOfRoom.setText("1间");
	}

	public void handleTwoRoom() {
		this.roomNum = 2;
		this.numberOfRoom.setText("2间");
	}

	public void handleThreeRoom() {
		this.roomNum = 3;
		this.numberOfRoom.setText("3间");
	}

	public void handleFourRoom() {
		this.roomNum = 4;
		this.numberOfRoom.setText("4间");
	}

	public void handleFiveRoom() {
		this.roomNum = 5;
		this.numberOfRoom.setText("5间");
	}
	
	public void handleSave(){
		this.mainScene.showCustomerHotelInfoScene(customer, hotel);
	}
	public void handleBack(){
		this.mainScene.showCustomerHotelInfoScene(customer, hotel);
	}
}
