/**
 * 
 */
package view;

import java.sql.SQLException;

import bus.StudentBUS;

/**
 *@description
 *@author: User
 *@date:Nov 27, 2017
 *@time:11:37:39 AM
 *
 */
//connection DB
//create entity
//create DB , select, insert, update,delete, getAll ,PROC
//create SqlQuery.java
//create DAO insert, update, delete,getAll
//create BUS(2) call DAO(insert...)
//create BUS(1) Scanner  call BUS(insert...)

public class Main {

	/**
	 *@user:User
	 *@date:Nov 27, 2017
	 *@time:11:37:39 AM
	 *@modifineder: User
	 *@modifined date:
	 *@exception:
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		StudentBUS studentbus = new StudentBUS();
		studentbus.updateData();
		
	}

}
