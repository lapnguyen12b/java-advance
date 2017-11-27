/**
 * 
 */
package util;

/**
 *@description
 *@author: User
 *@date:Nov 27, 2017
 *@time:11:19:22 AM
 *
 */
public class SqlQuery {
	  public static final String PROC = "execute getAllStudent";
	  public static final String PROCINSERT = "execute insertStudent";
	  public static final String SELECT = "SELECT * FROM dbo.Student";
	  public static final String FIRST_COLUMN = "account";
	  public static final String SECOND_COLUMN = "FIRSTNAME";
	  public static final String THIRD_COLUMN = "LASTNAME";
	  public static final String FORTH_COLUMN = "EMAIL";
	  public static final String INSERT = "INSERT INTO dbo.Student(" + FIRST_COLUMN + ", "+SECOND_COLUMN + ","+THIRD_COLUMN+"," +FORTH_COLUMN + ") VALUES (?,?,?,?)";
	  public static final String UPDATE = "UPDATE dbo.Student SET " + FORTH_COLUMN + "=?  WHERE " + FIRST_COLUMN + " = ?";
	  public static final String PREPARED_STATEMENT = "SELECT * FROM dbo.Student WHERE FULLNAME = ? ";
	  public static final String FIND_BY_ACCOUNT = "SELECT ACCOUNT FROM dbo.Student WHERE FULLNAME = ?";
	}
