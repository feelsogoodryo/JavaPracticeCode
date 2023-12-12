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
 
 			System.out.println("���o�^SQL���s�O�̏��Јꗗ�\��");
 			selectAll();
 
 			sql = "INSERT INTO bookinfo (isbn, title, price) values('00006', 'Object-C����e�L�X�g', 3500)";
 			num = smt.executeUpdate(sql);
 			System.out.println("\nSQL���s1��ځF" + num + "���̐V�K���R�[�h��o�^���܂����B");
 
 			sql = "INSERT INTO bookinfo (isbn, title, price) values('00007', 'C++����e�L�X�g', 3000)";
 			num = smt.executeUpdate(sql);
 			System.out.println("\nSQL���s2��ځF" + num + "���̐V�K���R�[�h��o�^���܂����B");
 
 			System.out.println("\n���o�^SQL���s��̏��Јꗗ�\��");
 			selectAll();
 
 		} catch (Exception e) {
 			System.out.println("JDBC�f�[�^�x�[�X�ڑ��G���[" + e);
 
 		} finally {
 			try {
 				if (smt != null) {
 					smt.close();
 				}
 				if (con != null) {
 					con.close();
 				}
 
 			} catch (SQLException ignore) {
 				//��O�����̖���
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
 
 			//�f�[�^�x�[�X�֔��s����SQL��
 			String sql = "SELECT * FROM bookinfo";
 
 			ResultSet rs = smt.executeQuery(sql);
 
 			while (rs.next()) {
 				System.out.println("isbn -> "   + rs.getString("isbn") +
 						"\t title -> " + rs.getString("title") +
 						"\t price-> "  + rs.getString("price"));
 			}
 
 		}catch (Exception e) {
 			System.out.println("JDBC�f�[�^�x�[�X�ڑ��G���[");
 
 		}finally{
 			try {
 				if (smt != null) {
 					smt.close();
 				}
 				if (con != null) {
 					con.close();
 				}
 
 			} catch (SQLException ignore) {
 				//��O�����̖���
 			}
 		}

	}

}
