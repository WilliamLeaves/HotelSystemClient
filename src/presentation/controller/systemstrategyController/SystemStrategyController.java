package presentation.controller.systemstrategyController;

import java.util.ArrayList;

import VO.SystemStrategy1VO;
import VO.SystemStrategyVO;
import blservice.SystemStrategy_blservice;
import blservice.impl.SystemStrategy_bl;
import other.ResultMessage;
import presentation.view.systemStrategy_ui.SystemStrategyControllerService;
import presentation.view.systemStrategy_ui.SystemStrategyView;

public class SystemStrategyController implements  SystemStrategyControllerService{
	
	private SystemStrategy_blservice systemStrategy_blservice;
	
	private String UserId;
	
	private SystemStrategyView view;
	
	public SystemStrategyController(String userId){
		systemStrategy_blservice  = new SystemStrategy_bl();
		this.UserId = userId;
	}

	public ArrayList<SystemStrategyVO> getAllSystemStrategys(String userID) {
		return systemStrategy_blservice.getAllSystemStrategys(userID);
	}

	public SystemStrategyVO getSystemStrategy(String systemStrategy_Name) {
		return systemStrategy_blservice.getSystemStrategy(systemStrategy_Name);
	}

	public ResultMessage deleteSystemStrategy(String systemStrategy_Name) {
		return systemStrategy_blservice.deleteSystemStrategy(systemStrategy_Name);
	}

	public ResultMessage modifySystemStrategy(SystemStrategyVO systemStrategy) {
		return systemStrategy_blservice.modifySystemStrategy(systemStrategy);
	}

	public SystemStrategyVO makeSystemStrategy(SystemStrategyVO systemStrategy) {
		return systemStrategy_blservice.makeSystemStrategy(systemStrategy);
	}

	public SystemStrategy1VO makeSystemStrategy1(SystemStrategy1VO systemstrategy) {
		// TODO Auto-generated method stub
		return systemStrategy_blservice.makeSystemStrategy1(systemstrategy);
	}

	public ResultMessage modifySystemStrategy1(SystemStrategy1VO systemstrategy) {
		// TODO Auto-generated method stub
		return systemStrategy_blservice.modifySystemStrategy1(systemstrategy);
	}

	
}
