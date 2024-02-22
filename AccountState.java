public interface AccountState{
    public void activate(Account account);
    public void suspend(Account account);
    public void closed(Account account);
    public void deposit(Double depositDouble, Account account);
    public void withdraw(Double withdrawDouble, Account account);
}
