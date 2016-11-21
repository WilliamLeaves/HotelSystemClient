package presentation.view.userManagement_ui;

import java.util.ArrayList;

import VO.HotelStaffVO;
import other.ResultMessage;

public interface HotelStaffManagementControllerService {
	
	public ArrayList<HotelStaffVO> getHotelStaffManagement(String hotelstaff_id);

	public ResultMessage modifyHotelStaffManagement(HotelStaffVO hotelstaff);

}
