package dokoJava2;

import java.util.Comparator;

//�c����sort���|���邽�߂̃N���X
public class ZandakaComparator implements Comparator<Account> {
	  public int compare(Account x, Account y) {
		    return (x.zandaka - y.zandaka);
	 }
}
