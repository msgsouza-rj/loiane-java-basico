package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com tr�s n�meros inteiros:");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if ( num1 > num2 && num2 > num3) {
			System.out.println(num1 + " � o maior");
			
		} else if (num2 > num3) {
			System.out.println(num2 + " � o maior");
			
		}else {
			System.out.println(num3 + " � o maior");
			
		}

		
	}

}
