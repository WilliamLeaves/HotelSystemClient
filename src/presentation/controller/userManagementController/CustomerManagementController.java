package presentation.controller.userManagementController;

import java.util.ArrayList;

import VO.CustomerVO;
import presentation.view.userManagement_ui.CustomerManagementControllerService;

public class CustomerManagementController implements CustomerManagementControllerService{

	public ArrayList<CustomerVO> getCustomer(String user_id) {
		
		CustomerVO customerA = new CustomerVO("15125012","chenbubing",100);
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		list.add(customerA);
		return list;
	}

	public boolean modifyCustomerManagement(CustomerVO customer, CustomerVO customerChange) {
		return false;
	}

}
