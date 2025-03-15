// Assignment 7
// 26 September 2022

import java.util.Scanner;

public class Question2 {
    static int yearOfStudy;
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the vehicle manufacturer:");
        String manufacturer = kb.nextLine();
        System.out.println("Enter the name of the vehicle owner:");
        String person = kb.nextLine();
        System.out.println("Enter the owner's gender:");
        String gender = kb.nextLine();
        System.out.println("Enter the owner's programme of study:");
        String programOfStudy = kb.nextLine();
        System.out.println("Enter the owner's Institution name:");
        String nameOfInstitution = kb.nextLine();
        System.out.println("Enter the owner's hobbies:");
        String hobbies = kb.nextLine();
        System.out.println("Enter the owner's age:");
        int age = kb.nextInt();
        System.out.println("Enter the number of cylinders in the engine:");
        int cylinders = kb.nextInt();
        System.out.println("Enter the car seating capacity:");
        int capacity = kb.nextInt();
        System.out.println("Enter the weight of the car:");
        double weight = kb.nextDouble();

        Student owner = new Student(person, age, gender, nameOfInstitution, programOfStudy, yearOfStudy, hobbies);
        Car car = new Car(cylinders, manufacturer, owner, capacity, weight);
        System.out.println(car);
        
        kb.close();
    }
}
