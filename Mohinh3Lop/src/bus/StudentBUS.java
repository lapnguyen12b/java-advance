/**
 * 
 */
package bus;

import java.sql.SQLException;
import java.util.Scanner;

import bus.StudentBUS;
import dao.StudentDAO;
import model.Student;

/**
 *@description
 *@author: 
 *@date:Nov 27, 2017
 *@time:11:38:54 AM 
 *
 */
public class StudentBUS {
	static Scanner sc = new Scanner(System.in);
//	StudentBUS studentBus = new StudentBUS();
	/**
	 * inputData
	 * @throws SQLException 
	 * */
	public void inputData() throws SQLException {
		
		Student student = new Student();
			System.out.println("Enter Account :");
			student.account = sc.nextLine();
			System.out.println("Enter First Name:");
			student.firstName = sc.nextLine();
			System.out.println("Enter Last Name:");
			student.lastName = sc.nextLine();
			System.out.println("Enter Email :");
			student.email = sc.nextLine();
			System.out.println("Enter Succsess !");
//			Student student = new Student();
			new StudentBUS().insert(student);
	}
	public void updateData() throws SQLException{
		Student student = new Student();
		System.out.println("Enter Account update:");
		student.account = sc.nextLine();
		System.out.println("Update Email :");
		student.email = sc.nextLine();
		System.out.println("Update Succsess !");
		new StudentBUS().update(student);
	}
	public void insert(Student student) throws SQLException {
		StudentDAO studentdao = new StudentDAO();
		studentdao.insertStudetn(student);
	}
	public void update(Student student) throws SQLException{
		StudentDAO studentdao = new StudentDAO();
		studentdao.updateStudent(student);
	}
}
