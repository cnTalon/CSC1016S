// Assignment 7
// 26 September 2022

public class Shape {
    protected String colour;
    protected String name;

    public Shape(Shape s) {
        this(s.name, s.colour);
    }
    public Shape(String name, String colour) {
        this.colour = colour;
        this.name = name;
    }

    public String toString() {
        String format = String.format("%s %s", name, colour);
        return format;
    }
}
