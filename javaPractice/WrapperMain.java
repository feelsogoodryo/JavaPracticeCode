package javaPractice;

import java.util.ArrayList;

public class WrapperMain {

	public static void main(String[] args) {
		/* �R���N�V�����A�Ⴆ��ArrayList�Ɋ�{�f�[�^�^�͓�����Ȃ�
		 * 8�̊�{�f�[�^�^�ɑΉ����Ċ�{�f�[�^�^�̏��𒆂ɐg�ێ�����N���X���p�ӂ���Ă���B
		 * �����wrapper class�@���b�p�[�N���X�Ƒ��̂���B
		 * float   Float
		 * double  Double
		 * char    Character
		 * boolean Boolean
		 * byte    Byte
		 * short   Short
		 * int     Integer
		 * long    Long
		 * 
		 *���b�p�[�N���X�Ɗ�{�f�[�^�^�𑊌݂Ɏ����ϊ�����@�\��������Ă���A
		 *AutBoxing�i�I�[�g�{�N�V���O�j�AAutUnboxing�i�I�[�g�A���{�N�V���O�j�ƌĂ΂��
		 * */
	    ArrayList<Integer> points = new ArrayList<Integer>();//Integer�^�Ő錾
	    points.add(10);//�����I��Integer�ɕϊ��E�i�[�����
	    points.add(80);
	    points.add(75);
	    for (int i : points) {
	      System.out.println(i);
	    }
	    //�����I�Ɋ�{�^�ƃ��b�p�[�N���X��ϊ��������ꍇ�͈ȉ����\�b�h���g�p����B
	    //Integer ��new����̂�Java9����񐄏��ƂȂ����B
	    Integer i1 = Integer.valueOf(10);
	    int i2 = i1.intValue();
	    System.out.println(i2);
	}

}
