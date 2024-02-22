public class SuspendedState implements AccountState{
    public void suspend(Account account){
        System.out.println("Account is already suspended!");
     }

    public void activate(Account account) {
        account.setState(new ActiveState());
        System.out.println("Account has been activated!");
    }

    public void closed(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account has been closed!");
    }

    public void deposit(Double depositDouble, Account account) {
        System.out.println("Suspended accounts cannot deposit!");
        account.toString();
    }

    public void withdraw(Double withdrawDouble, Account account) {
        System.out.println("Suspended accounts cannot withdraw!");
        account.toString();
    }
}
