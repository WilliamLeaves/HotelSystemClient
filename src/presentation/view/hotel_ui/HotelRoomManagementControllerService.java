package presentation.view.hotel_ui;

import other.ResultMessage;
import VO.HotelRoomInfoVO;

public interface HotelRoomManagementControllerService {
	public ResultMessage roomModify(String hotelId, HotelRoomInfoVO currentInfo);

	public HotelRoomInfoVO getHotelRoomInfo(String hotelId);

	public ResultMessage showHotelRoomInfo(HotelRoomInfoVO currentInfo);
}
