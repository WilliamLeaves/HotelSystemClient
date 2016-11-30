package presentation.controller.hotelController;

import VO.CustomerVO;
import VO.HotelInfoVO;
import VO.HotelRoomInfoVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import main.Main;

public class HotelInfoController {
	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button reserveRoom;// Ԥ���ͷ�
	@FXML
	private Button back;
	@FXML
	private ImageView hotelPicture1;
	@FXML
	private ImageView hotelPicture2;
	@FXML
	private Label hotelName;
	@FXML
	private Label address;
	@FXML
	private Label district;
	@FXML
	private TextArea description;
	@FXML
	private Label strategy;
	@FXML
	private Label grade;// �Ƶ��Ǽ�
	@FXML
	private Label tag;// �Ƶ��ǩ
	@FXML
	private TableView<HotelRoomInfoVO> roomTable;
	@FXML
	private TableColumn<HotelRoomInfoVO, String> roomType;

	private Main mainScene;
	private CustomerVO customer;
	private HotelInfoVO hotel;
	private HotelRoomInfoVO hotelRoomInfo;

	public HotelInfoController() {
	}

	public void initialize(Main main, CustomerVO customer, HotelInfoVO hotel) {
		// TODO Auto-generated method stub
		this.mainScene = main;
		this.customer = customer;
		this.hotel = hotel;
		this.hotelRoomInfo = hotel.getRoomInfo();
		this.HotelInfoShow();
		roomType.setCellValueFactory(cellData -> cellData.getValue().getMultiRoomNum());
	}

	public void HotelInfoShow() {
		this.leftIdLabel.setText(this.customer.getId());
		this.leftNameLabel.setText(this.customer.getUsername());
		this.hotelName.setText(this.hotel.getHotelName());
		// this.hotelPicture2
		this.address.setText(this.hotel.getHotelAddress());
		this.district.setText(this.hotel.getHotelDistrict());
		this.description.setText(this.hotel.getHotelDiscription());
		// this.strategy.setText(this.hotel.getHotelStrategy());
		// this.grade.setText(this.hotel.getRankList());
		// this.tag.setText(this.hotel.getLabelList());
		/*
		 * this.restRoomNumber.setText("˫�˼䣺" +
		 * String.valueOf(this.hotelRoomInfo.getDoubleRoomRemain()) + "�� �󴲷���" +
		 * String.valueOf(this.hotelRoomInfo.getQueenSizeRoomRemain()) +
		 * "�� ���˼䣺" + String.valueOf(this.hotelRoomInfo.getSingleRoomRemain()) +
		 * "�� ���˼䣺" + String.valueOf(this.hotelRoomInfo.getMultiRoomRemain()));
		 * this.price.setText("˫�˼䣺" +
		 * String.valueOf(this.hotelRoomInfo.getDoubleRoomPrice()) + "/�գ� �󴲷���"
		 * + String.valueOf(this.hotelRoomInfo.getQueenSizeRoomPrice()) +
		 * "/�գ� ���˼䣺" + String.valueOf(this.hotelRoomInfo.getSingleRoomPrice())
		 * + "/�գ� ���˼䣺" + String.valueOf(this.hotelRoomInfo.getMultiRoomPrice())
		 * + "/����");
		 */
	}

	public void handleReserveRoom() {
		this.mainScene.showCustomerBookHotelScene(customer, hotel);
	}
}
