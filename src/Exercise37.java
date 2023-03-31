public class Exercise37 {
    public static void main(String[] args) {

    }
    public class Cuboid extends Rectangle {
        private double height;


        public double getVolume() {
            return getArea()*height;
        }




        public double getHeight() {
            return height;
        }

        public Cuboid(double width, double length, double height) {
            super(width, length);
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }
    }
    public class Rectangle {
        private double width;
        private double length;

        public Rectangle(double width, double length) {

            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
                 if (length < 0) {
                this.length = 0;
            } else {
                this.length = length;
            }

        }
        public double getArea() {
           return length*width;
       }

        public double getWidth() {
            return width;
        }

        public double getLength() {
            return length;
        }
    }







}
