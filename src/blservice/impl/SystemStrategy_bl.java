package blservice.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import PO.SystemStaffPO;
import PO.SystemStrategy1PO;
import PO.SystemStrategyPO;
import VO.SystemStrategy1VO;
import VO.SystemStrategyVO;
import blservice.SystemStrategy_blservice;
import other.ResultMessage;

public class SystemStrategy_bl implements SystemStrategy_blservice{

	public ArrayList<SystemStrategyVO> getAllSystemStrategys(String systemStaffID) {
		ArrayList<SystemStrategyVO> alist = new ArrayList<SystemStrategyVO>();
		SimpleDateFormat format= new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String str = "2016年01月15日 20:30:23";
		String str1 = "2017年03月30日 15:30:05";
		Date begin=new Date();
		Date end = new Date();
		try {
			begin = format.parse(str);
			end = format.parse(str1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SystemStrategyPO system =  new SystemStrategyPO("满减",3.0,begin,end);
		SystemStaffPO systemstaff = new SystemStaffPO("151252077","tianguisong","15246349865");
		SystemStrategyVO systemstrategyvo1 = new SystemStrategyVO(system,systemstaff);
		alist.add(systemstrategyvo1);
		return alist;
	}

	public SystemStrategyVO getSystemStrategy(String systemStrategy_Name) {
		SimpleDateFormat format= new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String str = "2016年01月15日 20:30:23";
		String str1 = "2017年03月30日 15:30:05";
		Date begin=new Date();
		Date end = new Date();
		try {
			begin = format.parse(str);
			end = format.parse(str1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SystemStrategyPO system =  new SystemStrategyPO("满减",3.0,begin,end);
		SystemStaffPO systemstaff = new SystemStaffPO("151252077","tianguisong","15246349865");
		SystemStrategyVO systemstrategyvo1 = new SystemStrategyVO(system,systemstaff);
		return systemstrategyvo1;
	}

	public ResultMessage deleteSystemStrategy(String systemStrategy_Name) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESSFUL;
	}

	public ResultMessage modifySystemStrategy(SystemStrategyVO systemstrategyvo) {
		// TODO Auto-generated method stub
		return ResultMessage.FAILED;
	}

	public SystemStrategyVO makeSystemStrategy(SystemStrategyVO systemstrategyvo) {
		// TODO Auto-generated method stub
		SimpleDateFormat format= new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String str = "2016年01月15日 20:30:23";
		String str1 = "2017年03月30日 15:30:05";
		Date begin=new Date();
		Date end = new Date();
		try {
			begin = format.parse(str);
			end = format.parse(str1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SystemStrategyPO system =  new SystemStrategyPO("满减",3.0,begin,end);
		SystemStaffPO systemstaff = new SystemStaffPO("151252077","tianguisong","15246349865");
		SystemStrategyVO systemstrategyvo1 = new SystemStrategyVO(system,systemstaff);
		return systemstrategyvo1;
	}

	public SystemStrategy1VO makeSystemStrategy1(SystemStrategy1VO systemstrategy) {
		// TODO Auto-generated method stub
		int[] memberGrade = {1,2,3,4,5,6};
		double[] discount = {2.5,3.0,5.0,6.0,7.0,8.0};
		SystemStrategy1PO systemStrategy = new SystemStrategy1PO("会员优惠",memberGrade,"南京栖霞区",discount);
		SystemStaffPO systemstaff = new SystemStaffPO("151252077","tianguisong","15246349865");
		SystemStrategy1VO systemStrategy1 = new SystemStrategy1VO(systemStrategy,systemstaff);;
		return systemStrategy1;
	}

	public ResultMessage modifySystemStrategy1(SystemStrategy1VO systemstrategy) {
		// TODO Auto-generated method stub
		return ResultMessage.FAILED;
	}

}
