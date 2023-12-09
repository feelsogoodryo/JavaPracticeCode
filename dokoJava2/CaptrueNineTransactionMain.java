package dokoJava2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class CaptrueNineTransactionMain {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		// ********** �R�[�h9-6 ��������i1�s�ڂ�import�����܂ށj **********
		// STEP 0: ���O�����iJAR�z�u���܂ށj
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("�h���C�o�̃��[�h�Ɏ��s���܂���");
		}
		/* : */
		Connection con = null;
		try {
			// STEP 1: �f�[�^�x�[�X�̐ڑ�
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/C:\\\\data\\\\example1\",\"sa\",\"1234");
			con.setAutoCommit(false);
			// STEP 2: SQL���M����
			/* *****���C����DB���쏈��***** */			
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
			// STEP 3: �f�[�^�x�[�X�ڑ��̐ؒf
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e3) {
					e3.printStackTrace();
				}
			}
		}
		// ********** �R�[�h9-6 �����܂� **********

	}

}
