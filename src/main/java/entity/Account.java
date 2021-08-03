package entity;

public class Account {
	
	private boolean balance;
    private String accountStatus;
    private String accountType;
    private int userId;

    public Account() {

    }

    public Account(boolean balance, String accountStatus, String accountType, int userId) {
        this.balance = balance;
        this.accountStatus = accountStatus;
        this.accountType = accountType;
        this.userId = userId;
    }

    public boolean isBalance() {
        return balance;
    }

    public void setBalance(boolean balance) {
        this.balance = balance;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
