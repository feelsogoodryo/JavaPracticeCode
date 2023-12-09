package dokoJava2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//�Q�l�ɂ����T�C�g
//https://blog.java-reference.com/db-insert/
public class CaptrueNineInsertMain {

	public static void main(String[] args)throws Exception {
		// Insert practice
		//�ϐ���`
		Connection conn = null;
		PreparedStatement ps = null;

		//DB�ڑ�����ݒ肷��
		String path = "jdbc:h2:tcp://localhost/C:\\\\data\\\\example1";  //�ڑ��p�X
		String id = "sa";    //���O�C��ID
		String pw = "1234";  //���O�C���p�X���[�h

		//SQL�����`����
		String sql = "INSERT INTO EMPLOYEES values(?, ?, ?)";
		try {
			//JDBC�h���C�o�����[�h����
			Class.forName("org.h2.Driver");

			//DB�ւ̃R�l�N�V�������쐬����
			conn = DriverManager.getConnection(path, id, pw);
			conn.setAutoCommit(false);  //�I�[�g�R�~�b�g�̓I�t

			//���s����SQL���ƃp�����[�^���w�肷��
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 12);
			ps.setString(2, "�R�c�l�Y");
			ps.setInt(3,24);

			//INSERT�������s����
			int i = ps.executeUpdate();

			//����������\������
			System.out.println("���ʁF" + i);

			//�R�~�b�g
			conn.commit();

		} catch (Exception ex) {
			//��O�������̏���
			conn.rollback();       //���[���o�b�N����
			ex.printStackTrace();  //�G���[���e���R���\�[���ɏo�͂���

		} finally {
			//�N���[�Y����
			if (ps != null) ps.close();
			if (conn != null) conn.close();
		}
	}

}
