package PO;

import java.util.ArrayList;

import VO.HotelInfoVO;

public class HotelInfoPO {
	String[] orderListId;
	String hotelID;
	String hotelName;
	String hotelDistrict;
	String hotelStaffId;
	HotelRoomInfoPO roomInfo;
	ArrayList<HotelStrategyPO> hotelStrategy;
	ArrayList<String> assessmentList;
	ArrayList<Rank> rankList;
	ArrayList<Label> labelList;

	public HotelInfoPO(HotelInfoVO hotelInfo) {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<OrderPO> getOrders() {
		return null;
	}

	public String getHotelID() {
		return hotelID;
	}
	
	public void setHotelID(String hotelId) {
		this.hotelID=hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public String getHotelDistrict() {
		return hotelDistrict;
	}

	public HotelRoomInfoPO getRooms() {
		return this.roomInfo;
	}

	public void setRooms(HotelRoomInfoPO po) {
		this.roomInfo = po;
	}

	public ArrayList<HotelStrategyPO> getHotelStrategy() {
		return this.hotelStrategy;
	}

	public void setHotelStaff(String staffId) {
		this.hotelStaffId = staffId;
	}

	public void setAssessment(String assessment) {
		this.assessmentList.add(assessment);
	}

	public void setRankAssessment(Rank rank) {
		this.rankList.add(rank);
	}

	public void setLabelAssessment(Label label) {
		this.labelList.add(label);
	}

	public ArrayList<Label> getLabelAssessmentList() {

		return this.labelList;
	}

	public void deleteLabelAssessment(Label label) {
		this.labelList.remove(label);
	}
	
	
}
