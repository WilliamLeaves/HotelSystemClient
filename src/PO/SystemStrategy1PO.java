package PO;
/**
 * 会员的等级的制定
 * 
 * @author zhiting xin
 *
 */
public class SystemStrategy1PO {
     
	private String systemStrategy_name;
	private int[] memberGrade;
	private String bussinessDistrict;
	private double[] discout;
	
	public SystemStrategy1PO(){
		super();
	}

	public SystemStrategy1PO(String systemStrategyname,int[] membergrade,String bussinessdistrict
			,double[] discout){
		super();
		this.systemStrategy_name=systemStrategyname;
		this.memberGrade = membergrade;
		this.discout = discout;
		this.bussinessDistrict=bussinessdistrict ;
	}
	public String getSystemStrategy_name() {
		return systemStrategy_name;
	}
	
	public void setSystemStrategy_name(String systemStrategy_name) {
		this.systemStrategy_name = systemStrategy_name;
	}
	
	public int[] getMemberGrade() {
		return memberGrade;
	}
	
	public void setMemberGrade(int[] memberGrade) {
		this.memberGrade = memberGrade;
	}
	
	public String getBussinessDistrict() {
		return bussinessDistrict;
	}
	
	public void setBussinessDistrict(String bussinessDistrict) {
		this.bussinessDistrict = bussinessDistrict;
	}
	
	public double[] getDiscout() {
		return discout;
	}
	
	public void setDiscout(double[] discout) {
		this.discout = discout;
	}
	
	
}
