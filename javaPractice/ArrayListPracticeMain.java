package javaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import objectPractice.Hero;
public class ArrayListPracticeMain {

	public static void main(String[] args) {
		// <>���̋L���̓W�F�l���N�X�ƌĂ΂��B�_�C�������h���Z�q�Ƃ��Ă΂��B
		//List�^�Ɠ��l�ɗv�f�̈ʒu�i�Y�����j�̎w�肪0����n�܂�B
		ArrayList<String> names = new ArrayList<String>();
		names.add("Hiroshi");
		names.add("Hiroki");
		names.add("Kouji");
		System.out.println(names.get(1));
		//�v�f2�ɒǉ�����B
		names.add(2,"Nakako");
		//�v�f�R�̍X�V
		System.out.println("Befor" + " " + names.get(3));
		names.set(3,"Syuuseiko");
		System.out.println("After" + " "+ names.get(3));
		
		//�v�f�����m�F����Ƃ���size()�����悤����BList�ł�length���g�p���Ă���B
		//�v�f����0���m�F����ꍇ�́AisEmpty()��p����B
		System.out.println("names size is " + names.size());
		System.out.println(names.isEmpty());//false
		
		//Iterator ���X�g�Ɋ܂܂���̔��������I�Ǝw���Ă�����̂悤�Ȃ���
		//�܂��C�e���[�^�̃C���X�^���X�𐶂ݏo���B���̎�new�͎g��Ȃ��B
		System.out.println("");
		System.out.println("Iterator check");
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		/*���X�g����v�f�����Ɏ��o���R��ނ̕��@�́A
		 *1 for
		 * �����F�Â�Java�ł����p�\
		 * �Z���F�\����������ɂ���
		 *2 �g��for
		 * �����F�\����������₷��
		 * �@�@�@�@Set�Ȃǂł����p�\
		 * �Z���F���񐔂��擾�ł��Ȃ�
		 *3 Iterator
		 * �����F�Â�Java�ł����p�\
		 * �@�@�@�@Set�Ȃǂł����p�\
		 * �Z���F�\����������ɂ���
		 * �@�@�@�@���񐔂��擾�ł��Ȃ�
		 * 
		 * List���p������LinkedList�����݂���
		 * �v�f�̑}���E�폜�@������̕�������
		 * �w��ʒu�̗v�f�̎擾�@ArrayList�̂ق�������
		 * */
		
		//�R���N�V�����̃C���X�^���X�͋ɗ͞B���Ȍ^�Ŏg�p����̂�better
		System.out.println("");
		System.out.println("List check");
		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		List<Hero> list2 = new LinkedList<Hero>();
		printList(list1);
		//printList2(list1);�^�Ⴂ�ŃG���[���o��
		
		//�v�f�Q�ƂɊւ��钍�ӓ_
		System.out.println("");
		System.out.println("Notes on element references check");
	    Hero h = new Hero("Minato");
	    System.out.println("BeforName:" + h.name);
	    List<Hero> list = new ArrayList<Hero>();
	    list.add(h);
	    h.name = "�X�K����";
	    System.out.println("BeforName:" + list.get(0).name);

	}
		public static void printList(List<String> list) {
			for(String s : list) {
				System.out.println(s);
			}
		}
		//ArrayList�Ő錾�����ArrayList�ł����󂯎��Ȃ��B
		public static void printList2(ArrayList<String> list) {
			for(String s : list) {
				System.out.println(s);
			}
		}
}