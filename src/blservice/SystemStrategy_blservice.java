package blservice;

import java.util.ArrayList;

import VO.SystemStrategy1VO;
import VO.SystemStrategyVO;
import other.ResultMessage;

public interface SystemStrategy_blservice {
	 
	public ArrayList<SystemStrategyVO> getAllSystemStrategys(String systemStaffID);
	
	public SystemStrategyVO getSystemStrategy(String systemStrategy_Name);
	
	public ResultMessage deleteSystemStrategy(String systemStrategy_Name);
	
	public ResultMessage modifySystemStrategy(SystemStrategyVO systemstrategyvo);
	
	public SystemStrategyVO makeSystemStrategy(SystemStrategyVO systemstrategyvo);
	
	public SystemStrategy1VO makeSystemStrategy1(SystemStrategy1VO systemstrategy);

	public ResultMessage modifySystemStrategy1(SystemStrategy1VO systemstrategy);
}
