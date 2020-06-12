package member;

public class Member {
	private String userid, password, name;
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUserid() {
		return this.userid;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "[id: " + userid +", password: " + password + ", name: " + name +"]";
	}
}
