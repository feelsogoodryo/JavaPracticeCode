package javaPractice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetPracticeMain {

	public static void main(String[] args) {
		/* �d�������l���i�[���悤�Ƃ��Ă���������
		 * �v�f��������o���ꍇ�͏������s��
		 * */
	    Set<String> colors = new HashSet<String>();
	    colors.add("��");
	    colors.add("��");
	    colors.add("��");
	    colors.add("��");
	    System.out.println("�F��" + colors.size() + "���");
	    
	    //���R�����t���ŏ��������܂�BString�͎�����
	    Set<String> words = new TreeSet<String>();
	    words.add("dog");
	    words.add("cat");
	    words.add("wolf");
	    words.add("panda");
	    for (String s : words) {
	      System.out.print(s + "��");
	    }

	}

}
