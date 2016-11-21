package presentation.controller.userInfoController;

import VO.SystemManagerVO;
import blservice.UserInfo_blservice;
import blservice.impl.UserInfo_bl;
import other.ResultMessage;


public class SystemManagerInfoController{

	private UserInfo_blservice systemManagerInfoService;
	public SystemManagerInfoController(){
		systemManagerInfoService = new UserInfo_bl();
	}
	public ResultMessage modifySystemManagerInfo(SystemManagerVO systemManager) {
		
		return  systemManagerInfoService.modifySystemManagerInfo(systemManager);
	}

	public SystemManagerVO getSystemManagerInfo(String systemManager_Name) {
		
		return systemManagerInfoService.getSystemManagerInfo(systemManager_Name);
	}

	//≤‚ ‘
	public void add(SystemManagerVO manager) {
		// TODO Auto-generated method stub
		systemManagerInfoService.add(manager);
		return ;
	}
	
	public SystemManagerVO  get(){
		return systemManagerInfoService.get();
	}
	
}
