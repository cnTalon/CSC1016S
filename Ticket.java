// Assignment 3
// Exercise 2
// 16 August 2022 

public class Ticket {
    String id;
    Time issueTime;
    
    // create Ticket
    public Ticket(Time currentTime, String ID) {
        this.id = ID;
        this.issueTime = currentTime;
    }

    // get ID
    public String ID() {
        return this.id;
    }

    // get time difference
    public Duration age(Time currentTime) {
        Duration d = new Duration(currentTime.subtract(issueTime));
        return d;
    }

    // convert to String
    public String toString() {
        issueTime.toString();
       return "Ticket[id=" + id + ", time=" + issueTime + "]";
    }
}
