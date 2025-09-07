interface Shape{
    double area();
}

abstract class AbstractShape implements Shape{
    private String color;

    public AbstractShape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Rectangle extends AbstractShape{

    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractShape s1 = new Rectangle("Black", 2.0, 3.0);

        System.out.printf("Color = %s, Area = %.2f", s1.getColor(), s1.area());
    }
}