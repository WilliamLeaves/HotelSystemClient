package blservice;

import java.util.ArrayList;

import VO.CustomerVO;
import VO.HotelStaffVO;
import VO.SystemStaffVO;

public interface UserManagement_blservice {

	public ArrayList<CustomerVO> getCustomer(String user_id);

	public boolean modifyCustomerManagement(CustomerVO customer, CustomerVO customerChange);

	public ArrayList<HotelStaffVO> getHotelStaffManagement(String hotelstaff_id);

	public boolean modifyHotelStaffManagement(HotelStaffVO hotelstaff, HotelStaffVO hotelstaffChange);

	public ArrayList<SystemStaffVO> getSystemStaff(String systemstaff_id);

	public boolean modifySystemStaffManagement(SystemStaffVO systemstaff, SystemStaffVO systemStaffChange);

	public boolean addNewHotel(String hotel_id);

	public boolean addHotelStaff(String hotel_id, HotelStaffVO hotelstaff);

}
