package presentation.controller.hotelController;

import java.util.ArrayList;

import VO.HotelInfoVO;
import blservice.Hotel_blservice;
import other.ResultMessage;
import other.SortMethod;
import presentation.view.hotel_ui.HotelViewControllerService;

public class HotelViewController implements HotelViewControllerService{
	Hotel_blservice hotelService;

	public HotelInfoVO getHotelInfo(String hotelId) {
		HotelInfoVO vo = new HotelInfoVO(
				this.hotelService.getHotelInfo(hotelId));
		return vo;
	}

	public ResultMessage showHotelInfo(HotelInfoVO HotelInfo) {
		return ResultMessage.SUCCESSFUL;
	}

	public String[] getListOfHotelId() {
		return this.hotelService.getListOfHotelId();

	}

	public ArrayList<HotelInfoVO> getListOfHotel(String[] hotelId) {
		String[] hotelIdList = this.getListOfHotelId();
		ArrayList<HotelInfoVO> voList = new ArrayList<HotelInfoVO>();
		voList.add(new HotelInfoVO(this.hotelService
				.getHotelInfo(hotelIdList[0])));
		return voList;
	}

	public ResultMessage showHotelList(ArrayList<HotelInfoVO> list) {
		return ResultMessage.SUCCESSFUL;

	}

	public ArrayList<HotelInfoVO> HotelListSort(SortMethod method,
			ArrayList<HotelInfoVO> list) {
		return list;

	}

	public String[] getListOfHotelPrefer(String userId) {
		return this.hotelService.getListOfHotelPrefer(userId);
	}

	public ResultMessage bookRoom(String hotelID) {
		
		return ResultMessage.SUCCESSFUL;
	}
}
