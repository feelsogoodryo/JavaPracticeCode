package dokoJava2;

import dokoJavaPractice.AccountType;

//口座クラスです（列挙型活用ver.）
//【利用例】new Account("1732050", AccountType.FUTSU);
public class AccountCap2 {
	private String accountNo;
	private int zandaka;
	private AccountType accountType;

	public AccountCap2(String aNo, AccountType aType) {
		this.accountNo = aNo;
		this.accountType = aType;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public int getZandaka() {
		return this.zandaka;
	}

	public void setZandaka(int zandaka) {
		this.zandaka = zandaka;
	}

	public AccountType getAccountType() {
		return accountType;
	}
}
