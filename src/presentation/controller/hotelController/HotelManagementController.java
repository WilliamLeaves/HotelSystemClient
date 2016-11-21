package presentation.controller.hotelController;

import java.util.ArrayList;

import PO.HotelInfoPO;
import VO.HotelInfoVO;
import blservice.Hotel_blservice;
import other.ResultMessage;
import presentation.view.hotel_ui.HotelManagementControllerService;

public class HotelManagementController implements HotelManagementControllerService{
	Hotel_blservice hotelService;

	public String addHotel(HotelInfoVO hotel) {
		return this.hotelService.addHotel(new HotelInfoPO(hotel));
	};

	public String addHotelStaff(String hotelId) {
		return this.addHotelStaff(hotelId);
	}

	public ResultMessage showAvailableHotelList(
			ArrayList<HotelInfoVO> availableHotelList) {
		return ResultMessage.SUCCESSFUL;
	}

	public ArrayList<HotelInfoVO> getAvailableHotelList() {
		String[] hotelIdList = this.hotelService.getListOfHotelId();
		ArrayList<HotelInfoVO> hotelInfoVO = new ArrayList<HotelInfoVO>();
		hotelInfoVO.add(new HotelInfoVO(this.hotelService
				.getHotelInfo(hotelIdList[0])));
		return hotelInfoVO;
	}
	
	public String getID(){
		return hotelService.getMockID();
	}

}
