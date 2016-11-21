package blservice;

import java.util.ArrayList;

import PO.OrderPO;
import PO.PrivilegePO;
import other.OrderState;
import other.ResultMessage;
import other.RoomType;

public interface Order_blservice {
	public OrderState getState(int orderID);
	public OrderPO getOrder(int orderID);
	public ArrayList<OrderPO> getOrdersOfUsers(int userID);
	public OrderPO createOrder(OrderPO order_info);
	public ResultMessage changeState(OrderPO order_info);
	public ArrayList<OrderPO> getUnfinishedOrders(int userID);
	public ArrayList<OrderPO> getAbnomalOrders(int userID);
	public ArrayList<OrderPO> getHotelOrders(int userID,int hotelID);

	public boolean checkRoomType(int hotelID, RoomType type);
	public ArrayList<PrivilegePO> getRecommendations(int userID, int hotelID);
	public boolean generateOrder(OrderPO aOrder);
	
	public  boolean changeState(String orderID);
	public boolean changeCredit(String userID,String orderID);
}
