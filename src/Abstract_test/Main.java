package Abstract_test;

public class Main {
    public static void main(String[] args) {
Mappable building = new Building("Supermarket");
//System.out.println(building.returnGeometryType());
        System.out.println( building.toJSON());

    }
}
