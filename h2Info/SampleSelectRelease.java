package h2Info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//�Q�l����:https://kanda-it-school-kensyu.com/java-jdbc-contents/jj_ch02/jj_0206/
public class SampleSelectRelease {
	// JDBC driver name and database URL 
	static final String JDBC_DRIVER = "org.h2.Driver";   
	static final String DB_URL = "jdbc:h2:tcp://localhost/C:\\\\\\\\data\\\\\\\\example1";  

	//  Database credentials 
	static final String USER = "sa"; 
	static final String PASS = "1234";

	public static void main(String[] args) {
	    //�ڑ��p�̏����t�B�[���h�ɒ萔�Ƃ��Ē�`
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
			//�S�Ẵf�[�^��\��
			ArrayList<TesterDto> nameDto = new ArrayList<TesterDto>();
			while(rs.next()) {
				//instance���񂷕�������������B
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
			System.out.println("JDBC�f�[�^�x�[�X�ڑ��G���[" + e);

			//���폈���̏ꍇ
			//���폈�����s�Ȃ���finally�u���b�N�����s�����ꍇ�Asmt��con�͗����Ƃ��擾����Ă���̂ŁAfinally�u���b�N�ł͗����̃��\�[�X�̊J�����s����B
		} finally {
			try {
				if (smt != null) {
					System.out.println("SQL�X�e�[�g�����g���N���[�Y���܂����B");
					smt.close();
				}
				if (con != null) {
					System.out.println("DB�ڑ����N���[�Y���܂����B");
					con.close();
				}

			} catch (SQLException ignore) {
				//��O�����̖���
			}
		}

	}

}
