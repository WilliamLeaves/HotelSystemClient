package VO;

import PO.HotelStaffPO;

public class HotelStaffVO {
	private String id;

	private String username;
	
	private String hotelName;

	public HotelStaffVO() {
		super();
	}

	public HotelStaffVO(HotelStaffPO userPO) {
		super();
		this.id = userPO.getId();
		this.username = userPO.getUsername();
		this.hotelName = userPO.getHotelName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
}
