public class lesson78 {

    public static void main(String[] args) {

        Car1 car1 = new Car1();
        car1.setMake("Porsche");
        car1.setModel("Carrera");
        car1.setConvertible(true);
        car1.setDoors(2);
               car1.setColor("black");



        System.out.println("make = " + car1.getMake());
        System.out.println("model = " + car1.getModel());
        car1.describeCar();

        Car1 targa = new Car1();

        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setConvertible(false);
        targa.setDoors(2);
        targa.setColor("red");
        targa.describeCar();


    }
}
