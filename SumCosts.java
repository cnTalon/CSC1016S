// Assignment 1
// Exercise 3
// 3 August 2022

import java.util.Scanner;

public class SumCosts {
    public static void main(String[] args)
    {

        Currency rand = new Currency("R", "ZAR", 100);
        Scanner keyboard = new Scanner(System.in);
        Money money = new Money("R0", rand);
        Money Sum = new Money("R0", rand);
        

        System.out.println("Enter an amount or '[D]one' to quit:");
        String kb = keyboard.nextLine();

        if (kb.charAt(0) != 'D') 
        {
            money = new Money(kb, rand);
            Sum = Sum.add(money);
        }
        
        while (kb.charAt(0) != 'D') 
        {
            System.out.println("Enter an amount or '[D]one' to print the sum and quit:");
            kb = keyboard.nextLine();
            if (kb.charAt(0) != 'D')
            {
                money = new Money(kb, rand);
                Sum = Sum.add(money);
            }
 
        }
        System.out.println("Total: " + Sum.toString());
        
        keyboard.close();
    }
    
}
