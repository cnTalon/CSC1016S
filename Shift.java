// Assignment 5
// Exercise 1
// 3 September 2022

public class Shift {
    CalendarTime start;
    CalendarTime finish;

    // create shift object
    public Shift(CalendarTime start, CalendarTime finish) {
        this.start = start;
        this.finish = finish;
    }

    // obtain start date & time
    public CalendarTime start() {
        return start;
    }

    // obtain finish date & time
    public CalendarTime finish() {
        return finish;
    }

    // determine if shift occured in week
    public boolean inWeek(Week w) {
        return w.includes(start.date()) || w.includes(finish.date());
    }

    // determine if shift occurred partly in week
    public boolean includesDate(Date date) {
        return date.compareTo(start.date()) >=0 && date.compareTo(finish.date()) <=0;
    }

    // obtain shift length
    public Duration length() {
        return finish.subtract(start);
    }

    // string rep in format
    public String toString() {
        return start() + " - " + finish();
    }
}
