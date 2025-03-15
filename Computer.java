// Assignment 8
// Exercise 1
// 16 October 2022

public class Computer {

    protected String serialNum;
    protected String manufacturer;
    protected String colour;

    public Computer(final String serialNum, final String manufacturer, final String colour) {
        this.serialNum = serialNum;
        this.manufacturer = manufacturer;
        this.colour = colour;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public String toString() {
        return String.format("Computer: %s, %s, %s", getSerialNum(), getManufacturer(), getColour());
    }
}

