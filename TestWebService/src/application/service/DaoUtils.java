package application.service;

import java.io.StringWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DaoUtils implements Constants {

	private static DataSource ds;

	public static Connection getConnection() throws Exception {
		try {
			if (ds == null) {
				InitialContext context = new InitialContext();
				// jboss 4
//				ds = (DataSource) context.lookup("java:jdbc/xe");
				// jboss 7 and other
				 ds = (DataSource) context.lookup("jdbc/oracdgs9");
			}
			return ds.getConnection();
		} catch (SQLException se) {
			se.printStackTrace();
			throw new SQLException();
		} catch (NamingException ne) {
			ne.printStackTrace();
			throw new NamingException();
		}
	}

	public static void closeResource(Connection con, Statement st, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static String queryFwUser(String userId) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		
		//Json
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> map = new HashMap<String, String>();
		try {
			con = getConnection();
//			DatabaseMetaData dm = con.getMetaData();
//			log.debug("driver name "+dm.getDriverName());
//			log.debug("product name"+dm.getDatabaseProductName());
//			log.debug("url"+dm.getURL());
			sql.append(" select * from fw_user where userid = ? ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				map.put("result", "Y");
				map.put("username", rs.getString("username"));
				map.put("password", rs.getString("password"));
				
				Writer strWriter = new StringWriter();
				mapper.writeValue(strWriter, map);
				return strWriter.toString();
			} else {
				map.put("result", "N");
				map.put("message", "userid หรือ password ไม่ถูกต้อง");
				
				Writer strWriter = new StringWriter();
				mapper.writeValue(strWriter, map);
				return strWriter.toString();
			}
		} catch (Exception e) {
			throw e;
		} finally {
			closeResource(con, pstmt, rs);
		}
		
	}

}
