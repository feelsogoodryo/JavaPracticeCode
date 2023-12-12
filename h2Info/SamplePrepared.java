package h2Info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 基準となるSQL文を作成する。
 * String sql = “UPDATE bookinfo SET price= ? WHERE isbn= ?";
 * 
 * パラメータ変数に値をセットする。
 * ps.setInt(パラメータのインデックス, パラメータ値);
 * ps.setString(パラメータのインデックス, パラメータ値);
 * 
 * SQL文をデータベースに送信し、結果を受け取る。
 * int rowsCount = ps.executeUpdate(); //更新系
 * ResultSet rs = ps.executeQuery(); //検索系
 * 
 * パラメータ変数に値をセットする場合、セットする値の型によってメソッドが異なる。
 * 基準となるSQLが複数ある場合、PreparedStatementは利用できない。
 * 
 * */

public class SamplePrepared {
	// JDBC driver name and database URL 
	static final String JDBC_DRIVER = "org.h2.Driver";   
	static final String DB_URL = "jdbc:h2:tcp://localhost/C:\\\\\\\\data\\\\\\\\example1";  

	//  Database credentials 
	static final String USER = "sa"; 
	static final String PASS = "1234";

	public static void main(String[] args) {
		 
 		String sql = null;
 		int num = 0;
 		Connection con = null;
 		PreparedStatement ps = null;
 
 		try {
 			Class.forName(JDBC_DRIVER);
 			con = DriverManager.getConnection(DB_URL,USER,PASS);
 
 			sql = "UPDATE bookinfo SET price=? WHERE isbn=?";
 
 			System.out.println("■更新前の書籍一覧を表示");
 			selectAll();
 
 			ps = con.prepareStatement(sql);
 			ps.setInt(1, 3300);
 			ps.setString(2,"1");
 			num = ps.executeUpdate();
 			System.out.println("\n" + num + "件データを更新しました。\n");
 
 			System.out.println("■更新後の書籍一覧を表示");
 			selectAll();
 		}catch(Exception e){
 			System.out.println("JDBCデータベース接続エラー");
 		}finally{
 			if(ps != null){
 				try{ps.close();}catch(SQLException ignore){}
 			}
 			if(con != null){
 				try{con.close();}catch(SQLException ignore){}
 			}
 		}
 	}
 
 	private static void selectAll(){
 		Connection con = null;
 		PreparedStatement ps = null;
 
 		try{
 			Class.forName(JDBC_DRIVER);
 			con = DriverManager.getConnection(DB_URL,USER,PASS);
 
 			String sql = "SELECT * FROM bookinfo WHERE isbn LIKE ?";
 
 			ps = con.prepareStatement(sql);
 			ps.setString(1, "%");
 			ResultSet rs = ps.executeQuery();
 			while (rs.next()) {
 				System.out.println("isbn -> "   + rs.getString("isbn") +
 						"\t title -> " + rs.getString("title") +
 						"\t price-> "  + rs.getInt("price"));
 			}
 		}catch (Exception e) {
 			System.out.println("JDBCデータベース接続エラー"+e);
 		}finally{
 			if(ps != null){
 				try{ps.close();}catch(SQLException ignore){}
 			}
 			if(con != null){
 				try{con.close();}catch(SQLException ignore){}
 			}
 		}

	}

}
