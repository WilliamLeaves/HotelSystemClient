package presentation.controller.orderController;

import java.util.ArrayList;

import VO.OrderVO;
import other.OrderState;
import other.ResultMessage;
import presentation.view.order_ui.Order;

public class OrderviewController implements Order {

	public OrderState getState(String orderID) {
		return OrderState.ABNOMAL;
	}

	public OrderVO getOrder(String orderID) {
		return new OrderVO("0001", "xinzhiting", "hubie", 270, "UNFINISHED");
	}

	public ArrayList<OrderVO> getOrdersOfUsers(String userID) {
		OrderVO temp = new OrderVO("0001", "xinzhiting", "hubie", 270, "UNFINISHED");
		ArrayList<OrderVO> aList = new ArrayList<OrderVO>();
		aList.add(temp);
		return aList;
	}

	public OrderVO createOrder(OrderVO order_info) {
		return new OrderVO("0001", "xinzhiting", "hubie", 270, "UNFINISHED");
	}

	public ResultMessage changeState(OrderVO order_info) {
		return ResultMessage.FAILED;
	}

	public ArrayList<OrderVO> getUnfinishedOrders(String userID) {
		OrderVO temp = new OrderVO("0001", "xinzhiting", "hubie", 270, "UNFINISHED");
		ArrayList<OrderVO> aList = new ArrayList<OrderVO>();
		aList.add(temp);
		return aList;	}

	public ArrayList<OrderVO> getAbnomalOrders(String userID) {
		OrderVO temp = new OrderVO("0001", "xinzhiting", "hubie", 270, "UNFINISHED");
		ArrayList<OrderVO> aList = new ArrayList<OrderVO>();
		aList.add(temp);
		return aList;	
	}

	public ArrayList<OrderVO> getHotelOrders(String userID, String hotelID) {
		OrderVO temp = new OrderVO("0001", "xinzhiting", "hubie", 270, "UNFINISHED");
		ArrayList<OrderVO> aList = new ArrayList<OrderVO>();
		aList.add(temp);
		return aList;	
	}



}
