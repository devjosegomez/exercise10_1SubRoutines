package com.exercise10_1subroutines.app;

import java.util.Scanner;

public class SubRoutines {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		Scanner input = new Scanner(System.in);
		
		ShowMessage();
		num1 = input.nextInt();
		
		ShowMessage();
		num2 = input.nextInt();
		
		result = num1 + num2;
		
		System.out.println(ShowTunnedMessage("José, here's the result!"));
		
		System.out.println(num1 + "+" + num2 + "=" + result);
		
	}
	
	//Method to add 2 numbers
	public int AddNumbers(int num1, int num2) {
		return num1 + num2;
	}

	public static void ShowMessage() {
		System.out.println("Enter a number: ");
	}
	
	public static String ShowTunnedMessage(String message) {
		return "Hola " + message;
	}
	
}
