package stringPractice;

public class StringProcessing {

	public static void main(String[] args) {
		// StringProcessing also called text processing(�����񏈗��܂��̓e�L�X�g�����ƌĂ΂��)
		
		//���e�������������ׂ�B
		System.out.println("equals check");
		String a1 ="aeiou";
		String a2="aeiou";
		System.out.println(a1.equals(a2));//true
		System.out.println("");
		System.out.println("equalsIgnoreCase check");
		//�啶������������ʂ������e�������������ׂ�B
		String b1 ="aeiou";
		String b2 ="AEIOU";
		System.out.println(b1.equalsIgnoreCase(b2));//true
		System.out.println("");
		System.out.println("length check");
		//�����񒷂𒲂ׂ�B�S�p�����p���ꕶ���Ƃ��ăJ�E���g����
		String c = "abcdefg";
		System.out.println(c.length());//7
		//�󕶎����i�������O���j�𒲂ׂ� length() == 0�ƈӖ��͓���
		String d1 = "";
		String d2 = null; // java.lang.NullPointerException
		String d3 = "a";
		System.out.println("d1 is " + d1.isEmpty() +" ,"+ "d3 is " + d3.isEmpty());
	}
}
