// Assignment 7
// 26 September 2022

public class Car extends Vehicle {
    protected double weight;
    protected int capacity;

    public Car(Car c) {
        this(c.cylinders, c.manufacturer, c.owner, c.capacity, c.weight);
    }

    public Car(int cylinders, String manufacturer, Student owner, int capacity, double weight) {
        super(cylinders, manufacturer, owner);
        this.cylinders = cylinders;
        this.manufacturer = manufacturer;
        this.owner = owner;
        this.capacity = capacity;
        this.weight = weight;
    }

    @Override
    public String toString() {
        String format = String.format("%s, %d cylinders, owned by %s, a %d-year old %s studying %s at %s. %s likes %s.\nThe car is a %d-seater weighing %.1f kg", manufacturer, cylinders, getName(), getAge(), getGender(), getProgramOfStudy(), getNameOfInstitution(), getName(), getHobbies(), capacity, weight);
        return format;
    }
}
