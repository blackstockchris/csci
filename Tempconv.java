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

        while (choice == 1 || choice == 2)
        {
            if (choice == 1)
            {

                System.out.println("Enter the degrees in Celsius you would like to convert to Fahrenheit");
                C = keyboard.nextDouble();
                F = ((C * 9) / 5) + 32;
                System.out.println(+ C + " degrees Celsius is " + F + " degrees Fahrenheit");
            }
            else if (choice == 2)
            {

                System.out.println("Enter the degrees in Fahrenheit you would like to convert to Celsius");
                F = keyboard.nextDouble();
                C = ((F - 32) * 5) / 9;
                System.out.println(+ F + " degrees Fahrenheit is " + C + " degrees Celsius");
            }
        }
    }
}
