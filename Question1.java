// Assignment 8
// Exercise 1
// 11 October 2022

import java.util.Scanner;
import java.util.ArrayList;

public class Question1 {
    public static void main (String [] args) {

        ArrayList<Computer> list = new ArrayList<Computer>();
        Scanner s = new Scanner(System.in);
        char option = ' ';

        String serialNum = "";
        String manufacturer = "";
        String colour = "";
        int memory = 0;
        int size = 0;
            
        System.out.println("Welcome to Great International Technology");
        System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
        option = Character.toUpperCase(s.nextLine().charAt(0));

        while (option != 'Q') {
            switch (option) {
                case 'B':
                    {
                        System.out.println("Enter the serial number");
                        serialNum = s.nextLine();

                        System.out.println("Enter the manufacturer");
                        manufacturer = s.nextLine();

                        System.out.println("Enter the colour");
                        colour = s.nextLine();

                        System.out.println("Enter the amount of memory (MB)");
                        memory = s.nextInt();
                        s.nextLine();

                        list.add(new Box(serialNum, manufacturer, colour, memory));

                        System.out.println("Done");
                    }
                    break;
                case 'S':
                    {
                        System.out.println("Enter the serial number");
                        serialNum = s.nextLine();
                        
                        System.out.println("Enter the manufacturer");
                        manufacturer = s.nextLine();
                        
                        System.out.println("Enter the colour");
                        colour = s.nextLine();
                        
                        System.out.println("Enter the screen size in inches");
                        size = s.nextInt();
                        s.nextLine();

                        list.add(new Screen(serialNum, manufacturer, colour, size));
                        
                        System.out.println("Done");
                    }
                    break;
                case 'A':
                    {
                        System.out.println("Enter the serial number");
                        serialNum = s.nextLine();
                        
                        System.out.println("Enter the manufacturer");
                        manufacturer = s.nextLine();
                        
                        System.out.println("Enter the colour");
                        colour = s.nextLine();

                        list.add(new Accessory(serialNum, manufacturer, colour));
                        
                        System.out.println("Done");
                    }
                    break;
                case 'L':
                    {
                        if (list.isEmpty() == false) {
                            for (int k = 0; k < list.size(); k++) {
                                System.out.println(list.get(k));
                            }
                        }
                        System.out.println("Done");  
                    }
                    break;
                case 'D':
                    {
                        System.out.println("Enter the serial number");
                        String remove = s.nextLine();
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i).getSerialNum().equals(remove)) {
                                list.remove(i);
                                System.out.println("Done");
                                break;
                            }
                            else if (i == list.size() - 1) {
                                System.out.println("Not found");
                            }
                        }
                    }
                    break;
                default:
                    {
                        System.out.println("Not found");
                    }
                    break;
            }
            System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
            option = Character.toUpperCase(s.nextLine().charAt(0));
        }
        s.close();
    }
    
}
