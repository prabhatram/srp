package com.example.solid.principles;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class Addition 
{
    public int userInputs(int num1, int num2) {
        int addition = num1 * num2;
        return addition;
    }
    
    public static void main( String[] args )
    {
        Addition add = new Addition();

        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter your first number:");
        int number1 = reader.nextInt();

        System.out.println("Enter your second number:");
        int number2 = reader.nextInt();

        int total = add.userInputs(number1, number2);

        System.out.println("Addition of your two numbers is:" + total);
        
        reader.close();
    }
}
