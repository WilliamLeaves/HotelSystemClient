package data.service;

import java.util.ArrayList;

import PO.HotelInfoPO;
import PO.HotelRoomInfoPO;
import PO.HotelStrategyPO;
import other.ResultMessage;

public interface Hotel_dataService {
	public ResultMessage add_hotel(HotelInfoPO hotelA);

	public ResultMessage delete_hotel(String hotelID);

	public ResultMessage modify_hotel(HotelInfoPO hotelA);

	public HotelInfoPO find_hotel(String hotelID);

	public ArrayList<HotelInfoPO> show_hotel(String hotelName);

	public ResultMessage add_hotelStrategy(String hotelID,
			HotelStrategyPO hotelStratrgy);

	public ResultMessage delete_hotelStrategy(String hotelID);

	public ResultMessage modify_hotelStrategy(String hotelID,
			HotelStrategyPO hotelStrategy);

	public HotelStrategyPO find_hotelStrategy(String hotelStrategyID);

	public ResultMessage add_room(String hotelID, HotelRoomInfoPO roomA);

	public ResultMessage modify_room(String hotelID, HotelRoomInfoPO roomA);

	public ResultMessage delete_room(String hotelID, HotelRoomInfoPO roomA);
}
