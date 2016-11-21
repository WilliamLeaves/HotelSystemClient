package main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import presentation.controller.userInfoController.CustomerInfoController;
import presentation.controller.userInfoController.CustomerInfoModifyController;
import presentation.controller.userInfoController.CustomerMemberModifyController;

public class Main extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;

	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("HotelSystem");
		initRootLayout();
		//showCustomerInfoScene();
		showCustomerModifyScene();
		//showCustomerMemberModifyScene();
	}

	private void showCustomerInfoScene() {
		// TODO Auto-generated method stub
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/CustomerInfoScene.fxml"));
			AnchorPane customerInfoScene = (AnchorPane) loader.load();
			rootLayout.setCenter(customerInfoScene);

			// get Controller
			CustomerInfoController customerInfoController = loader.getController();
			customerInfoController.CustomerinfoShow(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showCustomerModifyScene() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/CustomerInfoModifyScene.fxml"));
			AnchorPane customerInfoModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(customerInfoModifyScene);

			// get Controller
			CustomerInfoModifyController customerInfoModifyController = loader.getController();
			customerInfoModifyController.initialize(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void showCustomerMemberModifyScene(){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/CustomerMemberModifyScene.fxml"));
			AnchorPane customerMemberModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(customerMemberModifyScene);

			// get Controller
			CustomerMemberModifyController customerMemberModifyController = loader.getController();
			customerMemberModifyController.CustomerinfoShow(this);
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
