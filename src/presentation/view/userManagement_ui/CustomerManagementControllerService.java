package presentation.view.userManagement_ui;

import java.util.ArrayList;

import VO.CustomerVO;

public interface CustomerManagementControllerService {
	
	public ArrayList<CustomerVO> getCustomer(String user_id);

	public boolean modifyCustomerManagement(CustomerVO customer, CustomerVO customerChange);

}
