package dokoJavaPractice;

import java.io.IOException;

public class PracticesSeventeen {

	public static void main(String[] args) throws IOException {//17-4��throws IOException�����������B

		
		//17-1,17-2 
		try {
		String s = null;
		// java.lang.NullPointerException����������
		System.out.println(s.length());
		} catch(NullPointerException e) {
			System.out.println("NullPointerException��O��catch���܂����B");
			System.out.println("--�X�^�b�N�g���[�X�i��������j--");
			e.printStackTrace();
			System.out.println("--�X�^�b�N�g���[�X�i�����܂Łj--");
		}
		//17-3
		try {
		//NumberFormatException����������	
		int i = Integer.parseInt("�O");
		System.out.println(i);
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException��O��catch���܂����B");
			System.out.println("--�X�^�b�N�g���[�X�i��������j--");
			e.printStackTrace();
			System.out.println("--�X�^�b�N�g���[�X�i�����܂Łj--");
		}
		//17-4 throw�̋�������
		System.out.println("");
		System.out.println("�v���O�������N�����܂���");
		throw new IOException();
	}

}
