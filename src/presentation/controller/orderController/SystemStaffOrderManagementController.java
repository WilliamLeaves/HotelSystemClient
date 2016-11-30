package presentation.controller.orderController;

import java.util.Date;

import VO.OrderVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import main.Main;

public class SystemStaffOrderManagementController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button viewOrderInfo;
	@FXML
	private Button back;
	@FXML
	private Label headLabel;
	@FXML
	private TextField searchInput;
	@FXML
	private Button searchButton;
	@FXML
    private TableView<OrderVO> orderTable;
    @FXML
    private TableColumn<OrderVO, String> orderId;
    @FXML
    private TableColumn<OrderVO, String> hotelId;
    @FXML
    private TableColumn<OrderVO, String> customerId;
    @FXML
    private TableColumn<OrderVO, Date> arriveTime;//����ʱ��
    @FXML
    private TableColumn<OrderVO, String> orderDuration;//����ʱ��
    
    public SystemStaffOrderManagementController() {

	}

	public void SystemStaffOrderManagementShow(Main mainScene) {

	}
    
}
