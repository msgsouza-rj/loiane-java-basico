package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		int num1, num2, soma;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o 1o número: ");
		num1 = scan.nextInt();
		
		System.out.println("Entre com o 2o número: ");
		num2 = scan.nextInt();
		
		soma=0;
		for (int i=num1+1 ; i<num2; i++) {
			System.out.print(" " + i + " | ");
			if (i % 10 == 0) {
				System.out.println("");
			}
			soma+= i;
		}
		System.out.println("");
		System.out.println("Soma: " + soma);
	}

}
