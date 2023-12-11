package h2Info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SampleInsert {
	// JDBC driver name and database URL 
	static final String JDBC_DRIVER = "org.h2.Driver";   
	static final String DB_URL = "jdbc:h2:tcp://localhost/C:\\\\\\\\data\\\\\\\\example1";  

	//  Database credentials 
	static final String USER = "sa"; 
	static final String PASS = "1234";

	public static void main(String[] args) {
 		try{
 			Class.forName(JDBC_DRIVER);
 			Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
 			Statement smt = con.createStatement();
 			String sql = "INSERT INTO CUSTOMER(id,NAME,AGE,ADDRESS,SALARY) VALUES(9,'Hiro',37,'MMP',300000)";
 			int rowsCount = smt.executeUpdate(sql);
 
 			System.out.print(rowsCount + "レコード登録しました。");
 
 			smt.close();
 			con.close();
 
 		}catch (Exception e) {
 			System.out.println("JDBCデータベース接続エラー");
 			e.printStackTrace();
 		}

	}

}
