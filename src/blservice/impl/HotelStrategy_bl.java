package blservice.impl;

import java.util.ArrayList;

import PO.HotelStrategyPO;
import VO.HotelStrategyVO;
import blservice.HotelStrategy_blservice;
import data.service.Hotel_dataService;
import other.ResultMessage;

public class HotelStrategy_bl implements HotelStrategy_blservice {
	Hotel_dataService hotelService;

	/**
	 * 
	 */
	public ResultMessage makeHotelStrategy(HotelStrategyVO hotelstrategy) {
		// TODO Auto-generated method stub
		HotelStrategyPO hotelstrategyPO = new HotelStrategyPO(hotelstrategy);
		hotelService.add_hotelStrategy(hotelstrategyPO.getHotelID(),
				hotelstrategyPO);
		return ResultMessage.SUCCESSFUL;
	}

	public ResultMessage modifyHotelStrategy(HotelStrategyVO hotelstrategy) {
		// TODO Auto-generated method stub
		HotelStrategyPO hotelstrategyPO = new HotelStrategyPO(hotelstrategy);
		hotelService.modify_hotelStrategy(hotelstrategyPO.getHotelID(),
				hotelstrategyPO);

		return ResultMessage.SUCCESSFUL;
	}

	public ResultMessage deleteHotelStrategy(String hotelStrategyId) {
		// TODO Auto-generated method stub
		hotelService.delete_hotelStrategy(hotelStrategyId);
		return ResultMessage.SUCCESSFUL;
	}

	public HotelStrategyVO getHotelStrategy(String HotelStrategyId) {
		// TODO Auto-generated method stub
		return new HotelStrategyVO(
				hotelService.find_hotelStrategy(HotelStrategyId));
	}

	public ArrayList<HotelStrategyVO> getListOfHotelStrategys(String hotel_id) {
		// TODO Auto-generated method stub

		ArrayList<HotelStrategyVO> list = new ArrayList<HotelStrategyVO>(100);
		list.add(new HotelStrategyVO(hotelService.find_hotelStrategy(hotel_id)));
		return list;
	}

}
