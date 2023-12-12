package h2Info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * ��ƂȂ�SQL�����쐬����B
 * String sql = �gUPDATE bookinfo SET price= ? WHERE isbn= ?";
 * 
 * �p�����[�^�ϐ��ɒl���Z�b�g����B
 * ps.setInt(�p�����[�^�̃C���f�b�N�X, �p�����[�^�l);
 * ps.setString(�p�����[�^�̃C���f�b�N�X, �p�����[�^�l);
 * 
 * SQL�����f�[�^�x�[�X�ɑ��M���A���ʂ��󂯎��B
 * int rowsCount = ps.executeUpdate(); //�X�V�n
 * ResultSet rs = ps.executeQuery(); //�����n
 * 
 * �p�����[�^�ϐ��ɒl���Z�b�g����ꍇ�A�Z�b�g����l�̌^�ɂ���ă��\�b�h���قȂ�B
 * ��ƂȂ�SQL����������ꍇ�APreparedStatement�͗��p�ł��Ȃ��B
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
 
 			System.out.println("���X�V�O�̏��Јꗗ��\��");
 			selectAll();
 
 			ps = con.prepareStatement(sql);
 			ps.setInt(1, 3300);
 			ps.setString(2,"1");
 			num = ps.executeUpdate();
 			System.out.println("\n" + num + "���f�[�^���X�V���܂����B\n");
 
 			System.out.println("���X�V��̏��Јꗗ��\��");
 			selectAll();
 		}catch(Exception e){
 			System.out.println("JDBC�f�[�^�x�[�X�ڑ��G���[");
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
 			System.out.println("JDBC�f�[�^�x�[�X�ڑ��G���["+e);
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
