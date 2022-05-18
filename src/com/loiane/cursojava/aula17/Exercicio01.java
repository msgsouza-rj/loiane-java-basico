package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double nota = 0;
		
		do {
			System.out.println("Entre com uma nota entre Zero e Dez:");
			nota = scan.nextDouble();
			
			if (nota < 0 || nota >10) {
				System.out.println("Valor incorreto! Entre com uma nota entre Zero e Dez:");
			}
			
		}while (nota < 0 || nota >10);
		
		System.out.println("o Valor digitado é: " + nota);
	
		}

}
