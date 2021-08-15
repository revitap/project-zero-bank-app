package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.pojo.User;
import common.util.DBUtil;

public class UserDao {
	
	public User checkCredentialsUser(String email, String pword) {
		List<User> users = new ArrayList<User>();
		User validUser = new User();
		
		try {
			Connection conn = DBUtil.getInstance().getConnection();
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM bankapp.users WHERE email = ? and pword = ?;");
			pstmt.setString(1, email);
			pstmt.setString(2, pword);
			
			ResultSet rs = pstmt.executeQuery();
			
			
			while (rs.next()) {
				users.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
				validUser = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
		}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
		
		return validUser;
	}
}
