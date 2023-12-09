package h2Info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

//参考：神田ITSchool　https://kanda-it-school-kensyu.com/java-jdbc-contents/jj_ch02/jj_0202/
public class SampleSelect {
	// JDBC driver name and database URL 
	static final String JDBC_DRIVER = "org.h2.Driver";   
	static final String DB_URL = "jdbc:h2:tcp://localhost/C:\\\\\\\\data\\\\\\\\example1";  

	//  Database credentials 
	static final String USER = "sa"; 
	static final String PASS = "1234";

	public static void main(String[] args) {
		final String FORMAT = "%-4s %-13s %-9s %-13s %-9s";
		int count = 0;
 		try{
 			Class.forName(JDBC_DRIVER);
 			Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
 			Statement  smt = con.createStatement();
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
 			
 			smt.close();
 			con.close();
 
 		}catch (Exception e) {
 			System.out.println("JDBCデータベース接続エラー");
 			e.printStackTrace();
 		}
	}

}
