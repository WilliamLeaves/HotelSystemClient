package presentation.view.hotel_ui;

import java.util.ArrayList;

import other.ResultMessage;
import PO.Label;
import PO.Rank;

public interface HotelAssessmentControllerService {
	public ResultMessage addAssessment(String hotelID, String assessment);

	public ResultMessage addRankAssessment(String hotelID, Rank rank);

	public ResultMessage addLabelAssessment(String hotelID,
			ArrayList<Label> labelList);
}
