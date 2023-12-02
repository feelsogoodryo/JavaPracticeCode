package stringPractice;

public class StringProcessing {

	public static void main(String[] args) {
		// StringProcessing also called text processing(�����񏈗��܂��̓e�L�X�g�����ƌĂ΂��)
//������𒲍�����B
		//���e�������������ׂ�B
		System.out.println("equals check");
		String a1 = "aeiou";
		String a2= "aeiou";
		System.out.println(a1.equals(a2));//true
		System.out.println("");
		System.out.println("equalsIgnoreCase check");
		//�啶������������ʂ������e�������������ׂ�B
		String b1 = "aeiou";
		String b2 = "AEIOU";
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
//���������������B
		//�ꕔ�ɕ�����"s"���܂ނ��𒲂ׂ�
		System.out.println("");
		System.out.println("contains check");
		String e1 = "opqrstu";
		String e2 = "OPQRSTU";
		System.out.println("e1:" + e1.contains(e1));//true
		System.out.println("e2:" + e2.contentEquals(e2));//true
		//������"s"�Ŏn�܂邩�𒲂ׂ� ������"s"�ŏI��邩���ׂ�"endsWith"�����݂���B
		System.out.println("");
		System.out.println("startsWith check");
		String f1 = "Sports";
		String f2 = "sports";
		String f3 = "part";
		System.out.println("f1" + f1.startsWith(f1));//true
		System.out.println("f2" + f2.startsWith(f2));//true
		System.out.println("f3" + f2.startsWith(f3));//false
		//����"hoge"���ŏ��ɓo�ꂷ��ʒu�𒲂ׂ�B���݂���ꍇ�ɂ͂��̌����i0���琔����j�A�����ꍇ�ɂ�-1��Ԃ��B�啶������������ʂ���B
		//������̌�납��J�E���g����"lastIndexOf"�����݂���B
		System.out.println("");
		System.out.println("indexOf check");
		String g1 = "0123456hoge";
		String g2 = "0123456Hoge";
		System.out.println(g1.indexOf("hoge"));//7
		System.out.println(g2.indexOf("hoge"));//-1
//�������؂�o��
		//�w��ʒu�̂P������؂�o����0����J�E���g
		System.out.println("");
		System.out.println("charAt check");
		String h1 = "0123456789";
		System.out.println(h1.charAt(8));//8
		//�w��ʒu����n�܂镶�����C�ӂ̒��������؂�o��
		System.out.println("");
		System.out.println("substring check");
		String i1 = "0123456789";
		System.out.println(i1.substring(0));//0123456789 0�����ڂ���S�Ă̕�����؂�o��
		System.out.println(i1.substring(0, 5));//01234�@0�����ڂ���5�����ڂ܂ł̕�����؂�o��
//�������ϊ�����
		//�啶�����������ɕϊ�����@��������啶���ɕϊ�����"toUpperCase"�����݂���
		System.out.println("");
		System.out.println("toUpperCase and toLowerCase check");
		String j1 = "abcdefg";
		System.out.println(j1.toUpperCase());//ABCDEFG
		System.out.println(j1.toLowerCase());//abcdefg
		System.out.println("");
		System.out.println("trim check");
		//�󔒂���������
		String k1 = " abcdefg  \t";
		String k2 = "�@abc�@";//�S�p�X�y�[�X
		System.out.println(k1.trim());//abcdefg
		System.out.println(k2.trim());//�@abc�@���S�p�X�y�[�X�̓g��������Ȃ��B
		//�������u��������
		System.out.println("");
		System.out.println("replace check");
		String l1 ="0123456789";
		System.out.println(l1.replace("56789","01234"));//0123401234
//������̘A��
		//�������A�����ĘA������ꍇ�ɍ������\�𔭊�����"StringBuilder�N���X"
		//+�ɂ��A����4604�{�����ŏ������\
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			sb.append("JAVA:" + i);
		}
		String s = sb.toString();
		System.out.println(s);
//String�ACher�z��Abyte�z��̑��ݕϊ�
		String m1 = "HelloWould";
		char[] data1 = m1.toCharArray();
		byte[] data2 = m1.getBytes();
		for(char a : data1) {
			System.out.print(a + "," + " ");
		}
		System.out.println("");
		for(byte b : data2) {
			System.out.print(b + "," + " ");
		}
	}
}
