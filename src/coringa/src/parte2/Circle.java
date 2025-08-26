package parte2;

public class Circle implements Shape{
    private double raio;

    public Circle() {
    }

    public Circle(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "raio=" + raio +
                '}';
    }
}
