public class Account{
    private String accountNumber = "";
    double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }

    public AccountState getState(){
        return accountState;
    }

    public void setState(AccountState state){
        this.accountState = state;
    }

    public void activate(){
        accountState.activate(this);
    }

    public void withdraw(Double withdrawDouble){
        accountState.withdraw(withdrawDouble, this);
    }

    public void deposit(Double depositDouble){
        accountState.deposit(depositDouble, this);
    }

    public void suspend(){
        accountState.suspend(this);
    }

    public void close(){
        accountState.closed(this);
    }

    public String toString(){
        System.out.println("Account Number: " + accountNumber + "\nBalance: " + balance);
        return "";
    }
}
