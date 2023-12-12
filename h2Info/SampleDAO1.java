package h2Info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SampleDAO1 {
	//�ڑ��p�̏����t�B�[���h�ɒ萔�Ƃ��Ē�`
	// JDBC driver name and database URL 
	static final String JDBC_DRIVER = "org.h2.Driver";   
	static final String DB_URL = "jdbc:h2:tcp://localhost/C:\\\\\\\\data\\\\\\\\example1";  
	//  Database credentials 
	static final String USER = "sa"; 
	static final String PASS = "1234";
 	// �f�[�^�x�[�X�ڑ����s�����\�b�h
 	// �f�[�^�x�[�X�ڑ��p��`����Ƀf�[�^�x�[�X�֐ڑ����A�߂�l�Ƃ��ăR�l�N�V��������Ԃ�
 	private static Connection getConnection(){
 		try{
 			Class.forName(JDBC_DRIVER);
 			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
 			return con;
 		}catch(Exception e){
 			e.printStackTrace();
 			throw new IllegalStateException(e);
 		}
 	}
 
 	// �f�[�^�x�[�X����isbn�f�[�^�̌������s�����\�b�h
 	// �e�[�u���ɓo�^���ꂽ�S�Ă�isbn�f�[�^��ArrayList�֊i�[���A�߂�l�Ƃ��ĕԂ�
 	public ArrayList<String> selectIsbnAll(){
 
 		// �ϐ��錾
 		Connection con = null;	// DB�R�l�N�V����
 		Statement smt = null;	// SQL�X�e�[�g�����g
 
 		// �z��錾
 		ArrayList<String> list = new ArrayList<String>();
 
 		// SQL���쐬
 		String sql = "SELECT isbn FROM bookinfo ORDER BY isbn";
 
 		try{
 			// DB�ɐڑ�
 			con = SampleDAO1.getConnection();
 			smt = con.createStatement();
 
 			// SQL�����s
 			ResultSet rs = smt.executeQuery(sql);
 
 			// �������ʂ�ArrayList�Ɋi�[
 			while(rs.next()){
 				list.add(rs.getString("isbn"));
 			}
 
 		}catch(SQLException e){
 			System.out.println("Error���������܂����I\n"+e);
 		}finally{
 			// ���\�[�X�̊J��
 			if(smt != null){
 				try{smt.close();}catch(SQLException ignore){}
 			}
 			if(con != null){
 				try{con.close();}catch(SQLException ignore){}
 			}
 		}
 		return list;
 	}
 
 	// �f�[�^�x�[�X����title�f�[�^�̌������s�����\�b�h
 	// �e�[�u���ɓo�^���ꂽ�S�Ă�title�f�[�^��ArrayList�֊i�[���A�߂�l�Ƃ��ĕԂ�
 	public ArrayList<String> selectTitleAll(){
 		// �ϐ��錾
 		Connection con = null;	// DB�R�l�N�V����
 		Statement smt = null;	// SQL�X�e�[�g�����g
 
 		// �z��錾
 		ArrayList<String> list = new ArrayList<String>();
 
 		// SQL��
  		String sql = "SELECT title FROM bookinfo ORDER BY isbn";
 
 		try{
 			// DB�ɐڑ�
 			con = SampleDAO1.getConnection();
 			smt = con.createStatement();
 
 			// SQL�����s
 			ResultSet rs = smt.executeQuery(sql);
 
 			// �������ʂ�ArrayList�Ɋi�[
 			while(rs.next()){
 				list.add(rs.getString("title"));
 			}
 
 		}catch(SQLException e){
 			System.out.println("Error���������܂����I\n"+e);
 		}finally{
 			// ���\�[�X�̊J��
 			if(smt != null){
 				try{smt.close();}catch(SQLException ignore){}
 			}
  			if(con != null){
  				try{con.close();}catch(SQLException ignore){}
  			}
  		}
  		return list;
  	}
  
  	// �f�[�^�x�[�X����price�f�[�^�̌������s�����\�b�h
  	// �e�[�u���ɓo�^���ꂽ�S�Ă�price�f�[�^��ArrayList�֊i�[���A�߂�l�Ƃ��ĕԂ�
  	public ArrayList<Integer> selectPriceAll(){
  		// �ϐ��錾
  		Connection con = null;	// DB�R�l�N�V����
  		Statement smt = null;	// SQL�X�e�[�g�����g
  
  		// �z��錾
  		ArrayList<Integer> list = new ArrayList<Integer>();
  
  		// SQL��
   		String sql = "SELECT price FROM bookinfo ORDER BY isbn";
  
  		try{
  			// DB�ɐڑ�
  			con = SampleDAO1.getConnection();
  			smt = con.createStatement();
  
  			// SQL�����s
  			ResultSet rs = smt.executeQuery(sql);
  
  			// �������ʂ�ArrayList�Ɋi�[
  			while(rs.next()){
  				list.add(rs.getInt("price"));
  			}
  
  		}catch(SQLException e){
  			System.out.println("Error���������܂����I\n"+e);
  		}finally{
  			// ���\�[�X�̊J��
  			if(smt != null){
  				try{smt.close();}catch(SQLException ignore){}
  			}
  			if(con != null){
  				try{con.close();}catch(SQLException ignore){}
  			}
  		}
  		return list;
  	}
  
  	// ���Џ���o�^���郁�\�b�h
  	// �����ɓn���ꂽ���Џ����f�[�^�x�[�X�֓o�^���A�߂�l�Ƃ��ēo�^������Ԃ�
  	public int insertBook(String isbn, String title, int price){
  		// �ϐ��錾
  		Connection con = null;	// DB�R�l�N�V����
  		Statement smt = null;	// SQL�X�e�[�g�����g
  
  		int rowsCount = 0;
  
  		// SQL��
  		String sql = "INSERT INTO bookinfo(isbn,title,price) " +
  				"VALUES('" + isbn + "','" + title + "'," + price + ")";
  
  		try{
  			// DB�ɐڑ�
  			con = SampleDAO1.getConnection();
  			smt = con.createStatement();
  
  			// SQL�����s
  			rowsCount = smt.executeUpdate(sql);
  
  		}catch(SQLException e){
  			System.out.println("Error���������܂����I\n"+ e +"\n");
  		}finally{
  			// ���\�[�X�̊J��
  			if(smt != null){
  				try{smt.close();}catch(SQLException ignore){}
  			}
  			if(con != null){
  				try{con.close();}catch(SQLException ignore){}
  			}
  		}
  		return rowsCount;
  	}
}
