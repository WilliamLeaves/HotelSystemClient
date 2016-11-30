package main;

import java.io.IOException;

import VO.CustomerVO;
import VO.HotelInfoVO;
import VO.HotelStaffVO;
import VO.SystemManagerVO;
import VO.SystemStaffVO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import presentation.controller.hotelController.BookHotelController;
import presentation.controller.hotelController.HotelInfoController;
import presentation.controller.hotelController.HotelViewController;
import presentation.controller.userInfoController.CustomerInfoController;
import presentation.controller.userInfoController.CustomerInfoModifyController;
import presentation.controller.userInfoController.CustomerMemberModifyController;
import presentation.controller.userInfoController.CustomerPasswordModifyController;
import presentation.controller.userInfoController.HotelStaffInfoController;
import presentation.controller.userInfoController.HotelStaffInfoModifyController;
import presentation.controller.userInfoController.HotelStaffPasswordModifyController;
import presentation.controller.userInfoController.SystemManagerInfoController;
import presentation.controller.userInfoController.SystemManagerInfoModifyController;
import presentation.controller.userInfoController.SystemManagerPasswordModifyController;
import presentation.controller.userInfoController.SystemStaffInfoController;
import presentation.controller.userInfoController.SystemStaffInfoModifyController;
import presentation.controller.userInfoController.SystemStaffPasswordModifyController;

