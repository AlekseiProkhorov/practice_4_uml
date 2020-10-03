import static java.lang.Math.pow;

public class Circle extends Shape {
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle: \ncolor = " + color + "\nfilled = " +
                filled + "\nradius = " + radius + "\narea = " +
                getArea() + "\nperimeter = " + getPerimeter();
    }
}
