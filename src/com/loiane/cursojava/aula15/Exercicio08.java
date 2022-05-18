package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o 1o valor do produto:");
		double prod1 = scan.nextDouble();
		
		System.out.println("Entre com o 2o valor do produto:");
		double prod2 = scan.nextDouble();
		
		System.out.println("Entre com o 3o valor do produto:");
		double prod3 = scan.nextDouble();
		
						
		if ( prod1 < prod2 && prod1 < prod3) {
			System.out.println("Compre o produto 1" );
			
		} else if ( prod2 < prod1 && prod2 < prod3) {
			System.out.println("Compre o produto 2");
			
		} else if ( prod3 < prod1 && prod3 < prod2) {
			System.out.println("Compre o produto 3");
			
		}

		
	}

}
