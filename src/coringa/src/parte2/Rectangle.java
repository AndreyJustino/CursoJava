package parte2;

public class Rectangle implements Shape{
    private double heigth;
    private double wigth;

    public Rectangle() {
    }

    public Rectangle(double heigth, double wigth) {
        this.heigth = heigth;
        this.wigth = wigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getWigth() {
        return wigth;
    }

    public void setWigth(double wigth) {
        this.wigth = wigth;
    }

    @Override
    public double area() {
        return heigth * wigth;
    }
}
