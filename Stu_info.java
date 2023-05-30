package java_placement;

public class Stu_info {
	
	private String name;
	private int uid;
	private int mobile;
	private String email;
	
	public String getName() {
			return name;
		}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getUid() {
		return uid;
	}
	
	public void setUid(int id) {
		uid = id;
	}
	

	public int getMobile() {
		return mobile;
	}
	
	public void setMobile(int m) {
		mobile = m;
	}
	

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String e) {
		email = e;
	}
	
	//CONSTRUCTOR
	public Stu_info() {
		name = "test";
		uid = 00;
		mobile = 839753947;
		email = "dhsdh@db.com";
	}
	
	void display() {
		System.out.println(name + uid + mobile + email);
	}
	

}