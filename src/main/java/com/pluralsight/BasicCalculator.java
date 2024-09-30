package com.pluralsight;
import java.util.*;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number: ");
        float Num1 = scanner.nextFloat();
        System.out.println("Second Number: ");
        float Num2 = scanner.nextFloat();

        System.out.println("What would you like to do? ");
        System.out.print("Enter 'Add = A' or 'Subtract = S' or 'Divide = D' or 'Multiply = M': ");
        String action = scanner.nextLine();

        String enteredAnswer = scanner.nextLine();
        if (enteredAnswer.equals("A"))
        {
            float total = Num1 + Num2;
            System.out.println(total);
        }
        else if (enteredAnswer.equals("S"))
        {
            float total = Num1 - Num2;
            System.out.println(total);
        }
        else if (enteredAnswer.equals("D"))
        {
            float total = Num1 / Num2;
            System.out.println(total);
        }
        else if (enteredAnswer.equals("M"))
        {
            float total = Num1 * Num2;
            System.out.println(total);
        }


    }
}
