package blservice.impl;

import java.util.ArrayList;

import PO.OrderPO;
import PO.PrivilegePO;
import blservice.Order_blservice;
import other.OrderState;
import other.ResultMessage;
import other.RoomType;

public class Order_bl implements Order_blservice{

	public OrderState getState(int orderID) {
		return OrderState.ABNOMAL;
	}

	public OrderPO getOrder(int orderID) {
		return new OrderPO();
	}

	public ArrayList<OrderPO> getOrdersOfUsers(int userID) {
		ArrayList<OrderPO> aList = new ArrayList<OrderPO>();
		OrderPO tempPO = new OrderPO();
		aList.add(tempPO);
		return aList;
	}

	public OrderPO createOrder(OrderPO order_info) {
		return new OrderPO();
	}

	public ResultMessage changeState(OrderPO order_info) {
		return ResultMessage.FAILED;
	}

	public ArrayList<OrderPO> getUnfinishedOrders(int userID) {
		ArrayList<OrderPO> aList = new ArrayList<OrderPO>();
		OrderPO tempPO = new OrderPO();
		aList.add(tempPO);
		return aList;
	}

	public ArrayList<OrderPO> getAbnomalOrders(int userID) {
		ArrayList<OrderPO> aList = new ArrayList<OrderPO>();
		OrderPO tempPO = new OrderPO();
		aList.add(tempPO);
		return aList;
	}

	public ArrayList<OrderPO> getHotelOrders(int userID, int hotelID) {
		ArrayList<OrderPO> aList = new ArrayList<OrderPO>();
		OrderPO tempPO = new OrderPO();
		aList.add(tempPO);
		return aList;
	}

	public boolean checkRoomType(int hotelID, RoomType type) {
		return false;
	}

	public ArrayList<PrivilegePO> getRecommendations(int userID, int hotelID) {
		ArrayList<PrivilegePO> aList = new ArrayList<PrivilegePO>();
		PrivilegePO tempPO = new PrivilegePO();
		aList.add(tempPO);
		return aList;
	}

	public boolean generateOrder(OrderPO aOrder) {
		return false;
	}

	public boolean changeState(String orderID) {

		return false;
	}

	public boolean changeCredit(String userID, String orderID) {

		return false;
	}




}
