/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	public void show() throws SQLException {
	    Connection myConn = DriverManager.getConnection(ConnectionDB.dbURL);
	    Statement stm = myConn.createStatement();
	    ResultSet resultSet = stm.executeQuery(SqlQuery.SELECT);
	    while (resultSet.next()) {
	      System.out.print(resultSet.getString(SqlQuery.FIRST_COLUMN) + "  ");
//	      System.out.print(resultSet.getString(SqlQuery.SECOND_COLUMN) + "  ");
//	      System.out.print(resultSet.getString(SqlQuery.THIRD_COLUMN) + "  ");
	      System.out.print(resultSet.getString(SqlQuery.FORTH_COLUMN) + " \n");
	    }
	  }
	public void display() throws SQLException {
		Connection conn = DriverManager.getConnection(ConnectionDB.dbURL);
		Statement stm = conn.createStatement();
		ResultSet rs = stm.executeQuery(SqlQuery.PROC);
		while (rs.next()) {
			System.out.println(rs.getString(SqlQuery.FIRST_COLUMN)+" ");
			System.out.println(rs.getString(SqlQuery.FORTH_COLUMN)+" ");
		}
	}
	  public ResultSet getByAccount(Student student) throws SQLException {
	    Connection myConn = DriverManager.getConnection(ConnectionDB.dbURL);
	    PreparedStatement ps = myConn.prepareStatement(SqlQuery.FIND_BY_ACCOUNT);
	    ps.setString(1, student.getFullName());
	    ResultSet rs = ps.executeQuery();
	    return rs;
	  }

	  /**
	   * 
	   * @author Minh Quang.
	   * @date 2017-Oct-30
	   * @param user
	   *          is inserted data
	   * @return update data
	   * @throws SQLException
	   *           exeption SQL
	   */
	  public boolean insert(Student student) throws ClassNotFoundException, SQLException {
	    Connection myConn = DriverManager.getConnection(ConnectionDB.dbURL);
	    PreparedStatement preparedStatement = myConn.prepareStatement(SqlQuery.INSERT);
	    preparedStatement.setString(1, student.getFullName());
	    preparedStatement.setString(4, student.getEmail());
	    try {
	      preparedStatement.executeUpdate();
	    } catch (Exception e) {
	      e.printStackTrace();
	      return false;
	    }
	    return true;
	  }

	  /**
	   * 
	   * @author Minh Quang.
	   * @date 2017-Oct-30
	   * @param user
	   *          is updated data
	   * @return update data
	   * @throws SQLException
	   *           exeption SQL
	   */
	  public boolean update(Student student) throws SQLException, ClassNotFoundException {
	    Connection myConn = DriverManager.getConnection(ConnectionDB.dbURL);
	    PreparedStatement preparedStatement = myConn.prepareStatement(SqlQuery.UPDATE);
	    preparedStatement.setString(1, student.getFullName());
	    preparedStatement.setString(2, student.getEmail());
	    try {
	      preparedStatement.executeUpdate();
	    } catch (Exception e) {
	      e.printStackTrace();
	      return false;
	    }
	    return true;
	  }
}
