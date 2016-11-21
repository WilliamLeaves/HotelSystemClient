package presentation.controller.hotelController;

import VO.HotelInfoVO;
import blservice.Hotel_blservice;
import other.ResultMessage;
import presentation.view.hotel_ui.HotelInfoControllerService;

public class HotelInfoController implements HotelInfoControllerService{
	Hotel_blservice hotelService;

	public ResultMessage modifyHotelInfo(HotelInfoVO hotelInfo) {
		String hotelId=hotelInfo.getHotelId();
		hotelService.modifyHotelInfo(hotelService.getHotelInfo(hotelId));
		return ResultMessage.SUCCESSFUL;

	}

	public HotelInfoVO getHotelInfo(String hotelId) {
		return new HotelInfoVO(hotelService.getHotelInfo(hotelId));
		
	}

	public ResultMessage showHotelInfo(HotelInfoVO hotelInfo) {
		return ResultMessage.SUCCESSFUL;
	}

}
