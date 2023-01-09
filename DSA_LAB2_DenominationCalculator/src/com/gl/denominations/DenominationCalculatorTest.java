package com.gl.denominations;

public class DenominationCalculatorTest {

	public static void main(String[] args) {
        test(new int[] {5, 1, 10}, 12);
        test(new int[] {60, 5, 12, 78, 25}, 128);
        test(new int[] {12, 5, 123, 18}, 158);
        test(new int[] {12, 5, 123, 18}, 159);
        test(new int[] {12, 5, 123, 18}, 160);
        test(new int[] {5, 0, 10}, 12);
    }
   
    private static void test(int[] denominations, int paymentAmount)
    {
       
        System.out.println("--------------------------------------");
        DenimonationCalculator calculator =
            new DenimonationCalculator(denominations, paymentAmount);
        calculator.CaculateDenimination();
       
    }

	
}
