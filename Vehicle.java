// Assignment 7
// 26 September 2022

public class Vehicle extends Student{
    protected int cylinders;
    protected String manufacturer;
    protected Student owner;

    public Vehicle(int cylinders, String manufacturer, Student owner) {
        super(owner);
        this.owner = owner;
        this.cylinders = cylinders;
        this.manufacturer = manufacturer;
    }

    public Vehicle(Vehicle v) {
        this(v.cylinders, v.manufacturer, v.owner);
    }

    public String toString() {
        String format = String.format("%s %f %s", manufacturer, cylinders, owner);
        return format;
    }
}
