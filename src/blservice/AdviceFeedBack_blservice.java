package blservice;

import java.util.ArrayList;

import VO.AdviceFeedBackVO;
import other.ResultMessage;

public interface AdviceFeedBack_blservice {

	public ArrayList<AdviceFeedBackVO> getAllAdvice(String userID);

	public ResultMessage addAdviceFeedBack(AdviceFeedBackVO advicefeedbackvo);

	public ResultMessage modifyAdviceFeedBack(AdviceFeedBackVO advicefeedbackvo);

	public ArrayList<AdviceFeedBackVO> getUnprocessedAdvice(String systemstaffId);

    public ArrayList<AdviceFeedBackVO> getProcessedAdvice(String systemstaffId);
	
	public ResultMessage setStateOfAdvice(String Adviceid);
}
