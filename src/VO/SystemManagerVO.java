package VO;

public class SystemManagerVO {
	public String getUserName() {
		return systemmanager_Name;
	}

	public String getId() {
		return systemmanager_Id;
	}

	private String password;
	private String systemmanager_Name;
	private String systemmanager_Id;

	public SystemManagerVO() {
		this.systemmanager_Name = "Tim";
		this.systemmanager_Id = "400001";
		this.password = "Tim400001";
	}

	public void setUsername(String name) {
		// TODO Auto-generated method stub
		this.systemmanager_Name = name;
	}
}
