package presentation.controller.userManagementController;

import java.util.ArrayList;

import VO.HotelStaffVO;
import other.ResultMessage;
import presentation.view.userManagement_ui.HotelStaffManagementControllerService;

public class HotelStaffManagementController implements HotelStaffManagementControllerService{

	public ArrayList<HotelStaffVO> getHotelStaffManagement(String hotelstaff_id) {
		HotelStaffVO staffA = new HotelStaffVO();
		ArrayList<HotelStaffVO> list = new ArrayList<HotelStaffVO>();
		list.add(staffA);
		return list;
	}

	public ResultMessage modifyHotelStaffManagement(HotelStaffVO hotelstaff) {
		return ResultMessage.SUCCESSFUL;
	}

}
