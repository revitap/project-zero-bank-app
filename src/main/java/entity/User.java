package entity;

public class User {
	
	private int Id;
    private String firstName;
    private String lastName;
    private String userType;

    public User() {

    }

    public User(int id, String firstName, String lastName, String userType) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

}
