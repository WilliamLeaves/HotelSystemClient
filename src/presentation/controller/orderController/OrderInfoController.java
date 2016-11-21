package presentation.controller.orderController;

import java.util.ArrayList;

import VO.OrderVO;
import VO.PrivilegeVO;
import other.RoomType;

public class OrderInfoController {
	public boolean checkRoomType(String hotelID, RoomType type) {
		return false;
	}

	public ArrayList<PrivilegeVO> getRecommendations(String userID, String hotelID) {
		PrivilegeVO temp = new PrivilegeVO();
		ArrayList<PrivilegeVO> aList = new ArrayList<PrivilegeVO>();
		aList.add(temp);
		return aList;	
	}

	public boolean generateOrder(OrderVO aOrder) {
		return false;
	}

}
