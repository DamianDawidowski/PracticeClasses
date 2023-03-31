public class Calculator {
    private Floor floor;
    private Carpet carpet ;

    public double getTotalCost() {
        double totalCost =   floor.getArea()* carpet.getCost();
        return totalCost;
    }



    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
}
