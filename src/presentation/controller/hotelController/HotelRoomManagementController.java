package presentation.controller.hotelController;

import PO.HotelRoomInfoPO;
import VO.HotelRoomInfoVO;
import blservice.Hotel_blservice;
import other.ResultMessage;
import presentation.view.hotel_ui.HotelRoomManagementControllerService;

public class HotelRoomManagementController implements HotelRoomManagementControllerService{
	Hotel_blservice hotelService;

	public ResultMessage roomModify(String hotelId, HotelRoomInfoVO currentInfo) {
		this.hotelService.roomModify(hotelId, new HotelRoomInfoPO(currentInfo));
		return ResultMessage.SUCCESSFUL;
	}

	public HotelRoomInfoVO getHotelRoomInfo(String hotelId) {
		return new HotelRoomInfoVO(this.hotelService.getHotelRoomInfo(hotelId));
	}

	public ResultMessage showHotelRoomInfo(HotelRoomInfoVO currentInfo) {
		return ResultMessage.SUCCESSFUL;
	}

}
