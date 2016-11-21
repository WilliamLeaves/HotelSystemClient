package PO;

import other.AdviceFeedBackState;

public class AdviceFeedBackPO {
       AdviceFeedBackState state;
       String AdviceFeedBack_content;
       String AdviceId;
       
       public AdviceFeedBackPO(){
    	   super();
       }
       
       public AdviceFeedBackPO(AdviceFeedBackState state1,String adviceFeedBack_content,String AdviceID){
    	   super();
    	   this.AdviceFeedBack_content = adviceFeedBack_content;
    	   this.state = state1;
    	   this.AdviceId =AdviceID;
       }

	public AdviceFeedBackState getState() {
		return state;
	}

	public void setState(AdviceFeedBackState state) {
		this.state = state;
	}

	public String getAdviceFeedBack_content() {
		return AdviceFeedBack_content;
	}

	public void setAdviceFeedBack_content(String adviceFeedBack_content) {
		AdviceFeedBack_content = adviceFeedBack_content;
	}

	public String getAdviceId() {
		return AdviceId;
	}
	
	public void setAdviceId(String adviceId){
		AdviceId = adviceId;
	}
}
