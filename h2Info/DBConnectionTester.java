package h2Info;

import java.sql.Connection;
import java.sql.DriverManager;
//参考：神田ITSchool　https://kanda-it-school-kensyu.com/java-jdbc-contents/jj_ch02/jj_0202/
//DBとの接続を確認するためのクラス
public class DBConnectionTester {
	// JDBC driver name and database URL 
	static final String JDBC_DRIVER = "org.h2.Driver";   
	static final String DB_URL = "jdbc:h2:tcp://localhost/C:\\\\\\\\data\\\\\\\\example1";  
	//  Database credentials 
	static final String USER = "sa"; 
	static final String PASS = "1234";
	public static void main(String[] args) {

		try{
			Class.forName(JDBC_DRIVER);
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);

			//接続成功メッセージとコネクション情報の表示
			System.out.println("JDBCデータベース接続成功");
			System.out.println("con = " + con);

			con.close();

		}catch(Exception e){
			System.out.println("JDBCデータベース接続エラー:" + e);
		}
	}

}
