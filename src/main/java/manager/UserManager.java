package manager;

import common.pojo.User;
import dao.UserDao;
import dao.RegisterDao;

public class UserManager {
	
	private UserDao userDao = new UserDao();
	private RegisterDao registerDao = new RegisterDao();

	public User checkCredentialsUser(String email, String pword) {
		
		return userDao.checkCredentialsUser(email, pword);
	}
	
	public void registerUser(String firstName, String lastName, String userType, String email, String pword) {
		registerDao.registerUser(firstName, lastName, userType, email, pword);
	}
}
