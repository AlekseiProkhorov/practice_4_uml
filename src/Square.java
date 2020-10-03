public class Square extends Rectangle {
    double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.side = side;
        this.width = side;
        this.length = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return super.getArea();
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "Square: \ncolor = " + color + "\nfilled = " + filled +
                "\nside = " + side + "\narea = " +
                getArea() + "\nperimeter = " + getPerimeter();
    }
}
