package dokoJava2;

//何故かimport dokoJavaPractice.AccountType;を一度インポートしてからでないとimport static dokoJavaPractice.AccountType.FUTSU;をインポート出来なかった。
import static dokoJavaPractice.AccountType.FUTSU;
public class CaptureTwoMain {

	public static void main(String[] args) {
		AccountCap2 a1 = new AccountCap2("1732050", FUTSU);//インポートしてあるためAccountType.FUTSUと書かなくても良い。
		System.out.println("口座番号は" + a1.getAccountNo() + "です");
		System.out.println("口座種別は" + a1.getAccountType() + "です");
	}

}
