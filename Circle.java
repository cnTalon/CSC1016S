// Assignment 7
// 26 September 2022

public class Circle extends Shape{
    private double radius;

    public Circle(Circle c) {
        this(c.name, c.colour, c.radius);
    }
    public Circle(String name, String colour, double radius) {
        super(name, colour);
        this.radius = radius;
    }

    @Override
    public String toString() {
        String format = String.format("%s %s %s %.1f", name, colour, "Radius", radius);
        return format;
    }
}