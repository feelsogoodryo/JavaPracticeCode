package h2Info;

import java.util.ArrayList;

public class InsertProgram2 {

	// �z��錾
	private static ArrayList<SampleDTO>bookList = null;	// SampleDTO�^�̃I�u�W�F�N�g���i�[����ArrayList

	public static void main(String[] args) {
		try{
			// DAO�I�u�W�F�N�g��
			SampleDAO2 objDao = new SampleDAO2();

			// ���Џ����擾���郁�\�b�h��DAO����Ăяo��
			bookList = objDao.selectAll();	// �S�Ă̏����擾���\�b�h�Ăяo��

			// �擾�������Џ���\��
			System.out.println("���o�^SQL���s�O�̏��Јꗗ�\����");
			display();

			SampleDTO bookDto = new SampleDTO();
			bookDto.setIsbn("00009");
			bookDto.setTitle("Ruby����e�L�X�g");
			bookDto.setPrice(2500);

			// ���Џ���o�^���郁�\�b�h��DAO����Ăяo��
			int rowsCount = objDao.insertBook(bookDto);
			if(rowsCount > 0){
				System.out.println(rowsCount + "���̃��R�[�h��o�^���܂����B\n");
			}

			// ���Џ����擾���郁�\�b�h��DAO����Ăяo��
			bookList = objDao.selectAll();	// �S�Ă̏����擾���\�b�h�Ăяo��

			// �擾�������Џ���\��
			System.out.println("���o�^SQL���s��̏��Јꗗ�\����");
			display();

		}catch(Exception e){
			System.out.println("�G���[���������܂����B" + e);
		}
	}

	public static void display() {
		for(int i=0;i<bookList.size();i++){
			SampleDTO bookDto = bookList.get(i);
			System.out.print("ISBN��"  + bookDto.getIsbn()  + "\t");
			System.out.print("Title��" + bookDto.getTitle() + "\t");
			System.out.print("Price��" + bookDto.getPrice() + "\n");
		}
		System.out.println();

	}

}
