// Assignment 8
// Exercise 1
// 11 October 2022

public class Screen extends Computer {
    private int size;

    public Screen (final String serialNum, final String manufacturer, final String colour, final int size) {
        super(serialNum, manufacturer, colour);
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("Screen: %s, %s, %s, %d", getSerialNum(), getColour(), getManufacturer(), getSize());
    }
}