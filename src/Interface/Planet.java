package Interface;

public class Planet {
    String name;
   int  radius;
   int sunDistance;

    public Planet(String name, int radius, int sunDistance) {
        this.name = name;
        this.radius = radius;
        this.sunDistance = sunDistance;
    }

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    public int getSunDistance() {
        return sunDistance;
    }

    static class RandomY {

        int y;

        public RandomY(int y) {
            this.y = y;
        }
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", sunDistance=" + sunDistance +
                '}';
    }
}
