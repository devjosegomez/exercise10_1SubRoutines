package com.exercise10_1subroutines.app;

import java.util.Scanner;

public class SubRoutines {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me a number: ");
		num1 = input.nextInt();
		
		System.out.println("Give me a number: ");
		num2 = input.nextInt();
		
		result = num1 + num2;
		
		System.out.println(num1 + "+" + num2 + "=" + result);
		
	}
	
	//Method to add 2 numbers
	public int AddNumbers(int num1, int num2) {
		return num1 + num2;
	}

	public void ShowMessages() {
		System.out.println("Enter a number: ");
	}
	
	public String ShowTunnedMessage(String message) {
		return "Hola " + message;
	}
	
	
}
