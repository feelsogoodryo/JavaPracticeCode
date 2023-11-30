package practiceFourteen;

public class PracticeFourteen {

	public static void main(String[] args) {
		BankAccounts a = new BankAccounts("4649",1592);
		BankAccounts b = new BankAccounts("4649",1592);
		System.out.println(a.toString());
		System.out.println(a.equals(b));
		int n= 10;
		if(!(n >= 20)) {
			System.out.println(n);
		}
		if(n <= 20) {
			System.out.println(n);
		}
	}
}
