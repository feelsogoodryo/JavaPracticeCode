package dokoJava2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CaptureOneHashSetPracticeMain {

	public static void main(String[] args) {
		// HashSet:重複した値を書くようしようとするとスルーされる。値の順序が保証されない。
	    Set<Hero> list = new HashSet<>();
	    Hero h1 = new Hero();
	    h1.name = "ミナト";
	    System.out.println(h1.name);
	    list.add(h1);
	    System.out.println("要素数=" + list.size());
	    h1 = new Hero();
	    h1.name = "ミナト";
	    System.out.println(h1.name);
	    list.remove(h1);
	    System.out.println("要素数=" + list.size());
	    
	    //sort():中身の要素を順番に並び変える
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
	    //口座番号でソートする
	    Collections.sort(accountlist);
	    for(Account i : accountlist) {
	    	System.out.println(i.number);
	    }
	    //残高でソートする
	    System.out.println("");
	    System.out.println("Zandaka sort start");
	    Collections.sort(accountlist,new ZandakaComparator());
	    for(Account i : accountlist) {
	    	System.out.println(i.zandaka);
	    }
	    //TreeSetの活用
	    //自然順序（口座番号順）で並び変える	
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
	    //残高順で並び変える
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
	    //注意：equals()とcompareTo()の二つを実装する場合、両者の一貫性が重要となる。
	    //ここで言う一貫性とはequals()でtrueが変える二つのインスタンスは、compareTo()で必ず０が返ってくるといる事。
	    
		System.out.println("");
		System.out.println("Clone start");
	    Hero e1 = new Hero("ミナト");
	    Sword s = new Sword("はがねの剣");

	    e1.setSword(s);
	    System.out.println("装備：" + e1.getSword().getName());
	    System.out.println("clone()で複製します");
	    Hero e2 = e1.clone();

	    System.out.println("コピー元の勇者の剣の名前を変えます");
	    e1.getSword().setName("ひのきの棒");
	    System.out.println("コピー元とコピー先の勇者の装備を表示します");
	    System.out.println("コピー元：" + e1.getSword().getName() + "／コピー先：" + e2.getSword().getName());
	}

}
