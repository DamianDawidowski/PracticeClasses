public class Car  {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public static Car startEngine(String type, String description, double avgKmPerLitreOrCharge, int cylinders, int batterySize) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(description,avgKmPerLitreOrCharge,cylinders);
            case 'E' -> new ElectricCar(description, avgKmPerLitreOrCharge,batterySize);
            case 'H' -> new HybridCar(description, avgKmPerLitreOrCharge,batterySize,cylinders);
            default -> new Car(description);
        };

    }
    protected void runEngine( ) {
        String instanceType = this.getClass().getSimpleName();
        System.out.println("The "+instanceType+"'s engine runs just fine");
        };
    public  void drive( ) {
        String instanceType = this.getClass().getSimpleName();
        System.out.println("Just a regular "+instanceType+", driving");

    }
}


class GasPoweredCar extends Car {
    public double avgKmPerLitre;
    int cylinders;

//    public GasPoweredCar(String description) {
//        super(description);
//    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public GasPoweredCar(String description, double avgKmPerLitreOrCharge, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitreOrCharge;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine( ) {
        String instanceType = this.getClass().getSimpleName();
        System.out.println("The "+instanceType+"'s engine runs just fine, with "+cylinders+ " cylinders engine");

    };
    @Override
    public  void drive() {
        super.drive();
        System.out.printf(".. %s%n".repeat(3),
                "Gas",
                "More Gas",
                "Even more Gas");

    }

    }

    class ElectricCar extends Car {
        public double avgKmPerCharge;
        int batterySize;

        public ElectricCar(String description, double avgKmPerLitreOrCharge, int batterySize) {
            super(description);
            this.avgKmPerCharge = avgKmPerLitreOrCharge;
            this.batterySize = batterySize;
        }

        @Override
        public void drive() {
            super.drive();
            System.out.printf(".. %s%n".repeat(3),
                    "Power",
                    "More Power",
                    "Even more Power");
        }

        @Override
        protected void runEngine() {
            String instanceType = this.getClass().getSimpleName();
            System.out.println("The " + instanceType + "'s engine runs just fine, with " + batterySize + " battery engine");


        }
    }
    class HybridCar extends Car {
        public double avgKmPerLitre;
        int batterySize;
        int cylinders;


        public HybridCar(String description, double avgKmPerLitreOrCharge, int batterySize, int cylinders) {
            super(description);
            this.avgKmPerLitre = avgKmPerLitreOrCharge;
            this.batterySize = batterySize;
            this.cylinders = cylinders;
        }

        @Override
        public void drive() {
            super.drive();
            System.out.printf(".. %s%n".repeat(3),
                    "Gas",
                    "Energy",
                    "Even more Gas and Energy");
        }

        @Override
        protected void runEngine() {
            String instanceType = this.getClass().getSimpleName();
            System.out.println("The " + instanceType + "'s engine runs just fine, with " + batterySize + " battery and " + cylinders + " cylinder engine");


        }
    }