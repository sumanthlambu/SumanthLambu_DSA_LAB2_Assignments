package com.gl.denominations;

import java.util.Scanner;

public class Main {
	 
    public static void main(String[] args) {
       
        System.out.println("Enter the total number of currency denominations");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] denominations = new int[size];
        System.out.println("Enter the denominations");
        
        for (int i = 0; i < size; i++) 
        {
            denominations[i] = input.nextInt();
        }
        System.out.println("Enter the amount to be paid");
        int amount = input.nextInt();
       
        DenimonationCalculator calculator = new DenimonationCalculator(denominations, amount);
        calculator.CaculateDenimination();
       
        if(input !=null)
        {
            input.close();
        }
                       
    }
}
 
