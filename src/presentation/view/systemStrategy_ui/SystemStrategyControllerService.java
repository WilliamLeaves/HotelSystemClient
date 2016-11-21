package presentation.view.systemStrategy_ui;

import java.util.ArrayList;

import VO.SystemStrategy1VO;
import VO.SystemStrategyVO;
import other.ResultMessage;

public interface SystemStrategyControllerService {
    
	public ArrayList<SystemStrategyVO> getAllSystemStrategys(String systemStaffID);
	
	public SystemStrategyVO getSystemStrategy(String systemStrategy_Name);
	
	public ResultMessage modifySystemStrategy(SystemStrategyVO systemStrategy);
	
	public ResultMessage deleteSystemStrategy(String systemStrategy_Name);
	
	public SystemStrategyVO makeSystemStrategy(SystemStrategyVO systemStrategy);
	
	public SystemStrategy1VO makeSystemStrategy1(SystemStrategy1VO systemstrategy);
	
	public ResultMessage modifySystemStrategy1(SystemStrategy1VO systemstrategy);
	
}
