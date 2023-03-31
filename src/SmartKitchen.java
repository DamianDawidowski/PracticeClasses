public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator fridge;

public SmartKitchen() {
     fridge = new Refrigerator();
    dishWasher = new DishWasher();
    coffeeMaker = new CoffeeMaker();
}

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

public void setKitchenState (boolean coffeeMakerState,boolean fridgeState  ,boolean dishWasherState) {
    dishWasher.setHasWorkToDo(dishWasherState);
    coffeeMaker.setHasWorkToDo(coffeeMakerState);
    fridge.setHasWorkToDo(fridgeState);
}


    public void doKitchenWork() {
        coffeeMaker.addWater();
        fridge.pourMilk();
        dishWasher.loadsDishwasher();
   }    }

  class  Refrigerator {
    private boolean hasWorkToDo;

      public void setHasWorkToDo(boolean hasWorkToDo) {
          this.hasWorkToDo = hasWorkToDo;
      }

      public void orderFood() {
        if ( hasWorkToDo) {
            System.out.println("Refrigerator orders food");
            hasWorkToDo = false;
        }
    }
    public void pourMilk ( ) {
        if (hasWorkToDo) {
            System.out.println("Refrigerator pours milk");
            hasWorkToDo = false;
        }
    }
}
  class DishWasher{
    private boolean hasWorkToDo;

      public void setHasWorkToDo(boolean hasWorkToDo) {
          this.hasWorkToDo = hasWorkToDo;
      }

      public void doDishes() {
          if ( hasWorkToDo) {
              System.out.println("DishWasher does dishes");
              hasWorkToDo = false;
          }
      }
      public void loadsDishwasher ( ) {
          if (hasWorkToDo) {
              System.out.println("Dishwasher was loaded");
              hasWorkToDo = false;
          }
      }}

  class CoffeeMaker {
      private boolean hasWorkToDo;

      public void setHasWorkToDo(boolean hasWorkToDo) {
          this.hasWorkToDo = hasWorkToDo;
      }

      public void brewCoffee() {
          if (hasWorkToDo) {
              System.out.println("CoffeeMaker brews coffee");
              hasWorkToDo = false;
          }
      }

      public void addWater( ) {
          if (hasWorkToDo) {
              System.out.println("CoffeeMaker adds water");
              hasWorkToDo = false;
          }
      }
  }