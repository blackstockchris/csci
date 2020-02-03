package tempconv;
/**
 * ***********************
 * @author Chris Blackstock
 * @date: 2/2/20 Assignment: tempconv.java
 *
 * Write a program that displays a menu, the user enters whether
 * they want to covert from Fahrenheit to Celsius or Celsius to Fahrenheit.
 * Based on what they enter, they will need to enter a value(degree) they want
 * converted. The program should output the value they entered and the converted
 * number. The menu should keep appearing until the user chooses to exit.
 * 
 * Testing data (taken from output):
 * run:
Temperature Conversion Program
Enter the type of conversion
	1. Celsius to Fahrenheit
	2. Fahrenheit to Celsius
	3. Exit
1
Enter the degrees in Celsius you would like to convert to Fahrenheit
15.6
15.6 degrees Celsius is 60.08 degrees Fahrenheit
Enter the type of conversion
	1. Celsius to Fahrenheit
	2. Fahrenheit to Celsius
	3. Exit
2
Enter the degrees in Fahrenheit you would like to convert to Celsius
54.7
54.7 degrees Fahrenheit is 12.611111 degrees Celsius
Enter the type of conversion
	1. Celsius to Fahrenheit
	2. Fahrenheit to Celsius
	3. Exit
457
Invalid choice
Enter the type of conversion
	1. Celsius to Fahrenheit
	2. Fahrenheit to Celsius
	3. Exit
3
Enjoy the weather!
 * 
 *
 * **********************
 */
import java.util.Scanner;

public class Tempconv {
    
    public static void main(String[] args) {

        //DECLARATIONS
        Scanner keyboard = new Scanner(System.in);
        int choice;
        String menu = "Enter the type of conversion\n\t1. Celsius to Fahrenheit\n\t2. Fahrenheit to Celsius\n\t3. Exit";
        float f;
        float c;

        //STARTING THE LOOP AND PROMPTING FOR USER INPUT    
        System.out.println("Temperature Conversion Program");
        System.out.println(menu);
        choice = keyboard.nextInt();

        //WHILE STATEMENT EXCLUDING EXIT CHOICE
        while (choice != 3) {
            
            //IF STATEMENT CONVERTING C TO F
            if (choice == 1) {
                
                System.out.println("Enter the degrees in Celsius you would like to convert to Fahrenheit");
                c = keyboard.nextFloat();
                f = ((c * 9) / 5) + 32;                                                             //C TO F FORMULA
                System.out.println(+ c + " degrees Celsius is " + f + " degrees Fahrenheit");
                System.out.println(menu);                                                           //LOOPING MENU AGAIN FOR NEXT INPUT
                choice = keyboard.nextInt();
            }
            //ELSE IF STATEMENT CONVERTING F TO C
             else if (choice == 2) {

                System.out.println("Enter the degrees in Fahrenheit you would like to convert to Celsius");
                f = keyboard.nextFloat();
                c = ((f - 32) * 5) / 9;                                                             //F TO C FORMULA
                System.out.println(+ f + " degrees Fahrenheit is " + c + " degrees Celsius");
                System.out.println(menu);                                                           //LOOPING MENU AGAIN FOR NEXT INPUT
                choice = keyboard.nextInt();
            }
            //ELSE STATEMENT FOR INVALID INPUTS AND ASKING FOR RE-INPUT
            else {
                 
                System.out.println("Invalid choice");
                System.out.println(menu);
                choice = keyboard.nextInt();
            }
        }
        //IF STATEMENT IF USER CHOOSES TO EXIT
        if (choice == 3) {
            System.out.println("Enjoy the weather!");
        }
    }
}
