package dokoJava2;

import java.util.Comparator;

//c‚‚Åsort‚ğŠ|‚¯‚é‚½‚ß‚ÌƒNƒ‰ƒX
public class ZandakaComparator implements Comparator<Account> {
	  public int compare(Account x, Account y) {
		    return (x.zandaka - y.zandaka);
	 }
}
