package com.exercise16mathclass.app;

import java.lang.Math;
public class MathematicalOperations 
{

	public static void main(String[] args) 
	{
		double number=3.4;
		double number2=5.5;
		System.out.println("E Value: "+Math.E);
		System.out.println("Value of PI: "+Math.PI);
		System.out.println("Absolute value of -2.15 is: "+Math.abs(-2.15));
        System.out.println("The cube root of 27 is: "+Math.cbrt(27));
        System.out.println("The round of 3.76: "+Math.round(number));//Rounds to the nearest
        System.out.println("The round ceil of 3.76: "+Math.ceil(number));//Rounds Up
        System.out.println("The round floor of 3.76: "+Math.floor(number));//Rounds down
        System.out.println("Decrement of 5 is: "+Math.decrementExact(5));
        System.out.println("Increment of 5 is: "+Math.incrementExact(5));
        System.out.println("Power value of 3 Euler is: "+Math.exp(3));
        System.out.println(String.format("Which is bigger? %.2f or %.2f: %.2f", number, number2, Math.max(number, number2)));//Bigger number
        System.out.println(String.format("Which is bigger? %.2f or %.2f: %.2f", number, number2, Math.min(number, number2)));//Smaller number
        System.out.println("Sin of 90 degres is: "+Math.asin(0));        
	}

}
