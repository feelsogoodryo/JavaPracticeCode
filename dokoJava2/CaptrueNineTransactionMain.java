package dokoJava2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class CaptrueNineTransactionMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// ********** コード9-6 ここから（1行目のimport文を含む） **********
		// STEP 0: 事前準備（JAR配置を含む）
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("ドライバのロードに失敗しました");
		}
		/* : */
		Connection con = null;
		try {
			// STEP 1: データベースの接続
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/C:\\\\data\\\\example1\",\"sa\",\"1234");
			con.setAutoCommit(false);
			// STEP 2: SQL送信処理
			/* *****メインのDB操作処理***** */			
		      PreparedStatement pstmt = con.prepareStatement
		              ("INSERT FROM TEST WHERE ID = ? NAME = ?");
		      pstmt.setInt(1, 5);
		      pstmt.setString(2, "d");
		      con.commit();
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		} finally {
			// STEP 3: データベース接続の切断
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e3) {
					e3.printStackTrace();
				}
			}
		}
		// ********** コード9-6 ここまで **********

	}

}
