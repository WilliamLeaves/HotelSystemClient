package presentation.controller.hotelController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import main.Main;

//scene������Ҫ�� û��scene
//***************************
public class HotelStaffHotelInfoViewController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button  modifyHotelInfo;//�޸ľƵ���Ϣ
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
	private Label description;
	@FXML
	private Label strategy;
	@FXML
	private Label grade;//�Ƶ��Ǽ�
	@FXML
	private Label tag;//�Ƶ��ǩ
	@FXML
	private Label restRoomNumber;//ʣ��ͷ�����
	@FXML
	private Label price;
	
	public HotelStaffHotelInfoViewController(){		
	}
	
	public void HotelStaffHotelInfoViewShow(Main mainScene) {

	}
}
