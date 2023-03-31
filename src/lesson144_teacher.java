import java.util.ArrayList;

record CustomerT(String name, ArrayList<Double> transactions){
        public CustomerT (String name, double initialDeposit) {
            this(name.toUpperCase(),
                    new ArrayList<Double>(500));
            transactions.add(initialDeposit);
        }
}

public class lesson144_teacher {

    public static void main(String[] args) {
        CustomerT bob = new CustomerT("Bob S", 1000);
        System.out.println(bob);
        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A", 500);
        System.out.println(bank);

//        bank.addTransaction("Jane A", -10.25);
//        bank.addTransaction("Jane A", -75.01);
//        bank.printStatement("Jane a");
//        bank.addNewCustomer("Bob S", 25);
//        bank.addTransaction("Bob S", 100);
//        bank.printStatement("Bob S");
    }

}


class Bank {

    private String name;
    private ArrayList<CustomerT> customers = new ArrayList<>(1000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private CustomerT getCustomer(String customerName) {

        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            CustomerT customer = new CustomerT(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount) {
        CustomerT customer = getCustomer(name);
        if (customer != null) {
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {
        CustomerT customer = getCustomer(customerName);
        if (customer == null) {
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions:");
        for (double d : customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" :"credit");
        }

    }






}

