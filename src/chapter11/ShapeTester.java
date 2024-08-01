package chapter11;

public class ShapeTester {
    public static void main(String[] args) {

        // Abstract class cannot be instantiated, needs to be a subclass
        // Shape rectangle = new Shape();
        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
