package dokoJava2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CaptrueNineMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// ********** コード9-1 ここから（1行目のimport文を含む） **********
		// STEP 0: 事前準備（JAR配置を含む）
		try {
			Class.forName("org.h2.Driver");//JDBCドライバの完全限定名
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("ドライバのロードに失敗しました");
		}
		/* : */
		Connection con = null;
		try {
			// STEP 1: データベースの接続
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/C:\\data\\example1","sa","1234");//JDBC URLを指定
			// STEP 2: SQL送信処理
			/* ******************************
	          メインのDB操作処理（後述します）
			 ****************************** */
			// STEP 2: 送信処理
			// ********** コード9-2 ここから **********
			// STEP 2-(1)-1 送信すべきSQL文のひな形を準備
//			PreparedStatement pstmt = con.prepareStatement
//					("DELETE FROM TEST WHERE ID <= ? OR NAME = ?");
//			// STEP 2-(1)-2 ひな形に値を流し込みSQL文を組み立てる
//			pstmt.setInt(1, 10);            // １番目の？に4を流し込む
//			pstmt.setString(2, "ASAHI");    // ２番目の？にASAHIを流し込む
//			// STEP 2-(1)-3 組み立て終えたSQL文をDBMSに送信する
//			int r = pstmt.executeUpdate();
			
//			PreparedStatement pstmt = con.prepareStatement
//			("DELETE FROM TEST WHERE NAME = ?");
//			// STEP 2-(1)-2 ひな形に値を流し込みSQL文を組み立てる
//			pstmt.setString(1, "すずめ");            // １番目の？にすずめを流し込む
//			// STEP 2-(1)-3 組み立て終えたSQL文をDBMSに送信する
//			int r = pstmt.executeUpdate();			
//			// STEP 2-(1)-4 処理結果を判定する
//			if (r != 0) {
//				System.out.println(r + "件の名前を削除しました");
//			} else {
//				System.out.println("該当する名前はありませんでした");
//			}
//			pstmt.close();                  // 後片付け
//			// ********** コード9-2 ここまで **********
			
			// ********** コード9-3 ここから **********
			// STEP 2-(2)-1 送信すべきSQL文のひな形を準備
//			PreparedStatement pstmt = con.prepareStatement
//					("SELECT * FROM TEST WHERE NAME = ?");
//			// STEP 2-(2)-2 ひな形に値を流し込みSQL文を組み立てる
//			pstmt.setString(1, "A");             // １番目の？に1を流し込む
//			// STEP 2-(2)-3 組み立て終えたSQL文をDBMSに送信する
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				System.out.print(rs.getInt("ID"));
//				System.out.print(rs.getString("NAME"));
//				System.out.println("");
//			}
			
			con.setAutoCommit(false);
			// STEP 2: SQL送信処理
			/* *****メインのDB操作処理***** */		
			String SQL = "INSERT INTO TEST(ID, NAME) VALUES( ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(SQL);
			pstmt.setInt(1, 3);
			pstmt.setString(2, "da");
			pstmt.executeUpdate();
			// STEP 2-(2)-4 結果表を処理する
			/* *************************************
		          結果表の処理（記述する内容は、後述します）
			 ************************************* */
			pstmt.close();                  // 後片付け
			// ********** コード9-3 ここまで **********

			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// STEP 3: データベース接続の切断
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		// ********** コード9-1 ここまで **********

	}

}
