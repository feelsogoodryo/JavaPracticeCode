package dokoJava2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//参考にしたサイト
//https://blog.java-reference.com/db-insert/
public class CaptrueNineInsertMain {

	public static void main(String[] args)throws Exception {
		// Insert practice
		//変数定義
		Connection conn = null;
		PreparedStatement ps = null;

		//DB接続情報を設定する
		String path = "jdbc:h2:tcp://localhost/C:\\\\data\\\\example1";  //接続パス
		String id = "sa";    //ログインID
		String pw = "1234";  //ログインパスワード

		//SQL文を定義する
		String sql = "INSERT INTO EMPLOYEES values(?, ?, ?)";
		try {
			//JDBCドライバをロードする
			Class.forName("org.h2.Driver");

			//DBへのコネクションを作成する
			conn = DriverManager.getConnection(path, id, pw);
			conn.setAutoCommit(false);  //オートコミットはオフ

			//実行するSQL文とパラメータを指定する
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 12);
			ps.setString(2, "山田四郎");
			ps.setInt(3,24);

			//INSERT文を実行する
			int i = ps.executeUpdate();

			//処理件数を表示する
			System.out.println("結果：" + i);

			//コミット
			conn.commit();

		} catch (Exception ex) {
			//例外発生時の処理
			conn.rollback();       //ロールバックする
			ex.printStackTrace();  //エラー内容をコンソールに出力する

		} finally {
			//クローズ処理
			if (ps != null) ps.close();
			if (conn != null) conn.close();
		}
	}

}
