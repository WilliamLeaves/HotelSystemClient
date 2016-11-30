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
import other.OrderState;

public class CustomerOrderViewController {

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
	private TextField searchInput;
	@FXML
	private Button searchButton;
	@FXML
	private TableView<OrderVO> orderTable;
	@FXML
    private TableColumn<OrderVO, String> orderId;
    @FXML
    private TableColumn<OrderVO, Date> timeOfArrive;
    @FXML
    private TableColumn<OrderVO, String> nameOfHotel;
    @FXML
    private TableColumn<OrderVO, Double> payment;
    @FXML
    private TableColumn<OrderVO, OrderState> stateOfOrder;
    
    public CustomerOrderViewController(){		
	}
	
	public void CustomerOrderViewShow(Main mainScene) {

	}
    
}
