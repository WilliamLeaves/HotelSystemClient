package presentation.controller.orderController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.ImageView;
import main.Main;

public class CustomerOrderInfoViewController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button recallOrAssessment;//撤销订单/评价订单
	@FXML
	private Button viewHotel;
	@FXML
	private Button back;
	@FXML
	private Label IdLabel;
	@FXML
	private Label nameLabel;
	@FXML
	private Label nameOfHotel;
	@FXML
	private Label typeOfRoom;
	@FXML
	private Label numberOfRoom;
	@FXML
	private Label durationOfOrder;//订单时长
	@FXML
	private Label timeOfArrive;
	@FXML
	private Label actualPayment;
	@FXML
	private Label stateOfOrder;

	public CustomerOrderInfoViewController() {

	}

	public void CustomerOrderInfoViewShow(Main mainScene) {

	}
}
