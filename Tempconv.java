package tempconv;

import java.util.Scanner;

public class Tempconv {

    public static void main(String[] args) {
//DECLARATIONS
        Scanner keyboard = new Scanner(System.in);
        int choice;
        String menu = "Temperature Conversion Program\n\t1. Celsius to Fahrenheit\n\t2. Fahrenheit to Celsius\n\t3. Exit\nEnter the type of conversion";
        double F;
        double C;

//STARTING THE LOOP    
        System.out.println(menu);
        choice = keyboard.nextInt();

        if (choice == 1) {

            System.out.println("Enter the degrees in Celsius you would like to convert to Fahrenheit");
            C = keyboard.nextDouble();
            F = ((C * 9) / 5) + 32;
            System.out.println(+C + " degrees Celsius is " + F + " degrees Fahrenheit");
            System.out.println(menu);
            choice = keyboard.nextInt();
        } else if (choice == 2) {

            System.out.println("Enter the degrees in Fahrenheit you would like to convert to Celsius");
            F = keyboard.nextDouble();
            C = ((F - 32) * 5) / 9;
            System.out.println(+F + " degrees Fahrenheit is " + C + " degrees Celsius");
            System.out.println(menu);
            choice = keyboard.nextInt();
        } else if (choice == 3) {

            System.out.println("I hope the weather suits you!");

        } else {
            System.out.println("Invalid choice");
            System.out.println(menu);
            choice = keyboard.nextInt();
        }
    }
}
