package PO;

public class SystemStaffPO {
	private String id;

	private String username;

	private String phone;
	
	private String businessDistrict;

	public SystemStaffPO() {
		super();
	}

	public SystemStaffPO(String id, String username, String phone) {
		super();
		this.id = id;
		this.username = username;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBusinessDistrict() {
		return businessDistrict;
	}

	public void setBusinessDistrict(String businessDistrict) {
		this.businessDistrict = businessDistrict;
	}
}
