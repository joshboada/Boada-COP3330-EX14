/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;

public class APP {
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double orderamount = input.nextDouble();

        System.out.print("What is the state? ");
        String state = input.next();

        double taxes = 0;

        if(state.equalsIgnoreCase("WI")) {
            System.out.printf("The subtotal is $%.2f\n", orderamount);
            taxes = (orderamount * 5.5) / 100;
            System.out.printf("The tax is $%.2f\n", taxes);
        }

        double total = orderamount + taxes;
        System.out.printf("The total is $%.2f\n", total);
        input.close();

    }
}
