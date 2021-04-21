import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class MySQLAccess {
	
	 private Connection connect = null;
	  private Statement statement = null;
	  private PreparedStatement preparedStatement = null;
	  private ResultSet resultSet = null;
	/*
	                                           //online database on remotesql.com managed by myphpadmin.

	final private String host = "remotemysql.com";
	final private String user = "SmFKVXaES2";                                           //Database connector for connecting the application to an
	final private String passwd = "WDSvrZpWUU";
	private String databaseJDBC_URI = "jdbc:mysql://remotemysql.com:3306/SmFKVXaES2";*/

	  public Connection Connect_to_DataBase() throws Exception {
	    try {
	     
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      
	 
	      return connect = DriverManager.
				 // getConnection("jdbc:mysql://localhost:3307/blood_donation_database", "ayush", "test1234" );
			getConnection("jdbc:mysql://localhost:3307/blood_donation_database", "root", "" );
//	          getConnection(databaseJDBC_URI, user, passwd );



       }catch(Exception e) {
    	   	JOptionPane myOption = new JOptionPane();
	    	myOption.showMessageDialog(null, "Connection failed, Please restart app");
    	   System.out.println("Connection failed");
	         return null;
                          }
	  }
	  
}
