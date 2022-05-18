package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		double[] numeros = new double [5];
		
//		while (i < numeros.length) {
//			
//			System.out.println("Entre com um numero: ");
//			numeros[i] = scan.nextDouble();
//			i++;
//			
//		}
		
		for (i = 0 ; i < numeros.length ; i++) {
			
			System.out.println("Entre com um numero: ");
			numeros[i] = scan.nextDouble();

			
		}
		
		for (double cont : numeros) {
			System.out.println(cont);
		}
		
		
		


	}

}
