package practiceFourteen;

public class BankAccounts {
	private String accountNumber;
	private int balance;
	
	public BankAccounts(String accountNumber, int balance) {
		this.setAccountNumber(accountNumber);
		this.setBalance(balance);
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int balance) {
		if(balance < 0) {
			this.balance = 0;
			return;
		}
		this.balance = balance;
	}
    public String toString() {
        return "w\\" + this.balance + "(" + "BankAccount:" + this.accountNumber+ ")" + "x";
    }
    public boolean equals(Object obj) {
    	//Is it myself?
        if(this == obj) {
        	return true;  	
        }
        //Are the BankAccounts the same?
        if(obj instanceof BankAccounts) {
        	BankAccounts a = (BankAccounts)obj;
        	String an1 = this.accountNumber.trim();
        	String an2 = a.accountNumber.trim();
        	if(an1.equals(an2)) {
        		return true;
        	}
        }
        //Other than that
        return false;
    }
}
