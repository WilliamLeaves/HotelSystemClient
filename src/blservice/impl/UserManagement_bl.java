package blservice.impl;

import java.util.ArrayList;

import PO.*;
import VO.CustomerVO;
import VO.HotelStaffVO;
import VO.SystemStaffVO;
import blservice.UserManagement_blservice;

public class UserManagement_bl implements UserManagement_blservice {

	private ArrayList<CustomerPO> CustomerList;
	private ArrayList<HotelStaffPO> HotelStaffList;
	private ArrayList<SystemStaffPO> SystemStaffList;

	public ArrayList<CustomerVO> getCustomer(String user_id) {

		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		for (CustomerPO customerPO : CustomerList) {
			if (user_id == customerPO.getId()) {
				CustomerVO customerVO = new CustomerVO(customerPO);
				list.add(customerVO);
			}
		}
		return list;
	}

	public boolean modifyCustomerManagement(CustomerVO customer, CustomerVO customerChange) {

		String customer_Id = customer.getId();
		for (CustomerPO customerPO : CustomerList) {
			if (customer_Id == customerPO.getId()) {
				customer = customerChange;
			}
			return true;
		}
		return false;
	}

	public ArrayList<HotelStaffVO> getHotelStaffManagement(String hotelstaff_id) {

		ArrayList<HotelStaffVO> list = new ArrayList<HotelStaffVO>();
		for (HotelStaffPO hotelStaffPO : HotelStaffList) {
			if (hotelstaff_id == hotelStaffPO.getId()) {
				HotelStaffVO hotelStaffVO = new HotelStaffVO(hotelStaffPO);
				list.add(hotelStaffVO);
			}
		}
		return list;
	}

	public boolean modifyHotelStaffManagement(HotelStaffVO hotelStaff, HotelStaffVO hotelstaffChange) {

		String hotelStaff_Id = hotelStaff.getId();
		for (HotelStaffPO hotelStaffPO : HotelStaffList) {
			if (hotelStaff_Id == hotelStaffPO.getId()) {
				hotelStaff = hotelstaffChange;
			}
			return true;
		}
		return false;
	}

	public ArrayList<SystemStaffVO> getSystemStaff(String systemStaff_id) {

		ArrayList<SystemStaffVO> list = new ArrayList<SystemStaffVO>();
		for (SystemStaffPO systemStaffPO : SystemStaffList) {
			if (systemStaff_id == systemStaffPO.getId()) {
				SystemStaffVO systemStaffVO = new SystemStaffVO(systemStaffPO);
				list.add(systemStaffVO);
			}
		}
		return list;
	}

	public boolean modifySystemStaffManagement(SystemStaffVO systemStaff, SystemStaffVO systemStaffChange) {

		String systemStaff_Id = systemStaff.getId();
		for (SystemStaffPO systemStaffPO : SystemStaffList) {
			if (systemStaff_Id == systemStaffPO.getId()) {
				systemStaff = systemStaffChange;
			}
			return true;
		}
		return false;
	}

	public boolean addNewHotel(String hotel_id) {
		if (hotel_id != null) {
			HotelInfoPO hotelInfo = new HotelInfoPO(null);
			hotelInfo.setHotelID(hotel_id);
			return true;
		}
		return false;
	}

	public boolean addHotelStaff(String hotel_id, HotelStaffVO hotelStaff) {
		if(hotel_id!=null){
			String id = hotelStaff.getId();
			String username = hotelStaff.getUsername();
			String phone = hotelStaff.getHotelName();
			String hotelName  = hotelStaff.getHotelName();
			HotelStaffPO newHotelStaff = new HotelStaffPO(id,username, phone, hotelName);
			return true;
		}
		return false;
	}

}
