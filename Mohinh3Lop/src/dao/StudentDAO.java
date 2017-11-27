/**
 * 
 */
package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import model.Student;
import util.ConnectionDB;
import util.SqlQuery;

/**
 *@description
 *@author: User
 *@date:Nov 27, 2017
 *@time:11:19:57 AM
 *
 */
public class StudentDAO {
	/**
	 * Insert Student (account,firstName,lastName,email)
	 * @param account,firstName,lastName,email
	 * */
	public boolean insertStudetn(Student student) throws SQLException {
		Connection conn = DriverManager.getConnection(ConnectionDB.dbURL);
		PreparedStatement prSt = conn.prepareStatement(SqlQuery.INSERT);
		prSt.setString(1, student.getAccount());
		prSt.setString(2, student.getFirstName());
		prSt.setString(3, student.getLastName());
		prSt.setString(4, student.getEmail());
		try {
			prSt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	/**
	 * Update Email by Account
	 * @param email
	 * @param acount
	 * */
	public boolean updateStudent(Student student) throws SQLException{
		Connection conn = DriverManager.getConnection(ConnectionDB.dbURL);
		PreparedStatement prSt = conn.prepareStatement(SqlQuery.UPDATE);
		prSt.setString(1, student.getEmail());
		prSt.setString(2, student.getAccount());
		try {
			prSt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
		
	}
}
