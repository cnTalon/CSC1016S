// Assignment 1
// Exercise 2
// 3 August 2022

import java.util.Scanner;

// somewhere conversion is off

public class CalculateDuration {
    public CalculateDuration()
    {
        
    }
    public static void main(String[] args)
    {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter time A:");
        String tA = keyboard.next();            // get input from user
        Time timeA = new Time(tA);              // set time to time ints
        
        System.out.println("Enter time B:");
        String tB = keyboard.next();
        Time timeB = new Time(tB);

        Duration between = timeB.subtract(timeA);   // get difference in 2 times
        long bet = between.intValue("minutes");  // convert difference to minutes

        String timeAS = timeA.toString();   // convert time ints into string
        String timeBS = timeB.toString();   // convert time ints into string

        System.out.println("The time " + timeBS + " occurs " + bet + " minutes after the time " + timeAS + ".");

        keyboard.close();
        
    }
}
