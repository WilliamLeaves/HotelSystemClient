package VO;

import java.util.ArrayList;

import PO.HotelInfoPO;
import PO.HotelRoomInfoPO;
import PO.HotelStrategyPO;
import PO.Label;
import PO.Rank;

public class HotelInfoVO {
	String hotelID;
	String hotelName;
	String hotelDistrict;
	String hotelStaffId;
	String hotelAddress;
	String hotelDiscription;

	HotelRoomInfoVO roomInfo;
	ArrayList<HotelStrategyPO> hotelStrategy;
	ArrayList<String> assessmentList;
	ArrayList<Rank> rankList;
	ArrayList<Label> labelList;
	String[] orderListId;

	public HotelInfoVO() {
		super();
		this.hotelID = "500001";
		this.hotelName = "Nanjing Hotel";
		this.hotelDistrict = "新街口商圈";
		this.hotelStaffId = "200001";
		this.hotelAddress = "上海路63号";
		this.hotelDiscription = "";
		this.roomInfo = new HotelRoomInfoVO();
	}

	// 构造方法
	public HotelInfoVO(HotelInfoPO hotelInfo) {
		// TODO Auto-generated constructor stub
	}

	public HotelInfoVO(String hotelID, String hotelName, String hotelDistrict, String hotelStaffId) {

	}

	public String[] getOrderListId() {
		return orderListId;
	}

	public void setOrderListId(String[] orderListId) {
		this.orderListId = orderListId;
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelDistrict() {
		return hotelDistrict;
	}

	public void setHotelDistrict(String hotelDistrict) {
		this.hotelDistrict = hotelDistrict;
	}

	public String getHotelStaffId() {
		return hotelStaffId;
	}

	public void setHotelStaffId(String hotelStaffId) {
		this.hotelStaffId = hotelStaffId;
	}

	public HotelRoomInfoVO getRoomInfo() {
		return roomInfo;
	}

	public void setRoomInfo(HotelRoomInfoVO roomInfo) {
		this.roomInfo = roomInfo;
	}

	public ArrayList<HotelStrategyPO> getHotelStrategy() {
		return hotelStrategy;
	}

	public void setHotelStrategy(ArrayList<HotelStrategyPO> hotelStrategy) {
		this.hotelStrategy = hotelStrategy;
	}

	public ArrayList<String> getAssessmentList() {
		return assessmentList;
	}

	public void setAssessmentList(ArrayList<String> assessmentList) {
		this.assessmentList = assessmentList;
	}

	public ArrayList<Rank> getRankList() {
		return rankList;
	}

	public void setRankList(ArrayList<Rank> rankList) {
		this.rankList = rankList;
	}

	public ArrayList<Label> getLabelList() {
		return labelList;
	}

	public void setLabelList(ArrayList<Label> labelList) {
		this.labelList = labelList;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public String getHotelDiscription() {
		return hotelDiscription;
	}

	public void setHotelDiscription(String hotelDiscription) {
		this.hotelDiscription = hotelDiscription;
	}
}
