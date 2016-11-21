package presentation.view.userManagement_ui;

import java.util.ArrayList;

import VO.SystemStaffVO;

public interface SystemStaffManagementContrllerService {
	
	public ArrayList<SystemStaffVO> getSystemStaff(String systemstaff_id);

	public boolean modifySystemStaffManagement(SystemStaffVO systemstaff, SystemStaffVO systemStaffChange);

}
