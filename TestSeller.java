// Assignment 2
// Exercise 2
// 10 August 2022

import java.util.Scanner;

public class TestSeller {
    public static void main(String[] args){
        String ID = "";
        String name = "";
        String location = "";
        String product = "";
        //Money unit_price = ;
        int number_of_units = 0;

        Currency rand = new Currency("R", "ZAR", 100);
        Money unit_price = new Money("R0", rand);
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter the details of the seller.");
        System.out.print("ID: ");
        ID = kb.nextLine();
        // id

        System.out.print("Name: ");
        name = kb.nextLine();
        // name

        System.out.print("Location: ");
        location = kb.nextLine();

        System.out.print("Product: ");
        product = kb.nextLine();

        System.out.print("Price: ");
        String keyboard = kb.nextLine();
        unit_price = new Money(keyboard, rand);

        System.out.print("Units: ");
        number_of_units = kb.nextInt();

        Seller seller = new Seller(ID, name, location, product, unit_price, number_of_units);

        seller.compiled();

        kb.close();
    }
    
}
