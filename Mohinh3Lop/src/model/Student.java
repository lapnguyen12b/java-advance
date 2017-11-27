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
	public String account;
	public String email;
	public String firstName;
	public String lastName;
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/**
	 * @param account
	 * @param email
	 */
	/**
	 * @param account
	 * @param email
	 * @param firstName
	 * @param lastName
	 */
	public Student(String account, String email, String firstName, String lastName) {
		super();
		this.account = account;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
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
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
