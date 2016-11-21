package blservice.impl;

import java.util.ArrayList;

import PO.HotelInfoPO;
import PO.HotelRoomInfoPO;
import PO.Label;
import PO.Rank;
import VO.HotelInfoVO;
import blservice.Hotel_blservice;
import data.service.Hotel_dataService;
import other.ResultMessage;

public class Hotel_bl implements Hotel_blservice {
	Hotel_dataService hotelService;
	HotelInfoVO hotel;

	public HotelInfoPO getHotelInfo(String hotelId) {
		// TODO Auto-generated method stub
		return hotelService.find_hotel(hotelId);
	}

	public ResultMessage modifyHotelInfo(HotelInfoPO hotelInfo) {
		// TODO Auto-generated method stub
		hotelService.modify_hotel(hotelInfo);
		return ResultMessage.SUCCESSFUL;
	}

	public String[] getListOfHotelId() {
		// TODO Auto-generated method stub
		String [] hotelIdList={"123450","24680"};
		return hotelIdList;
	}

	public String addHotel(HotelInfoPO hotel) {
		// TODO Auto-generated method stub
		hotelService.add_hotel(hotel);
		String hotelID = "123456";
		return hotelID;
	}

	public String addHotelStaff(String hotelId) {
		// TODO Auto-generated method stub
		HotelInfoPO PO = hotelService.find_hotel(hotelId);
		PO.setHotelStaff("12345");
		return "12345";
	}

	public ResultMessage addAssessment(String hotelID, String assessment) {
		// TODO Auto-generated method stub
		HotelInfoPO hotelInfoPO = hotelService.find_hotel(hotelID);
		hotelInfoPO.setAssessment(assessment);
		return ResultMessage.SUCCESSFUL;
	}

	public ResultMessage addLabelAssessment(String hotelID,
			Label label) {
		// TODO Auto-generated method stub
		HotelInfoPO hotelInfoPO = hotelService.find_hotel(hotelID);
		hotelInfoPO.setLabelAssessment(label);
		return ResultMessage.SUCCESSFUL;
	}

	public ResultMessage addRankAssessment(String hotelID, Rank rank) {
		// TODO Auto-generated method stub
		HotelInfoPO hotelInfoPO = hotelService.find_hotel(hotelID);
		hotelInfoPO.setRankAssessment(rank);
		return ResultMessage.SUCCESSFUL;
	}

	public ResultMessage roomModify(String hotelId, HotelRoomInfoPO currentInfo) {
		// TODO Auto-generated method stub
		HotelInfoPO hotelInfoPO = hotelService.find_hotel(hotelId);
		hotelInfoPO.setRooms(currentInfo);
		return ResultMessage.SUCCESSFUL;
	}

	public HotelRoomInfoPO getHotelRoomInfo(String hotelId) {
		// TODO Auto-generated method stub
		HotelInfoPO hotelInfoPO = hotelService.find_hotel(hotelId);
		return hotelInfoPO.getRooms();
	}

	public ArrayList<Label> getLabelAssessment(String hotelId) {
		// TODO Auto-generated method stub
		HotelInfoPO hotelInfoPO = hotelService.find_hotel(hotelId);
		return hotelInfoPO.getLabelAssessmentList();
	}

	public ResultMessage deleteLabelAssessment(String hotelId,Label label) {
		// TODO Auto-generated method stub
		HotelInfoPO hotelInfoPO = hotelService.find_hotel(hotelId);
		hotelInfoPO.deleteLabelAssessment(label);
		return ResultMessage.SUCCESSFUL;
	}

	public String[] getListOfHotelPrefer(String userId) {
		// TODO Auto-generated method stub
		return null;
	}


	public ResultMessage addLabelAssessment(String hotelID,
			ArrayList<Label> labelList) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMockID() {
		// TODO Auto-generated method stub
		return this.hotel.getHotelId();
	}

}
