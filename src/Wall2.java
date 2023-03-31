public class Wall2 {
    private double width;
    private double     height;

    public double getArea() {
        double area = width * height;
        return area;
    }

    public Wall2(double width, double height) {
        if (width<0){
width=0;
        } else {
            this.width = width;
        }
        if (height<0){
            height=0;
        } else {
            this.height = height;
        }
   }

    public Wall2() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width)  {
    if (width<0){
width=0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height)  {
        if (height<0){
            height=0;
        } else {
            this.height = height;
        }
    }

}
