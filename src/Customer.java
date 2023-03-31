public class Customer {
    private String name;
    private double limit;
    private String email;


    public Customer(String name, double limit,String email){
        System.out.println("Account with parameters called");
        this.name=name;
        this.limit=limit;
        this.email=email;    }
    public Customer(){
        this("Damian", "dd@wp.pl");
        System.out.println("Account with no parameters called");
    }
    public Customer(String name, String email){
        this(name, 100.50, email);
        System.out.println("Account with two parameters called");
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
