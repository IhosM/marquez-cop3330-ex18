/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Ihosvany Marquez
 */


package Exercise18;
import java.util.Scanner;

public class Solution18
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        String choice = scan.next();

        int temperature = 0, conversion = 0;

        if(choice.contains("C") || choice.contains("c"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temperature = scan.nextInt();
            conversion = (temperature - 32) * 5 / 9;
            System.out.print("The temperature in Celsius is " + conversion + ".");
        }
        else if(choice.contains("F") || choice.contains("f"))
        {
            System.out.print("Please enter the temperature in Celsius: ");
            temperature = scan.nextInt();
            conversion = (temperature * 9 / 5) + 32;
            System.out.print("The temperature in Fahrenheit is "+ conversion + ".");
        }
        else
        {
            System.out.println("An invalid input was entered, please try again.");
        }


    }

}

