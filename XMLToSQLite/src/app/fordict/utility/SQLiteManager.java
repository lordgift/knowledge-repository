package app.fordict.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import app.fordict.bean.Eng2Thai;
import app.fordict.bean.Thai2Eng;

public class SQLiteManager {
	private static final String CONNECTION_URL = "jdbc:sqlite:LEXiTRON.db";
	private static final String SQLITE_DRIVER = "org.sqlite.JDBC";
	
	private static Connection getConnection() {
		Connection c = null;
		try {
			
			Class.forName(SQLITE_DRIVER);
			c = DriverManager.getConnection(CONNECTION_URL);
			System.out.println("Opened database successfully");
			
		} catch (ClassNotFoundException e) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		} catch (SQLException e) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		}
		return c;

	}

	private static void clearResource(Connection c, Statement stmt) {
		try {
			stmt.close();
			c.close();
		} catch (SQLException e) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		}
	}
	
	public static void createTable()
	{
		Connection c = getConnection();
		Statement stmt = null;
	    try {

	      stmt = c.createStatement();

	      //for android must have table android_metadata, primary key of table should be _id
	      String sql = 
	    		  " CREATE TABLE android_metadata (locale TEXT DEFAULT 'en_US'); "
	      		+ " INSERT INTO android_metadata VALUES ('en_US'); "
	      
	      + " CREATE TABLE Eng2Thai ( "
	      		+ " _id 		INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , "
	      		+ " esearch 	varchar(200) NOT NULL, "
	      		+ " eentry 	varchar(200) NOT NULL, "
	      		+ " tentry 	varchar(200) NOT NULL, "
	      		+ " ecat 		varchar(200) NOT NULL, "
	      		+ " ethai 	varchar(200) NOT NULL, "
	      		+ " esyn 		varchar(200) NOT NULL,"
	      		+ " eant 		varchar(200) NOT NULL); "
	      
	      + " CREATE TABLE Thai2Eng ("
	      		+ " _id INTEGER PRIMARY KEY NOT NULL , "
	      		+ " tsearch varchar(200) NOT NULL, "
	      		+ " tentry varchar(200) NOT NULL, "
	      		+ " eentry varchar(200) NOT NULL, "
	      		+ " tcat varchar(200) NOT NULL, "
	      		+ " tsyn varchar(200) NOT NULL, "
	      		+ " tenglish varchar(200) NOT NULL, "
	      		+ " tant varchar(200) NOT NULL, "
	      		+ " tnum varchar(200) NOT NULL, "
	      		+ " tdef varchar(200) NOT NULL, "
	      		+ " tsample varchar(200) NOT NULL); ";
	      
	      stmt.executeUpdate(sql);
	      System.out.println("Table created successfully");
	      
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    } finally {
	    	clearResource(c, stmt);
	    }
	}

	public static void insertValueByList(List<Object> list) {
		Connection c = getConnection();
		Statement stmt = null;
		try {

			stmt = c.createStatement();

			StringBuilder sql = new StringBuilder();

			for (Object bean : list) {
				if(bean instanceof Eng2Thai) {
					Eng2Thai eng2Thai = (Eng2Thai) bean;
					sql.append(" INSERT INTO Eng2Thai VALUES ");
					sql.append(" ( ");
					sql.append(eng2Thai.get_id() + ", ");
					sql.append("\"" + eng2Thai.getEsearch() + "\", ");
					sql.append("\"" + eng2Thai.getEentry() + "\", ");
					sql.append("\"" + eng2Thai.getTentry() + "\", ");
					sql.append("\"" + eng2Thai.getEcat() + "\", ");
					sql.append("\"" + eng2Thai.getEthai() + "\", ");
					sql.append("\"" + eng2Thai.getEsyn() + "\", ");
					sql.append("\"" + eng2Thai.getEant() + "\"");
					sql.append(" ); ");
				} else if(bean instanceof Thai2Eng) {
					Thai2Eng thai2Eng = (Thai2Eng) bean;
					sql.append(" INSERT INTO Thai2Eng VALUES ");
					sql.append(" ( ");
					sql.append(thai2Eng.get_id() + ", ");
					sql.append("\"" + thai2Eng.getTsearch() + "\", ");
					sql.append("\"" + thai2Eng.getTentry() + "\", ");
					sql.append("\"" + thai2Eng.getEentry() + "\", ");
					sql.append("\"" + thai2Eng.getTcat() + "\", ");
					sql.append("\"" + thai2Eng.getTsyn() + "\", ");
					sql.append("\"" + thai2Eng.getTenglish() + "\", ");
					sql.append("\"" + thai2Eng.getTant() + "\", ");
					sql.append("\"" + thai2Eng.getTnum() + "\", ");
					sql.append("\"" + thai2Eng.getTdef() + "\", ");
					sql.append("\"" + thai2Eng.getTsample() + "\"");
					sql.append(" ); ");
				}
			}

			stmt.executeUpdate(sql.toString());
			System.out.println("Value inserted successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		} finally {
			clearResource(c, stmt);
		}
	}
}