public class Main extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;

	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("HotelSystem");
		initRootLayout();
		//this.showCustomerInfoScene(new CustomerVO());
		// this.showHotelStaffInfoScene(new HotelStaffVO());
		// this.showSystemStaffInfoScene(new SystemStaffVO());
		// this.showSystemManagerInfoScene(new SystemManagerVO());
		this.showCustomerBookHotelScene(new CustomerVO(), new HotelInfoVO());
	}

	/**
	 * show 显示客户用户的维护个人信息界面
	 * 
	 * @param customer
	 *            接受从其他界面传过来的CustomerVO 对象作为参数
	 */
	public void showCustomerInfoScene(CustomerVO customer) {
		// TODO Auto-generated method stub
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/CustomerInfoScene.fxml"));
			AnchorPane customerInfoScene = (AnchorPane) loader.load();
			rootLayout.setCenter(customerInfoScene);

			// get Controller
			CustomerInfoController customerInfoController = loader.getController();
			customerInfoController.initialize(this, customer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示客户用户的修改个人信息界面
	 * 
	 * @param customer
	 *            接受从其他界面传过来的CustomerVO 对象作为参数
	 */
	public void showCustomerModifyScene(CustomerVO customer) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/CustomerInfoModifyScene.fxml"));
			AnchorPane customerInfoModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(customerInfoModifyScene);

			// get Controller
			CustomerInfoModifyController customerInfoModifyController = loader.getController();
			customerInfoModifyController.initialize(this, customer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示客户用户的修改密码界面
	 * 
	 * @param customer
	 *            接受从其他界面传过来的CustomerVO 对象作为参数
	 */
	public void showCustomerPasswordModifyScene(CustomerVO customer) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/userInfo_ui/CustomerPasswordModifyScene.fxml"));
			AnchorPane customerPasswordModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(customerPasswordModifyScene);

			// get Controller
			CustomerPasswordModifyController customerPasswordModifyController = loader.getController();
			customerPasswordModifyController.initialize(this, customer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示客户用户的注册会员界面
	 * 
	 * @param customer
	 *            接受从其他界面传过来的CustomerVO 对象作为参数
	 */
	public void showCustomerMemberModifyScene(CustomerVO customer) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/CustomerMemberModifyScene.fxml"));
			AnchorPane customerMemberModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(customerMemberModifyScene);

			// get Controller
			CustomerMemberModifyController customerMemberModifyController = loader.getController();
			customerMemberModifyController.initialize(this, customer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示酒店工作人员的维护个人信息界面
	 * 
	 * @param hotelStaff
	 *            接受从其他界面传过来的HotelStaffVO 对象作为参数
	 */
	public void showHotelStaffInfoScene(HotelStaffVO hotelStaff) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/HotelStaffInfoScene.fxml"));
			AnchorPane HotelStaffInfoScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelStaffInfoScene);

			// get Controller
			HotelStaffInfoController HotelStaffInfoController = loader.getController();
			HotelStaffInfoController.initialize(this, hotelStaff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示酒店工作人员修改个人信息界面
	 * 
	 * @param hotelStaff
	 *            接受从其他界面传来的HotalStaffVO 对象作为参数
	 */
	public void showHotelStaffInfoModifyScene(HotelStaffVO hotelStaff) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/HotelStaffInfoModifyScene.fxml"));
			AnchorPane HotelStaffInfoModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelStaffInfoModifyScene);

			// get Controller
			HotelStaffInfoModifyController HotelStaffInfoModifyController = loader.getController();
			HotelStaffInfoModifyController.initialize(this, hotelStaff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示酒店工作人员修改密码界面
	 * 
	 * @param hotelStaff
	 *            接受从其他界面传来的HotalStaffVO 对象作为参数
	 */
	public void showHotelStaffPasswordModifyScene(HotelStaffVO hotelStaff) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/userInfo_ui/HotelStaffPasswordModifyScene.fxml"));
			AnchorPane HotelStaffPasswordModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelStaffPasswordModifyScene);

			// get Controller
			HotelStaffPasswordModifyController HotelStaffPasswordModifyController = loader.getController();
			HotelStaffPasswordModifyController.initialize(this, hotelStaff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示网站营销人员维护个人信息界面
	 * 
	 * @param systemStaff
	 *            接受从其他界面传来的SystemStaffVO 对象作为参数
	 */
	public void showSystemStaffInfoScene(SystemStaffVO systemStaff) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/SystemStaffInfoScene.fxml"));
			AnchorPane SystemStaffInfoModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(SystemStaffInfoModifyScene);

			// get Controller
			SystemStaffInfoController SystemStaffInfoController = loader.getController();
			SystemStaffInfoController.initialize(this, systemStaff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示网站营销人员修改个人信息界面
	 * 
	 * @param systemStaff
	 *            接受从其他界面传来的SystemStaffVO 对象作为参数
	 */
	public void showSystemStaffInfoModifyScene(SystemStaffVO systemStaff) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/userInfo_ui/SystemStaffInfoModifyScene.fxml"));
			AnchorPane SystemStaffInfoModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(SystemStaffInfoModifyScene);

			// get Controller
			SystemStaffInfoModifyController SystemStaffInfoModifyController = loader.getController();
			SystemStaffInfoModifyController.initialize(this, systemStaff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示网站营销人员修改密码界面
	 * 
	 * @param systemStaff
	 *            接受从其他界面传来的SystemStaffVO 对象作为参数
	 */
	public void showSystemStaffPasswordModifyScene(SystemStaffVO systemStaff) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/userInfo_ui/SystemStaffPasswordModifyScene.fxml"));
			AnchorPane SystemStaffPasswordModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(SystemStaffPasswordModifyScene);

			// get Controller
			SystemStaffPasswordModifyController SystemStaffPasswordModifyController = loader.getController();
			SystemStaffPasswordModifyController.initialize(this, systemStaff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示网站营销人员维护个人信息界面
	 * 
	 * @param systemManager
	 *            接受从其他界面传来的SystemManagerVO 对象作为参数
	 */
	public void showSystemManagerInfoScene(SystemManagerVO systemManager) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/SystemManagerInfoScene.fxml"));
			AnchorPane SystemManagerInfoScene = (AnchorPane) loader.load();
			rootLayout.setCenter(SystemManagerInfoScene);

			// get Controller
			SystemManagerInfoController SystemManagerInfoController = loader.getController();
			SystemManagerInfoController.initialize(this, systemManager);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示网站营销人员修改个人信息界面
	 * 
	 * @param systemManager
	 *            接受从其他界面传来的SystemManagerVO 对象作为参数
	 */
	public void showSystemManagerInfoModifyScene(SystemManagerVO systemManager) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/userInfo_ui/SystemManagerInfoModifyScene.fxml"));
			AnchorPane SystemManagerInfoModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(SystemManagerInfoModifyScene);

			// get Controller
			SystemManagerInfoModifyController SystemManagerInfoModifyController = loader.getController();
			SystemManagerInfoModifyController.initialize(this, systemManager);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示网站营销人员修改密码界面
	 * 
	 * @param systemManager
	 *            接受从其他界面传来的SystemManagerVO 对象作为参数
	 */
	public void showSystemManagerPasswordModifyScene(SystemManagerVO systemManager) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/userInfo_ui/SystemManagerPasswordModifyScene.fxml"));
			AnchorPane SystemManagerPasswordModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(SystemManagerPasswordModifyScene);

			// get Controller
			SystemManagerPasswordModifyController SystemManagerPasswordModifyController = loader.getController();
			SystemManagerPasswordModifyController.initialize(this, systemManager);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param customer
	 * @param hotel
	 */
	public void showCustomerBookHotelScene(CustomerVO customer, HotelInfoVO hotel) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/hotel_ui/BookHotelScene.fxml"));
			AnchorPane BookHotelScene = (AnchorPane) loader.load();
			rootLayout.setCenter(BookHotelScene);

			// get Controller
			BookHotelController BookHotelController = loader.getController();
			BookHotelController.initialize(this, customer, hotel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param customer
	 * @param hotel
	 */
	public void showCustomerHotelInfoScene(CustomerVO customer, HotelInfoVO hotel) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/hotel_ui/HotelInfoScene.fxml"));
			AnchorPane HotelInfoScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelInfoScene);

			// get Controller
			HotelInfoController HotelInfoController = loader.getController();
			HotelInfoController.initialize(this, customer, hotel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param customer
	 * @param hotel
	 */
	public void showCustomerHotelViewScene(CustomerVO customer, HotelInfoVO hotel) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/hotel_ui/HotelViewScene.fxml"));
			AnchorPane HotelViewScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelViewScene);

			// get Controller
			HotelViewController HotelViewController = loader.getController();
			HotelViewController.initialize(this, customer, hotel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void initRootLayout() {
		// TODO Auto-generated method stub
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			Scene scene = new Scene(rootLayout);
			this.primaryStage.setScene(scene);
			this.primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
