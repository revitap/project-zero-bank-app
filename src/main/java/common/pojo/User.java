package common.pojo;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String userType;
	private String email;
	private String pword;
	

	public User() {
		super();
	}
	
	public User(String firstName) {
		super();
		this.firstName = firstName;
	}

	
	public User(int id, String firstName, String lastName, String userType, String email, String pword) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
		this.email = email;
		this.pword = pword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getpword() {
		return pword;
	}

	public void setpword(String pword) {
		this.pword = pword;
	}

}
