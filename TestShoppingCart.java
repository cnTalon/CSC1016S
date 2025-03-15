// Assignment 2
// Exercise 1
// 10 August 2022

import java.util.Scanner;

public class TestShoppingCart {
    public static void main(String[] args)
    {
        int quantity = 0, i;
        double unitPrice = 0;
        String productName = "";
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many items would you like to add to your Shopping Cart?:");
        int kb = keyboard.nextInt();

        if (kb == 0)
        {
            System.out.println("Your Shopping Cart is empty.");
        }
        else
        {
            ShoppingCart cart = new ShoppingCart();
            for (i = 0; i < kb; i++)
            {
                System.out.println("Enter the Product Name:");
                productName = keyboard.next();
                System.out.println("Enter the Quantity:");
                quantity = keyboard.nextInt();
                System.out.println("Enter the Unit Cost:");
                unitPrice = keyboard.nextDouble();

                Item item = new Item(productName, quantity, unitPrice);

                cart.addItems(item);
            }
                cart.getTotalAmount();
                cart.getDiscount("WELCOME20");
                cart.getPayableAmount();

                System.out.println("The Shopping Cart has the following items:");
                cart.queryCart();

                System.out.println("--- Shopping Cart with all items ---");
                cart.printInvoice();
        }
        keyboard.close();
    }
}
