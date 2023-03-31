public class Point {

    private int x;
    private int y;

    public double distance() {
//        double distance = Math.sqrt((0 - getX()) * (0 - getX()) + (0 - getY()) * (0 - getY()));
//        return distance;
        return distance(0,0);
    }

//    public double distance(Point xy) {
//        double distance = Math.sqrt(((xy.getX()) - getX()) * ((xy.getX()) - getX()) + ((xy.getY()) - getY()) * ((xy.getY()) - getY()));
//        return distance;
//    }
//    public double distance(Point point) {
//    return distance(point.getX(), point.getY());

    public double distance(Point xy) {
    return distance(xy.x, xy.y);
    }


    public double distance(int x, int y) {
        double distance = Math.sqrt((x - getX()) * (x - getX()) + (x - getY()) * (x - getY()));
        return distance;
    }


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


