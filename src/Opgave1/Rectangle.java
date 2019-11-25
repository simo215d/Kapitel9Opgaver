package Opgave1;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width=width;
        this.height=height;
    }

    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
        return (width*2)+(height*2);
    }
}
