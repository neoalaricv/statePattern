public class ActiveState implements AccountState{
    public void activate(Account account){
       System.out.println("Account is already activated!");
    }

    public void suspend(Account account){
        account.setState(new SuspendedState());
        System.out.println("Account has been suspended!");
     }

     public void closed(Account account){
        account.setState(new ClosedState());
        System.out.println("Account has been closed!");
     }

     public void deposit(Double depositDouble, Account account){
        account.balance = account.balance + depositDouble;
        System.out.println("Making a deposit... ");
        account.toString();
     }

     public void withdraw(Double withdrawDouble, Account account){
        account.balance = account.balance - withdrawDouble;
        System.out.println("Making a withdrawal... ");
        account.toString();
     }

}
