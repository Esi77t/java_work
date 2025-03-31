package ex06_List;

// 유저의 아이디와 패스워드를 가지는
// UserInfo클래스를 하나 만든다. 필드는 private로 지정한다

public class UserInfo {
	private String userID;
	private int password;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public int getPassword() {
		return password;
	}
	
	public void setPassword(int password) {
		this.password = password;
	}
}
