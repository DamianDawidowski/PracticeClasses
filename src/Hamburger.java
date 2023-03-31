public class Hamburger {
  private String name;
  private String meat;
  private double price;


  private String breadRollType;
  private String addition1Name;
  private double addition1Price;
  private String addition2Name;
  private double addition2Price;
  private String addition3Name;
  private double addition3Price;
  private String addition4Name;
  private double addition4Price;

    public void addHamburgerAddition1(String addition1Name,double addition1Price ) {
      this.addition1Name = addition1Name;
      this.addition1Price = addition1Price;
      price+=addition1Price;
      System.out.println("Added " + this.addition1Name
              + " for an extra " + this.addition1Price);
    }
  public void addHamburgerAddition2(String addition2Name,double addition2Price ) {
    this.addition2Name = addition2Name;
    this.addition2Price = addition2Price;
    price+=addition2Price;
    System.out.println("Added " + this.addition2Name
            + " for an extra " + this.addition2Price);
  }
  public void addHamburgerAddition3(String addition3Name,double addition3Price ) {
    this.addition3Name = addition3Name;
    this.addition3Price = addition3Price;
    price+=addition3Price;
    System.out.println("Added " + this.addition3Name
            + " for an extra " + this.addition3Price);
  }
  public void addHamburgerAddition4(String addition4Name,double addition4Price ) {
    this.addition4Name = addition4Name;
    this.addition4Price = addition4Price;
    price+=addition4Price;
    System.out.println("Added " + this.addition4Name
            + " for an extra " + this.addition4Price);
  }
  public double itemizeHamburger() {
    String instanceType = this.getClass().getSimpleName();
   if (instanceType.equals("DeluxeBurger")){
     return price=19.1;
   } else return price;

  }

  public Hamburger() {
  }

  public Hamburger(String meat, double price) {
    this.meat = meat;
    this.price = price;
  }

  public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
}
class HealthyBurger extends Hamburger {
  private String healthyExtra1Name;
  private double healthyExtra1Price;
  private String healthyExtra2Name;
  private double healthyExtra2Price;
//  private String meat;
//  private double price;


  public HealthyBurger( String meat, double price ) {
    super(meat, price);
  }

  @Override
  public double itemizeHamburger() {
    double burgerPrice= super.itemizeHamburger();
    if (this.healthyExtra1Name!=null) {
      burgerPrice+=this.healthyExtra1Price;
     }
    if (this.healthyExtra2Name!=null) {
      burgerPrice += this.healthyExtra2Price;
      System.out.println("Added " + this.healthyExtra2Name
              + " for an extra " + this.healthyExtra2Price);}

    return burgerPrice;
  }

  public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
    this.healthyExtra1Name=healthyExtra1Name;
    this.healthyExtra1Price = healthyExtra1Price;

    System.out.println("Added " + this.healthyExtra1Name
            + " for an extra " + this.healthyExtra1Price);
  }
  public void addHealthyAddition2(String healthyExtra2Name,double healthyExtra2Price){
    this.healthyExtra2Name=healthyExtra2Name;
    this.healthyExtra2Price = healthyExtra2Price;

    System.out.println("Added " + this.healthyExtra2Name
            + " for an extra " + this.healthyExtra2Price);
  }
}
  class DeluxeBurger extends Hamburger {
//    private double price;

    public DeluxeBurger() {
      super("Deluxeburger", "Bacon", 19.1, "Brown");
//      addHamburgerAddition1("Cheese", 2);
//      addHamburgerAddition2("Lettuce", 2);
    }


//    public void setPrice(double price) {
////      this.price = 19.1;
//    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
      System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
      System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
      System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
      System.out.println("Cannot add additional items to a deluxe burger");
    }
  }