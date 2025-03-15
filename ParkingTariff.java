// Assignment 4
// Exercise 2
// 22 August 2022

public class ParkingTariff {
    TimePeriod period;
    Money cost;
    Duration start;
    Duration end;
    
    // contains the tariff
    public ParkingTariff (TimePeriod period, Money cost) {
        this.period = period;
        this.cost = cost;
    }

    // gives the boundary of the period
    public TimePeriod period() {
        TimePeriod period = new TimePeriod(start, end);
        return period;
    }

    // cost of the period
    public Money money() {
        return cost;

    }

    // obtain string version of tariff
    public String toString() {
        String tariffStr = new String(this.period.toString() + " : " + this.cost.toString());
        return tariffStr;
    }
}
