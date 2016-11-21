package presentation.controller.hotelController;

import java.util.ArrayList;

import PO.Label;
import PO.Rank;
import blservice.Hotel_blservice;
import other.ResultMessage;
import presentation.view.hotel_ui.HotelAssessmentControllerService;

public class HotelAssessmentController implements HotelAssessmentControllerService{
	Hotel_blservice hotelService;

	public ResultMessage addAssessment(String hotelID, String assessment) {
		this.hotelService.addAssessment(hotelID, assessment);
		return ResultMessage.SUCCESSFUL;

	}

	public ResultMessage addRankAssessment(String hotelID, Rank rank) {
		this.hotelService.addRankAssessment(hotelID, rank);
		return ResultMessage.SUCCESSFUL;
	}

	public ResultMessage addLabelAssessment(String hotelID,
			ArrayList<Label> labelList) {
		this.hotelService.addLabelAssessment(hotelID, labelList);
		return ResultMessage.SUCCESSFUL;
	}
	
}
