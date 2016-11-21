package presentation.view.hotel_ui;

import other.ResultMessage;
import VO.HotelInfoVO;

public interface HotelInfoControllerService {
	public ResultMessage modifyHotelInfo(HotelInfoVO hotelInfo);

	public HotelInfoVO getHotelInfo(String hotelId);

	public ResultMessage showHotelInfo(HotelInfoVO hotelInfo);
}
