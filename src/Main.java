public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("black", true, 15);
        Rectangle rectangle = new Rectangle("white", false, 10, 15);
        Square square = new Square("green", true, 10);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
    }
}
