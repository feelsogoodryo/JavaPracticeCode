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
			// ********** �R�[�h9-3 �������� **********
			// STEP 2-(2)-1 ���M���ׂ�SQL���̂ЂȌ`������
			PreparedStatement pstmt = con.prepareStatement
					("SELECT * FROM Test WHERE ID >= ?");
			// STEP 2-(2)-2 �ЂȌ`�ɒl�𗬂�����SQL����g�ݗ��Ă�
			pstmt.setInt(1, 2);             // �P�Ԗڂ́H��2�𗬂�����
			// STEP 2-(2)-3 �g�ݗ��ďI����SQL����DBMS�ɑ��M����
			ResultSet rs = pstmt.executeQuery();
			// STEP 2-(2)-4 ���ʕ\����������
			/* *************************************
		          ���ʕ\�̏����i�L�q������e�́A��q���܂��j
			 ************************************* */
			rs.close();
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
