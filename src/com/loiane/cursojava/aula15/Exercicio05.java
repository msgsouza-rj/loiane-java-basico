package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		double media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com duas notas:");
		
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		media = (n1 + n2)/2;
		
		if (media == 10) {
			System.out.println("Aprovado com Distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
	}

}
