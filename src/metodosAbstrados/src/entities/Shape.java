package entities;

import entities.enums.Color;
//só a metodo abstrato em class abstrata
public abstract class Shape {
    private Color color;

    public abstract double area();

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
