package PO;

import VO.HotelStrategyVO;

public class HotelStrategyPO {
	String hotelStrategyInfo;
	String hotelStaffID;
	String hotelID;

	/**
	 * 
	 * @param hotelStrategyInfo
	 * @param hotelStaffID
	 * @param hotelID
	 */
	public HotelStrategyPO(String hotelStrategyInfo, String hotelStaffID,
			String hotelID) {
		this.hotelStaffID = hotelStaffID;
		this.hotelStrategyInfo = hotelStrategyInfo;
		this.hotelID = hotelID;
	}
	public HotelStrategyPO(HotelStrategyVO VO){
		
	}
	/**
	 * 
	 * @return
	 */
	public String gethotelStrategyInfo() {
		return this.hotelStrategyInfo;
	}

	/**
	 * 
	 * @return
	 */
	public String gethotelStaffID() {
		return this.hotelStaffID;
	}

	/**
	 * 
	 * @return
	 */
	public String getHotelID() {
		return this.hotelID;
	}
}
