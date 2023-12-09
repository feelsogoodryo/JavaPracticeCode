package dokoJava2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CaptrueNineMain {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		// ********** �R�[�h9-1 ��������i1�s�ڂ�import�����܂ށj **********
		// STEP 0: ���O�����iJAR�z�u���܂ށj
		try {
			Class.forName("org.h2.Driver");//JDBC�h���C�o�̊��S���薼
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("�h���C�o�̃��[�h�Ɏ��s���܂���");
		}
		/* : */
		Connection con = null;
		try {
			// STEP 1: �f�[�^�x�[�X�̐ڑ�
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/C:\\data\\example1","sa","1234");//JDBC URL���w��
			// STEP 2: SQL���M����
			/* ******************************
	          ���C����DB���쏈���i��q���܂��j
			 ****************************** */
			// STEP 2: ���M����
			// ********** �R�[�h9-2 �������� **********
			// STEP 2-(1)-1 ���M���ׂ�SQL���̂ЂȌ`������
//			PreparedStatement pstmt = con.prepareStatement
//					("DELETE FROM TEST WHERE ID <= ? OR NAME = ?");
//			// STEP 2-(1)-2 �ЂȌ`�ɒl�𗬂�����SQL����g�ݗ��Ă�
//			pstmt.setInt(1, 10);            // �P�Ԗڂ́H��4�𗬂�����
//			pstmt.setString(2, "ASAHI");    // �Q�Ԗڂ́H��ASAHI�𗬂�����
//			// STEP 2-(1)-3 �g�ݗ��ďI����SQL����DBMS�ɑ��M����
//			int r = pstmt.executeUpdate();
			
//			PreparedStatement pstmt = con.prepareStatement
//			("DELETE FROM TEST WHERE NAME = ?");
//			// STEP 2-(1)-2 �ЂȌ`�ɒl�𗬂�����SQL����g�ݗ��Ă�
//			pstmt.setString(1, "������");            // �P�Ԗڂ́H�ɂ����߂𗬂�����
//			// STEP 2-(1)-3 �g�ݗ��ďI����SQL����DBMS�ɑ��M����
//			int r = pstmt.executeUpdate();			
//			// STEP 2-(1)-4 �������ʂ𔻒肷��
//			if (r != 0) {
//				System.out.println(r + "���̖��O���폜���܂���");
//			} else {
//				System.out.println("�Y�����閼�O�͂���܂���ł���");
//			}
//			pstmt.close();                  // ��Еt��
//			// ********** �R�[�h9-2 �����܂� **********
			
			// ********** �R�[�h9-3 �������� **********
			// STEP 2-(2)-1 ���M���ׂ�SQL���̂ЂȌ`������
//			PreparedStatement pstmt = con.prepareStatement
//					("SELECT * FROM TEST WHERE NAME = ?");
//			// STEP 2-(2)-2 �ЂȌ`�ɒl�𗬂�����SQL����g�ݗ��Ă�
//			pstmt.setString(1, "A");             // �P�Ԗڂ́H��1�𗬂�����
//			// STEP 2-(2)-3 �g�ݗ��ďI����SQL����DBMS�ɑ��M����
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				System.out.print(rs.getInt("ID"));
//				System.out.print(rs.getString("NAME"));
//				System.out.println("");
//			}
			
			con.setAutoCommit(false);
			// STEP 2: SQL���M����
			/* *****���C����DB���쏈��***** */		
			String SQL = "INSERT INTO TEST(ID, NAME) VALUES( ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(SQL);
			pstmt.setInt(1, 3);
			pstmt.setString(2, "da");
			pstmt.executeUpdate();
			// STEP 2-(2)-4 ���ʕ\����������
			/* *************************************
		          ���ʕ\�̏����i�L�q������e�́A��q���܂��j
			 ************************************* */
			pstmt.close();                  // ��Еt��
			// ********** �R�[�h9-3 �����܂� **********

			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// STEP 3: �f�[�^�x�[�X�ڑ��̐ؒf
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		// ********** �R�[�h9-1 �����܂� **********

	}

}
