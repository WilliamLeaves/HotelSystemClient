package blservice.impl;

import VO.CustemorInfoChangeVO;
import VO.CustomerVO;
import VO.SystemManagerVO;
import blservice.UserInfo_blservice;
import other.ResultMessage;


public class UserInfo_bl implements UserInfo_blservice{

	SystemManagerVO mana;
	public SystemManagerVO getSystemManagerInfo(String SystemManager_name) {
		
		return null;
	}

	public ResultMessage modifySystemManagerInfo(SystemManagerVO systemManager) {
		
		return null;
	}

	public ResultMessage CustomerinfoModify(CustomerVO Customer, CustemorInfoChangeVO VO) {
		return ResultMessage.FAILED;
	}

	public ResultMessage CustomerinfoShow(CustomerVO Customer) {
		return ResultMessage.FAILED;
	}
//≤‚ ‘Mock ¥˙¬Î
	public void add(SystemManagerVO manager) {
		// TODO Auto-generated method stub
		this.mana = manager;
		return;
	}
	public SystemManagerVO  get(){
		return mana;
	}

	@Override
	public CustomerVO getCustomerInfo(String id) {
		// TODO Auto-generated method stub
		return new CustomerVO();
	}
}
