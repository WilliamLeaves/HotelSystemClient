package presentation.view.hotel_ui;

import java.util.ArrayList;

import other.ResultMessage;
import other.SortMethod;
import VO.HotelInfoVO;

public interface HotelViewControllerService {
	public HotelInfoVO getHotelInfo(String hotelId) ;

	public ResultMessage showHotelInfo(HotelInfoVO HotelInfo) ;
	public String[] getListOfHotelId() ;

	public ArrayList<HotelInfoVO> getListOfHotel(String[] hotelId) ;

	public ResultMessage showHotelList(ArrayList<HotelInfoVO> list) ;

	public ArrayList<HotelInfoVO> HotelListSort(SortMethod method,
			ArrayList<HotelInfoVO> list);

	public String[] getListOfHotelPrefer(String userId) ;

	public ResultMessage bookRoom(String hotelID);
}
