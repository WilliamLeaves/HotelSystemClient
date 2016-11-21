package presentation.view.order_ui;

import java.util.ArrayList;

import VO.OrderVO;
import VO.PrivilegeVO;
import other.RoomType;

public interface OrderGenerate {
	public boolean checkRoomType(String hotelID, RoomType type);
	public ArrayList<PrivilegeVO> getRecommendations(String userID, String hotelID);
	public boolean generateOrder(OrderVO aOrder);
}
