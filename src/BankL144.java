import java.util.ArrayList;

public class BankL144 {

    private   String name;
    private static ArrayList<CustomerL144> customerList = new ArrayList<>();


    public static void main(String[] args) {
        CustomerL144 Damian = new CustomerL144("Damian" , new ArrayList<Double>());
        addCustomer(Damian);
        CustomerL144 Dawid = new CustomerL144("Dawid" , new ArrayList<Double>());
        printStatement(Dawid);
        addTransaction(Damian, 5.0);
        addTransaction(Damian, -5.0);
        addTransaction(Damian, 15.0);
        addCustomer(Damian);
        printStatement(Damian);
        CustomerL144 DamianD = new CustomerL144("DamianD" , new ArrayList<Double>());
        printStatement(DamianD);
    }

    private static void addCustomer(CustomerL144 customer) {
        if (!customerList.contains(customer)) {
            customerList.add(customer);
        }
        else {
            System.out.println("Customer already exists in the database");
        }
    }
    private static void addTransaction(CustomerL144 customer, double transaction) {
        customer.getTransactionList().add(transaction);
    }

    private static void printStatement(CustomerL144 customer) {
        if (customerList.contains(customer)) {
    System.out.println("Customer name is "+ customer.getName()+" . All transactions are: "+ customer.getTransactionList());
     } else {
            System.out.println(  customer.getName()+" is not a customer." );
        }
    }


    public static void setCustomerList(ArrayList<CustomerL144> customerList) {
        BankL144.customerList = customerList;
    }
}
