package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com tr�s n�meros inteiros:");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if ( num1 <= num2 && num1 <= num3 && num2 <= num3) {
			//num1 � menor, num03 � maior, num1 < num2 < num3
			
			System.out.println(num3 + " - " + num2 + " - " + num1);
			
		} else if ( num1 <= num2 && num1 <= num3 && num3 <= num2) {
			//num1 � menor, num03 � maior, num1 < num3 < num2
			
			System.out.println(num2 + " - " + num3 + " - " + num1);
			
		}else if ( num2 <= num1 && num2 <= num3 && num1 <= num3) {
			//num2 � menor, num03 � maior, num2 < num1 < num3
			
			System.out.println(num3 + " - " + num1 + " - " + num2);
			
		}else if ( num2 <= num1 && num2 <= num3 && num3 <= num1) {
			//num2 � menor, num01 � maior, num2 < num3 < num1
			
			System.out.println(num1 + " - " + num3 + " - " + num2);
			
		}else if ( num3 <= num1 && num3 <= num2 && num1 <= num2) {
			//num3 � menor, num02 � maior, num3 < num1 < num2
			
			System.out.println(num2 + " - " + num1 + " - " + num3);
			
		}else if ( num3 <= num1 && num3 <= num2 && num2 <= num1) {
			//num3 � menor, num01 � maior, num3 < num2 < num1
			
			System.out.println(num1 + " - " + num2 + " - " + num3);
			
		}

	}

}
