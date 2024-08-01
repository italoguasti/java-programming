package chapter6;
// Classes and Objects

public class Rectangle {
    private double length;
    private double width;

    // default constructor
    public Rectangle(){
        length = 0;
        width = 0;
    }

    // rectangle constructor
    public Rectangle(double length, double width){
        this.length = length; //can be set this way
        setWidth(width); // or can be set this way
    }

    public double getLength() {
        return length;
    }

    // setter
    public void setLength(double length) {
        this.length = length;
    }

    // getter
    public double getWidth() {
        return width;
    }

    // setter
    public void setWidth(double width) {
        this.width = width;
    }

    // getter
    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }
}
