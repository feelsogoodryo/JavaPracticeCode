package regularExpression;

public class RegularExpressionSummary {

	public static void main(String[] args) {
		//�ʏ핶��
		System.out.println("");
		System.out.println("JAVA check");
		System.out.println("JAVA".matches("JAVA"));//true
		//�s���I�h
		System.out.println("");
		System.out.println("J.VA check");
		System.out.println("Jeva".matches("J.va"));//true
		//�A�X�^���X�N
		System.out.println("");
		System.out.println("AB* check");
		System.out.println("A".matches("AB*"));//true
		System.out.println("AB".matches("AB*"));//true
		System.out.println("ABBBBB".matches("AB*"));//true
		System.out.println("");
		System.out.println("Ma.* check");
		//Ma�Ŏn�܂�C�ӂ̕���
		System.out.println("Malll".matches("Ma.*"));//true
		System.out.println("Ma".matches("Ma.*"));//true
		//�g�������A�p���������̃n�C�t��
		System.out.println("");
		System.out.println("[A-Z]{7} check");
		//A~Z��7��J��Ԃ�
		System.out.println("ABCDEFG".matches("[A-Z]{7}"));//true
		System.out.println("");
		System.out.println("[A-Z][A-Z0-9]{7} check");
		//���߂̈ꕶ����A~Z�A�񕶎��ڂ���A~Z�������̂����ꂩ�A�g�[�^��������
		System.out.println("A1234567".matches("[A-Z][A-Z0-9]{7}"));//true
		System.out.println("");
		System.out.println("A{1}B{2,}C{3,5}D?E+ check");
		//A��1��AB��2��ȏ�AC��3��ȏ�5��ȉ��AD��0��܂���1��AE��1��ȏ�
		System.out.println("ABBCCCDE".matches("A{1}B{2,}C{3,5}D?E+"));//true
		System.out.println("ABBBCCCCCEEEE".matches("A{1}B{2,}C{3,5}D?E+"));//true
		//�p������
		System.out.println("");
		System.out.println("UR[LIN] check");
		//UR�̌��L,I,N�̂����ꂩ
		System.out.println("URL".matches("UR[LIN]"));//true
		System.out.println("");
		System.out.println("\\d check");
		//�����ꂩ�̐���[0-9]�Ɠ���
		System.out.println("1".matches("\\d"));//true
		System.out.println("");
		System.out.println("\\w check");
		//�p���E�����E�A���_�[�o�[[a-zA-Z_0-9]�Ɠ����B+�A�X�^���X�N
		System.out.println("aA_9".matches("\\w*"));
		System.out.println("");
		System.out.println("\\s check");
		//�󔒕����i�X�y�[�X�A�^�u�����A���s�����Ȃǁj
		System.out.println(" ".matches("\\s"));
		System.out.println("");
		System.out.println("splitMethod check");
		//splitMethod�̗��p
		String a ="abc,def:ghi";
		String[] words = a.split("[,:]");
		for(String w : words) {
			System.out.print(w + "->");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("replaceAll check");
		//replaceAllMethod�̗��p
		String b = "abc,def,ghi";
		String c = b.replace("[beh]","X");
		System.out.println(c);//abc,def,ghi
	}

}
