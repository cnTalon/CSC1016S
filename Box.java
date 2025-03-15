// Assignment 8
// Exercise 1
// 11 October 2022

public class Box extends Computer{
    protected int memory;
    
    public Box (final String serialNum, final String manufacturer, final String colour, final int memory) {
        super(serialNum, manufacturer, colour);
        this.memory = memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return String.format("Box: %s, %s, %s, %d", getSerialNum(), getManufacturer(), getColour(), getMemory());
    }
}