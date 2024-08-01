package chapter9;
// Inheritance | Herança

public class InheritanceTester {

    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        // Exemple
        person.getName();
        employee.getName();
        employee.getEmployeeId();

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square");

        Mother mother = new Mother();
        mother.setName("Cida");
        System.out.println(mother.getName() + "is a" + mother.getGender());
    }

    public static void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(5);
        square.setWidth(10);
        System.out.println(square.calculatePerimeter());
    }
}
