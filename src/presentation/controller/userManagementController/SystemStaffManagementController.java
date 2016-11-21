package presentation.controller.userManagementController;

import java.util.ArrayList;
import VO.SystemStaffVO;
import presentation.view.userManagement_ui.SystemStaffManagementContrllerService;

public class SystemStaffManagementController implements SystemStaffManagementContrllerService{

	public ArrayList<SystemStaffVO> getSystemStaff(String systemstaff_id) {
		SystemStaffVO staffB = new SystemStaffVO();
		ArrayList<SystemStaffVO> list = new ArrayList<SystemStaffVO>();
		list.add(staffB);
		return list;
	}

	public boolean modifySystemStaffManagement(SystemStaffVO systemstaff, SystemStaffVO systemStaffChange) {
		return false;
	}

}
