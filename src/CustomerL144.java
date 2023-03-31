import java.util.ArrayList;

public class CustomerL144 {

    private   String name;
    private ArrayList<Double> transactionList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionList() {
        return transactionList;
    }

    public CustomerL144(String name, ArrayList<Double> transactionList) {
        this.name = name;
        this.transactionList = transactionList;
    }

    public CustomerL144(String name) {
        this.name = name;
    }
}
