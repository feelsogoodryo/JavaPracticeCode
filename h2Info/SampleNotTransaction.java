package h2Info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleNotTransaction {

	// JDBC driver name and database URL 
	static final String JDBC_DRIVER = "org.h2.Driver";   
	static final String DB_URL = "jdbc:h2:tcp://localhost/C:\\\\\\\\data\\\\\\\\example1";  

	//  Database credentials 
	static final String USER = "sa"; 
	static final String PASS = "1234";

	public static void main(String[] args) {
 		String	sql = null;
 		int		num	= 0 ;
 
 		Connection con = null;
 		Statement  smt   = null;
 
 		try {
 			Class.forName(JDBC_DRIVER);
 			con = DriverManager.getConnection(DB_URL,USER,PASS);
 
 			smt = con.createStatement();
 
 			System.out.println("■登録SQL発行前の書籍一覧表示");
 			selectAll();
 
 			sql = "INSERT INTO bookinfo (isbn, title, price) values('00006', 'Object-C入門テキスト', 3500)";
 			num = smt.executeUpdate(sql);
 			System.out.println("\nSQL発行1回目：" + num + "件の新規レコードを登録しました。");
 
 			sql = "INSERT INTO bookinfo (isbn, title, price) values('00007', 'C++入門テキスト', 3000)";
 			num = smt.executeUpdate(sql);
 			System.out.println("\nSQL発行2回目：" + num + "件の新規レコードを登録しました。");
 
 			System.out.println("\n■登録SQL発行後の書籍一覧表示");
 			selectAll();
 
 		} catch (Exception e) {
 			System.out.println("JDBCデータベース接続エラー" + e);
 
 		} finally {
 			try {
 				if (smt != null) {
 					smt.close();
 				}
 				if (con != null) {
 					con.close();
 				}
 
 			} catch (SQLException ignore) {
 				//例外処理の無視
 			}
 		}
 	}
 
 	private static void selectAll(){
 
 		Connection con = null;
 		Statement  smt = null;
 
 		try{
 			Class.forName(JDBC_DRIVER);
 			con = DriverManager.getConnection(DB_URL,USER,PASS);
 
 			smt = con.createStatement();
 
 			//データベースへ発行するSQL文
 			String sql = "SELECT * FROM bookinfo";
 
 			ResultSet rs = smt.executeQuery(sql);
 
 			while (rs.next()) {
 				System.out.println("isbn -> "   + rs.getString("isbn") +
 						"\t title -> " + rs.getString("title") +
 						"\t price-> "  + rs.getString("price"));
 			}
 
 		}catch (Exception e) {
 			System.out.println("JDBCデータベース接続エラー");
 
 		}finally{
 			try {
 				if (smt != null) {
 					smt.close();
 				}
 				if (con != null) {
 					con.close();
 				}
 
 			} catch (SQLException ignore) {
 				//例外処理の無視
 			}
 		}

	}

}
