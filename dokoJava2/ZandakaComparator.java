package dokoJava2;

import java.util.Comparator;

//残高でsortを掛けるためのクラス
public class ZandakaComparator implements Comparator<Account> {
	  public int compare(Account x, Account y) {
		    return (x.zandaka - y.zandaka);
	 }
}
