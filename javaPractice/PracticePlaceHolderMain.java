package javaPractice;

import objectPractice.Hero;

public class PracticePlaceHolderMain {

	public static void main(String[] args) {
		/*
       * �v���[�X�z���_�ɂ���
		*����
		 * , �O�����ƂɃJ���}������
		 * 0�@�󂫗̈��0����
		 * -�@����
		 * +�@�����������\��
		 * 
		*�� 
		 * �\���������w�肷��
		 * n.m�`���Ŏw�肵���ꍇ�A�S�̂�n���A�����_�ȉ�m���ł̕\���ƂȂ�B
		 * 
		*�^
		 * d�@����
		 * s�@������
		 * f�@����
		 * b�@�^�U�l
		 * 
		 * % ����(, or 0 or - or + (�ȗ���)) ��((�ȗ���)) �^(d or s or f or b(�K�{))
		 * 
		 * ��F
		 * �@%-9s %-13s ������%,6d
		 * ���v���[�X�z���_�͓��{��i�S�p�j��������ƕ����\��������
		 */
		Hero hero1 = new Hero("Hero1");
		Hero hero2 = new Hero("Hero2");
		Hero hero3 = new Hero("Hero3");
		
		final String FORMAT = "%-9s %-13s ������%,6d";
		String s1 = String.format(FORMAT, hero1.getName(),hero1.getJob(),hero1.getGold());
		String s2 = String.format(FORMAT, hero2.getName(),hero2.getJob(),hero2.getGold());
		System.out.println(s1 + "\r" +s2);//�ʓ|�Ȃ̂ŉ��s�̐��K�\�����g�p
		//format()���g���ĕ���������Ɠ����ɉ�ʂɏo�͂������ꍇ��System.out.printf�i�j���g�p�ł���B
		System.out.printf(FORMAT, hero3.getName(),hero3.getJob(),hero3.getGold());
	}

}
