package presentation.view.hotel_ui;

import java.util.ArrayList;

import other.ResultMessage;
import PO.Label;

public interface AssessmentManagementControllerService {

	public ArrayList<Label> getLabelAssessment(String hotelId);

	public ResultMessage showLabelAssessment(ArrayList<Label> labelList);

	public ResultMessage deleteLabelAssessment(String hotelID, Label label);
}
