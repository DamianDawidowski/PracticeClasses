//public class MealOrder {
//    private Burger burger;
//    private Drink drink;
//    private SideItem sideitem;
//    public MealOrder(Burger burger, Drink drink, SideItem sideitem) {
//        this.drink = drink;
//        this.burger = burger;
//        totalPrice = burger.getFinalBurgerPrice() + drink.getDrinkPrice()+sideitem.getSideItemPrice();
//        String instanceType = burger.getClass().getSimpleName();
//
//        if (instanceType == "DeluxeBurger") {
//            totalPrice = 20;
//        }
//    }
//    public Burger getBurger() {
//        return burger;
//    }
//
//    public void setBurger(Burger burger) {
//        this.burger = burger;
//    }
//
//    double totalPrice;
//    public void tellPrice() {
//      System.out.printf("The total price of your order is "+ totalPrice );
//    }
//}
// class SideItem {
//    private String type;
//    private double SideItemPrice;
//     public double getSideItemPrice() {
//         return SideItemPrice=2.0;
//         };
//     }
//
//
//
//
//class Drink {
//protected String size;
//
//   public double getDrinkPrice() {
//        return switch (size.toUpperCase().charAt(0)) {
//            case 'S' -> 2.0;
//            case 'M' -> 3.0;
//            case 'L' -> 4.0;
//            default -> 2.0;
//        };
//    }
//
//
//    public Drink() {
//    }
//
//    public Drink(String size) {
//        this.size = size;
//    }
//}
//class DeluxeBurger extends Burger{
//    public DeluxeBurger() {
//        this.burgerPrice=12.0 ;
//    }
//
//    @Override
//    public int addExtraCheese(int numberOfExtraCheeseSlices) {
//        if ((numberOfExtraCheeseSlices + extraBacon + extraPatty) > 5) {
//            System.out.println("Can't hold more then five toppings!");
//            return extraCheese;
//        }
//        extraCheese +=numberOfExtraCheeseSlices;
//        return extraCheese ;
//    }
//    @Override
//    public int addExtraBacon(int numberOfExtraBaconSlices) {
//        if ((extraCheese + numberOfExtraBaconSlices + extraPatty) > 5) {
//            System.out.println("Can't hold more then five toppings!");
//            return extraBacon;
//        }
//        extraBacon +=numberOfExtraBaconSlices;
//        return extraBacon ;
//    }
//
//    @Override
//    public int addExtraPatty(int numberOfExtraPatties) {
//        if ((extraCheese + extraBacon + numberOfExtraPatties) > 5) {
//            System.out.println("Can't hold more then five toppings!");
//            return extraPatty;
//        }
//        extraPatty +=numberOfExtraPatties;
//        return extraPatty ;
//    }
//}
//
//class Burger {
//    private String type;
//    protected double burgerPrice;
//    protected int extraCheese=0;
//    protected int extraBacon=0;
//    protected int extraPatty=0;
//
//        public double finalBurgerPrice;
//
////        public double getBurgerPrice() {
////            return finalBurgerPrice= burgerPrice+(1.0*extraCheese)+(1.5*extraBacon)+(2.0*extraPatty);
////        }
//
////+(1.0*extraCheese)+(1.5*extraBacon)+(2.0*extraPatty)
//    public double getFinalBurgerPrice() {
//        return  finalBurgerPrice=burgerPrice+(1.0*extraCheese)+(1.5*extraBacon)+(2.0*extraPatty);
//    }
//
//    public double getBurgerPrice() {
//        return burgerPrice;
//    }
//
//    public void setBurgerPrice(double burgerPrice) {
//        this.burgerPrice = burgerPrice;
//    }
//
//    public Burger() {
//        this.burgerPrice=2.0 ;
//    }
//
//    public Burger(String type, double burgerPrice) {
//        this.type = type;
//        this.burgerPrice=burgerPrice ;
//    }
//
//    public int addExtraCheese(int numberOfExtraCheeseSlices) {
//        if ((numberOfExtraCheeseSlices+extraBacon+extraPatty)>3) {
//            System.out.println("Can't hold more then three toppings!");
//            return extraCheese;
//        }
//        extraCheese +=numberOfExtraCheeseSlices;
//        return extraCheese ;
//    }
//    public int addExtraBacon(int numberOfExtraBaconSlices) {
//        if ((extraCheese+numberOfExtraBaconSlices+extraPatty)>3) {
//            System.out.println("Can't hold more then three toppings!");
//            return extraBacon;
//        }
//        extraBacon +=numberOfExtraBaconSlices;
//        return extraBacon ;
//    }
//    public int addExtraPatty(int numberOfExtraPatties) {
//        if ((extraCheese+extraBacon+numberOfExtraPatties)>3) {
//            System.out.println("Can't hold more then three toppings!");
//            return extraPatty;
//        }
//        extraPatty +=numberOfExtraPatties;
//        return extraPatty ;
//    }
//
//
//
//
//
//}
//
//
