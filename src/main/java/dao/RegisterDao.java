package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;

//import common.pojo.User;
import common.util.DBUtil;

public class RegisterDao {
	
	public void registerUser(String firstName, String lastName, String userType, String email, String pword) {		
		
		try {
			Connection conn = DBUtil.getInstance().getConnection();
			PreparedStatement pstmt = conn.prepareStatement("insert into bankapp.users (firstname, lastname, usertype, email, pword) values (?, ?, ?, ?, ?)");			
			
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setString(3, userType);
			pstmt.setString(4, email);
			pstmt.setString(5, pword);
			
			pstmt.executeUpdate();			
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}
}
