public class lesson103 {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();



//        kitchen.getFridge().setHasWorkToDo(true);
        kitchen.getFridge().orderFood();
        kitchen.getDishWasher().doDishes();
        kitchen.getCoffeeMaker().brewCoffee();
//        kitchen.setKitchenState(true, false, true);
//        kitchen.doKitchenWork();

    }
}