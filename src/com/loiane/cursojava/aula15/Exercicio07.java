package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com três números inteiros:");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if ( num1 > num2 && num1 > num3) {
			System.out.println(num1 + " é o maior");
			
		} else if ( num2 > num1 && num2 > num3) {
			System.out.println(num2 + " é o maior");
			
		} else if ( num3 > num1 && num3 > num2) {
			System.out.println(num3 + " é o maior");
			
		}
		
		if ( num1 < num2 && num1 < num3) {
			System.out.println(num1 + " é o menor");
			
		} else if ( num2 < num1 && num2 < num3) {
			System.out.println(num2 + " é o menor");
			
		} else if ( num3 < num1 && num3 < num2) {
			System.out.println(num3 + " é o menor");
			
		}

		
	}

}
