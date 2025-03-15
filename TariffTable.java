// Assignment 4
// Exercise 3
// 22 August 2022

import java.lang.IllegalArgumentException;

public class TariffTable {
    int maxSize;
    ParkingTariff[] tariffs;
    Currency zar = new Currency("R", "Rands", 100);
    Money cost;
    // Create a TariffTable with the given maximum number of entries
    public TariffTable(int maxSize) {
        this.maxSize = maxSize;
        ParkingTariff[] tariffs = new ParkingTariff[maxSize];
    }

    // Add the tariff for the given period to the table
    public void addTariff (TimePeriod period, Money tariff) {
        int tariffNum = 0;
        if (tariffNum == 0) {
            ParkingTariff firstT = new ParkingTariff(period, tariff);
            tariffs[tariffNum] = firstT;
            tariffNum++;
        }
        else {
            TimePeriod otherPeriod = tariffs[tariffNum - 1].period();
            if (otherPeriod.precedes(period) && period.adjacent(otherPeriod)) {
                ParkingTariff firstT = new ParkingTariff(period, tariff);
                tariffs[tariffNum] = firstT;
                tariffNum++;
            }
            else {
                throw new IllegalArgumentException("Tariff periods must be adjacent.");
            }
        }
    }

    // Obtain the tariff for the given length of stay.
    public Money getTariff (Duration lengthOfStay) {
        Money cost = new Money(0, zar);
        for (int i = 0; i <= maxSize; i++) {
            if (tariffs[i].period().includes(lengthOfStay)) {
                cost = tariffs[i].money();
            }  
        }
        return cost;
    }

    // Obtain a String representation of this TariffTable
    public String toString () {
        for (int i = 0; i < maxSize;i++) {
            return tariffs[i].toString();
        }
        return null;
    }
}
