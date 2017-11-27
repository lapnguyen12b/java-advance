/**
 * 
 */
package bus;

import java.sql.SQLException;
import java.util.Scanner;

import dao.StudentDAO;
import dao.StudentDAO;
import model.Student;

/**
 *@description
 *@author: User
 *@date:Nov 27, 2017
 *@time:11:38:54 AM
 *
 */
public class StudentBUS {
	public void getAllUsers() throws SQLException {
	    StudentDAO studentDao = new StudentDAO();
	    try {
	      studentDao.display();
	    } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	  }
}
