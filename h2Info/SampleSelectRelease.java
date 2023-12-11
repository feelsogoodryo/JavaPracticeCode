package h2Info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//参考資料:https://kanda-it-school-kensyu.com/java-jdbc-contents/jj_ch02/jj_0206/
public class SampleSelectRelease {
	// JDBC driver name and database URL 
	static final String JDBC_DRIVER = "org.h2.Driver";   
	static final String DB_URL = "jdbc:h2:tcp://localhost/C:\\\\\\\\data\\\\\\\\example1";  

	//  Database credentials 
	static final String USER = "sa"; 
	static final String PASS = "1234";

	public static void main(String[] args) {
	    //接続用の情報をフィールドに定数として定義
		final String FORMAT = "%-4s %-13s %-9s %-13s %-9s";
		int count = 0;
		Connection con = null;
		Statement smt = null;
		try{
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB_URL,USER,PASS);
			smt = con.createStatement();
			String sql = "SELECT * FROM CUSTOMER ";
			ResultSet rs = smt.executeQuery(sql);
			//全てのデータを表示
			ArrayList<TesterDto> nameDto = new ArrayList<TesterDto>();
			while(rs.next()) {
				//instanceを回す分だけ生成する。
				nameDto.add(new TesterDto());
				nameDto.get(count).setId(rs.getString("ID"));
				nameDto.get(count).setName(rs.getString("NAME"));
				nameDto.get(count).setAge(rs.getString("AGE"));
				nameDto.get(count).setAddress(rs.getString("ADDRESS"));
				nameDto.get(count).setSalary(rs.getString("SALARY"));
				count++;
			}
			for (TesterDto j : nameDto) {
				System.out.println(
						String.format(FORMAT, j.getId(), j.getName(), j.getAge(), j.getAddress(), j.getSalary()));
			}

		} catch (Exception e) {
			System.out.println("JDBCデータベース接続エラー" + e);

			//正常処理の場合
			//正常処理を行なってfinallyブロックが実行される場合、smtとconは両方とも取得されているので、finallyブロックでは両方のリソースの開放が行われる。
		} finally {
			try {
				if (smt != null) {
					System.out.println("SQLステートメントをクローズしました。");
					smt.close();
				}
				if (con != null) {
					System.out.println("DB接続をクローズしました。");
					con.close();
				}

			} catch (SQLException ignore) {
				//例外処理の無視
			}
		}

	}

}
