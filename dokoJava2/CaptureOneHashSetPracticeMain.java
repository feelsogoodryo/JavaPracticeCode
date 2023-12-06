package dokoJava2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CaptureOneHashSetPracticeMain {

	public static void main(String[] args) {
		// HashSet:�d�������l�������悤���悤�Ƃ���ƃX���[�����B�l�̏������ۏ؂���Ȃ��B
	    Set<Hero> list = new HashSet<>();
	    Hero h1 = new Hero();
	    h1.name = "�~�i�g";
	    System.out.println(h1.name);
	    list.add(h1);
	    System.out.println("�v�f��=" + list.size());
	    h1 = new Hero();
	    h1.name = "�~�i�g";
	    System.out.println(h1.name);
	    list.remove(h1);
	    System.out.println("�v�f��=" + list.size());
	    
	    //sort():���g�̗v�f�����Ԃɕ��ѕς���
	    Account user1 = new Account(1,100);
	    Account user2 = new Account(7,500);
	    Account user3 = new Account(8,400);
	    Account user4 = new Account(4,7600);
	    Account user5 = new Account(12,700);
	    
	    List<Account> accountlist = new ArrayList<>();
	    accountlist.add(user1);
	    accountlist.add(user2);
	    accountlist.add(user3);
	    accountlist.add(user4);
	    accountlist.add(user5);
	    /* : */
	    System.out.println("");
	    System.out.println("sort check");
	    System.out.println("Befor");
	    for(Account i : accountlist) {
	    	System.out.println(i.number);
	    }
	    System.out.println("");
	    System.out.println("number sort start");
	    //�����ԍ��Ń\�[�g����
	    Collections.sort(accountlist);
	    for(Account i : accountlist) {
	    	System.out.println(i.number);
	    }
	    //�c���Ń\�[�g����
	    System.out.println("");
	    System.out.println("Zandaka sort start");
	    Collections.sort(accountlist,new ZandakaComparator());
	    for(Account i : accountlist) {
	    	System.out.println(i.zandaka);
	    }
	    //TreeSet�̊��p
	    //���R�����i�����ԍ����j�ŕ��ѕς���	
		System.out.println("");
		System.out.println("TreeSet1 start");
	    TreeSet<Account> accounts1 = new TreeSet<>();
	    accounts1.add(user1);
	    accounts1.add(user2);
	    accounts1.add(user3);
	    accounts1.add(user4);
	    accounts1.add(user5);
	    for(Account a : accounts1) {
	    	System.out.println(a.number);
	    }
	    //�c�����ŕ��ѕς���
		System.out.println("");
		System.out.println("TreeSet2 start");
	    TreeSet<Account> accounts2 = new TreeSet<>(new ZandakaComparator());
	    accounts2.add(user1);
	    accounts2.add(user2);
	    accounts2.add(user3);
	    accounts2.add(user4);
	    accounts2.add(user5);
	    for(Account b : accounts2) {
	    	System.out.println(b.zandaka);
	    }
	    //���ӁFequals()��compareTo()�̓����������ꍇ�A���҂̈�ѐ����d�v�ƂȂ�B
	    //�����Ō�����ѐ��Ƃ�equals()��true���ς����̃C���X�^���X�́AcompareTo()�ŕK���O���Ԃ��Ă���Ƃ��鎖�B
	    
		System.out.println("");
		System.out.println("Clone start");
	    Hero e1 = new Hero("�~�i�g");
	    Sword s = new Sword("�͂��˂̌�");

	    e1.setSword(s);
	    System.out.println("�����F" + e1.getSword().getName());
	    System.out.println("clone()�ŕ������܂�");
	    Hero e2 = e1.clone();

	    System.out.println("�R�s�[���̗E�҂̌��̖��O��ς��܂�");
	    e1.getSword().setName("�Ђ̂��̖_");
	    System.out.println("�R�s�[���ƃR�s�[��̗E�҂̑�����\�����܂�");
	    System.out.println("�R�s�[���F" + e1.getSword().getName() + "�^�R�s�[��F" + e2.getSword().getName());
	}

}
