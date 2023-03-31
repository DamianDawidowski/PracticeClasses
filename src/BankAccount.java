public class BankAccount {

    private String accountNumber;
    private double accountBalance = 0;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){

        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber, double accountBalance, String customerName, String email, String phone){
        System.out.println("Account with parameters called");
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
        this.customerName=customerName;
        this.email=email;
        phoneNumber=phone;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {
        accountBalance += deposit;
        System.out.println("Dear "+customerName+" total account balance is " + accountBalance);
//        return accountBalance;
    }

    public double withdrawFunds(double withdraw) {
        if (withdraw > accountBalance) {
            System.out.println("NOT ENOUGH FUNDS");
        } else {
            accountBalance -= withdraw;
            System.out.println("Dear "+customerName+" total account balance is " + accountBalance);

        }
        return accountBalance;
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
