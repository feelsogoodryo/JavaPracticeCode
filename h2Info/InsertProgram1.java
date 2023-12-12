package h2Info;

import java.util.ArrayList;

public class InsertProgram1 {

	// �z��錾
	private static ArrayList<String> isbnList = null;	// isbn���i�[�p�̃��X�g
	private static ArrayList<String> titleList = null;	// title���i�[�p�̃��X�g
 	private static ArrayList<Integer> priceList = null;	// price���i�[�p�̃��X�g
 	
	public static void main(String[] args) {
 		try{
 			// DAO�I�u�W�F�N�g��
 			SampleDAO1 objDao = new SampleDAO1();
 
 			// ���Џ����擾���郁�\�b�h��DAO����Ăяo��
 			isbnList = objDao.selectIsbnAll();	    // isbn���S�Ď擾���\�b�h�Ăяo��
 			titleList = objDao.selectTitleAll();	// title���S�Ď擾���\�b�h�Ăяo��
 			priceList = objDao.selectPriceAll();	// price���S�Ď擾���\�b�h�Ăяo��
 
 			// �擾�������Џ���\��
 			System.out.println("���o�^SQL���s�O�̏��Јꗗ�\����");
 			display();
 
 			// ���Џ���o�^���郁�\�b�h��DAO����Ăяo��
 			int rowsCount = objDao.insertBook("00008", "Struts�e�L�X�g", 2000);
 			if(rowsCount > 0){
 				System.out.println(rowsCount + "���̃��R�[�h��o�^���܂����B\n");
 			}
 
 			// ���Џ����擾���郁�\�b�h��DAO����Ăяo��
 			isbnList = objDao.selectIsbnAll();	    // ISBN���S�Ď擾���\�b�h�Ăяo��
 			titleList = objDao.selectTitleAll();	// Title���S�Ď擾���\�b�h�Ăяo��
 			priceList = objDao.selectPriceAll();	// Price���S�Ď擾���\�b�h�Ăяo��
 
 			// �擾�������Џ���\��
 			System.out.println("���o�^SQL���s��̏��Јꗗ�\����");
 			display();
 
 		}catch(Exception e){
 			System.out.println("�G���[���������܂����B" + e);
 		}
 	}
 
 	public static void display() {
 		for(int i=0;i<isbnList.size();i++){
 			System.out.print("ISBN��"  + isbnList.get(i)  + "\t");
 			System.out.print("Title��" + titleList.get(i) + "\t");
 			System.out.print("Price��" + priceList.get(i) + "\n");
 		}
 		System.out.println();

	}

}
