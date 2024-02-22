public class ClosedState implements AccountState{
    public void closed(Account account){
        System.out.println("Account is already closed!");
     }

    public void activate(Account account) {
        account.setState(new ActiveState());
        System.out.println("Account cannot be activated!");
    }

    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("Account cannot be suspended!");
    }

    public void deposit(Double depositDouble, Account account) {
        System.out.println("Closed accounts cannot deposit!");
        account.toString();
    }

    public void withdraw(Double withdrawDouble, Account account) {
        System.out.println("Closed accounts cannot withdraw!");
        account.toString();
    }
}
