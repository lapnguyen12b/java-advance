/**
 * 
 */
package model;

/**
 *@description
 *@author: User
 *@date:Nov 27, 2017
 *@time:9:11:16 AM
 *
 */
public class Student {
	public String fullName;
	public String email;
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/**
	 * @param fullName
	 * @param email
	 */
	public Student(String fullName, String email) {
		super();
		this.fullName = fullName;
		this.email = email;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
