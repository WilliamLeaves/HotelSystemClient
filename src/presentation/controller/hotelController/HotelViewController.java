package presentation.controller.hotelController;

import VO.CustomerVO;
import VO.HotelInfoVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import main.Main;

public class HotelViewController {
	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button viewHotelInfo;
	@FXML
	private Button guess;
	@FXML
	private Button back;
	@FXML
	private TextField searchInput;
	@FXML
	private Button searchButton;
	@FXML
	private TableView<HotelInfoVO> hotelTable;
	@FXML
	private TableColumn<HotelInfoVO, String> hotelId;
	@FXML
	private TableColumn<HotelInfoVO, String> address;
	@FXML
	private TableColumn<HotelInfoVO, String> description;

	public HotelViewController() {

	}

	public void HotelViewShow(Main mainScene) {

	}

	public void initialize(Main main, CustomerVO customer, HotelInfoVO hotel) {
		// TODO Auto-generated method stub

	}

}
