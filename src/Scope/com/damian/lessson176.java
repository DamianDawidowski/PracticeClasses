package Scope.com.damian;

public class lessson176 {
    public static void main(String[] args) {
Account damiansAccount = new Account("Damian");
        damiansAccount.deposit(1000);
        damiansAccount.withdraw(500);
        damiansAccount.withdraw(-200);
        damiansAccount.deposit(-20);
        damiansAccount.calculateBalance();
//        damiansAccount.balance = 5000;

System.out.println("Balance on account is " +damiansAccount.getBalance());
//damiansAccount.transactions.add(4500);
damiansAccount.calculateBalance();
    }
}
