// Assignment 8
// Exercise 1
// 11 October 2022

public class Accessory extends Computer{
    protected String serialNum;
    protected String manufacturer;
    protected String colour;
    
    public Accessory (final String serialNum, final String manufacturer, final String colour) {
        super(serialNum, manufacturer, colour);
        this.serialNum = serialNum;
        this.manufacturer = manufacturer;
        this.colour = colour;
    }


    @Override
    public String toString() {
        return String.format("Accessories: %s, %s, %s", getSerialNum(), getManufacturer(), getColour());
    }

}