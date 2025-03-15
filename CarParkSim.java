// Assignment 3
// Exercise 4
// 18 August 2022

import java.util.Scanner;
/**
 * The CarParkSim class contains the main car park simulation method.
 * It creates and manipulates the main objects, and handles user I/O.
 *
 * @author Stephan Jamieson and ...
 * @version 14/7/2019
 */
public class CarParkSim {
        
    public static void main(final String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        // YOUR CODE HERE.
        // Declare variables to store a Clock and a Register object, create the relevant objects and assign them. 
        Clock clock = new Clock(new Time("00:00:00"));
        Register register = new Register();
        
        System.out.println("Car Park Simulator");
        // YOUR CODE HERE.
        // Print current time.

        System.out.println("The current time is " + clock.examine().toString() + ".");

        System.out.println("Commands: advance {minutes}, arrive, depart, quit.");
        System.out.print(">");
        String input = keyboard.next().toLowerCase();
        while (!input.equals("quit")) {
            if (input.equals("advance")) {
                // YOUR CODE HERE.
                // Advance the clock, print the current time.
                int advanceTime = keyboard.nextInt();
                clock.advance(new Duration("minute", advanceTime));
                System.out.println("The current time is " + clock.examine().toString() + ".");
            }
            else if (input.equals("arrive")) {
                // YOUR CODE HERE.
                // Create a new ticket, add it to the register, print details of ticket issued.
                Ticket t = new Ticket(clock.examine(), UIDGenerator.makeUID());
                register.add(t);
                System.out.println("Ticket issued: " + register.retrieve(t.ID()).toString() + ".");
            }
            else if (input.equals("depart")) {
                // YOUR CODE HERE.
                // Determine if ticket is valid, i.e. in the register.
                // If not, print error message.
                // If yes, retreive it, calculate duration of stay and print it.

                String ID = keyboard.next();
                if (register.contains(ID)) {
                    Ticket depTicket = register.retrieve(ID);
                    System.out.println("Ticket details: "+ depTicket.toString() + ".");
                    System.out.println("Current time: " + clock.examine().toString() + ".");
                    Duration d = depTicket.age(clock.examine());
                    System.out.println("Duration of stay: " + Duration.format(d, "minute") + ".");
                }
                else {
                    System.out.println("Invalid ticket ID.");
                }
            }
            else {
                System.out.println("That command is not recognised.");
                System.out.println("Commands: advance <minutes>, arrive, depart, quit.");
            }            
            System.out.print(">");
            input = keyboard.next().toLowerCase();
        }            
        System.out.println("Goodbye.");
    }

}
