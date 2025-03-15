// Assignment 4
// Exercise 1
// 22 August 2022

public class TimePeriod {
    private Duration lowerbound;
    private Duration upperbound;
    //  TimePeriod with inclusive lower bound & exclusive upper bound
    public TimePeriod (Duration lowerbound, Duration upperbound) {
        this.lowerbound = lowerbound;
        this.upperbound = upperbound;
    }

    // Obtain lowerbound
    public Duration lowerBound() {
        return lowerbound;
    }

    // Obtain upperbound
    public Duration upperBound() {
        return upperbound;
    }

    // whether lowerBound() less than or equal to duration<upperBound()
    public boolean includes(Duration duration) {
        return lowerBound().compareTo(duration)<=0 && duration.compareTo(upperBound())<0;
    }

    //whether this.upperBound() less than or equal to other.lowerBound(
    public boolean precedes(TimePeriod other) {
        return this.upperBound().compareTo(other.lowerBound()) <= 0;
    }

    // whether this.upperBound() is equal to other.lowerBound()/ this.lowerBound() is equal to other.upperBound()
    public boolean adjacent(TimePeriod other) {
        return this.upperBound().compareTo(other.lowerBound()) == 0 || this.lowerBound().compareTo(other.upperBound()) == 0;
    }

    // String representation of this TimePeriod object 
    public String toString() {
        return String.format("[%s .. %s]", Duration.format(lowerBound(), "minute"), Duration.format(upperBound(), "minute"));
    }
}
