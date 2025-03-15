// Assignment 3
// Exercise 3
// 16 August 2022

public class Register {
    Ticket[] tickets = new Ticket[100];
    int numTickets = 0;

    // create a register
    public Register() {
    }

    // add ticket to array
    public void add(Ticket ticket) {
        tickets[numTickets] = ticket;
        numTickets++;
    }

    // checks if id is in array
    public boolean contains(String ticketID) {
        int i=0;
        boolean state = false;
        for (i = 0; i < numTickets; i++) {
            if (tickets[i].ID().equals(ticketID)) {
                state = true;
            } 
        }
        return state;
    }

    // get ticket with given id
    public Ticket retrieve(String ticketID) {
        int i=0;
        for (i = 0; i < numTickets; i++) {
            if (tickets[i].ID().equals(ticketID)){
                return tickets[i];
            }
        }
        return null;
    }
}