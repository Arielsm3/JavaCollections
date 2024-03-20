package project1;

public class User {

	private String userName;
	private String emailId;
	private String password;
	private double superCoins;
	
	private final boolean adminStatus = (userName == "Princy");
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public double getSuperCoins() {
		return superCoins;
	}
	public void setSuperCoins(double superCoins) {
		this.superCoins = superCoins;
	}
	
	public boolean getAdminStatus() {
		return adminStatus;
	}
	
}
