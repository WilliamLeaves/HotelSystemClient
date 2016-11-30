package presentation.controller.orderController;

import java.util.Date;

import VO.OrderVO;
import VO.SystemStrategyVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import main.Main;

public class HotelStaffOrderViewController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button viewOrderInfo;//�鿴��������
	@FXML
	private Button Undo;//δִ��
	@FXML
	private Button Exception;//�쳣����
	@FXML
	private Button Done;//��ִ�ж���
	@FXML
	private Button back;
	@FXML
	private Label orderType;
	@FXML
	private Label hotelName;
	@FXML
    private TableView<OrderVO> orderTable;
    @FXML
    private TableColumn<OrderVO, String> orderId;
    @FXML
    private TableColumn<OrderVO, String> customerId;
    @FXML
    private TableColumn<OrderVO, String> orderTpye;//�������ͣ���������/������
    @FXML
    private TableColumn<OrderVO, Date> arriveTime;//����ʱ��
    
    public HotelStaffOrderViewController() {

	}

	public void HotelStaffOrderViewShow(Main mainScene) {

	}
    
}
