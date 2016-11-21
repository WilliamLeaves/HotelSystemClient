package presentation.view.userManagement_ui;

import VO.HotelStaffVO;

public interface HotelManagementControllerService {

	public boolean addNewHotel(String hotel_id);

	public boolean addHotelStaff(String hotel_id, HotelStaffVO hotelstaff);

}
