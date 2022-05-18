package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		
		double popA = 0;
		double popB = 0;
		int cont = 0;
		double taxaDeCrescimentoA;
		double taxaDeCrescimentoB;
		boolean continuar = false;
		boolean valido = false;
		String desejaContinuar;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			do {
			System.out.println("Digite a população de A: ");
			popA = scan.nextDouble();
			if (popA <= 0) {
				System.out.println("Valor Inválido, entre com um valor maior que 0!");
				valido = false;
			} else {
				valido = true;
			}
			
			} while (!valido);
			
			valido = false;
			do {
				System.out.println("Digite a população de B: ");
				popB = scan.nextDouble();
				if (popB <= 0) {
					System.out.println("Valor Inválido, entre com um valor maior que 0!");
					valido = false;
				} else {
					valido = true;
				}
				
				} while (!valido);
			
			valido = false;
			do {
				System.out.println("Digite a taxa de crescimento da população de  A: ");
				taxaDeCrescimentoA = scan.nextDouble();
				if (taxaDeCrescimentoA <= 0 || taxaDeCrescimentoA > 100) {
					System.out.println("Valor Inválido, entre com um valor maior que 0!");
					valido = false;
				} else {
					valido = true;
				}
				
				} while (!valido);
			
			valido = false;
			do {
				System.out.println("Digite a taxa de crescimento da população de  B: ");
				taxaDeCrescimentoB = scan.nextDouble();
				if (taxaDeCrescimentoB > 0 || taxaDeCrescimentoB < 100) {
					valido = true;
				} else {
					System.out.println("Valor Inválido, entre com um valor maior que 0!");
					valido = false;
					
				}
				
				} while (!valido);
			
			while (popA < popB) {
				popA += (popA / 100) * taxaDeCrescimentoA;
				popB += (popB / 100) * taxaDeCrescimentoB;
				cont ++;
			}
			
			System.out.println("Popilação de A: " + popA);
			System.out.println("Popilação de B "+ popB);
			System.out.println("B atinge A em : " + cont);
			
			System.out.println("Deseja fazer outro calculo? (s ou n)");
			desejaContinuar = scan.next();
			
			if (desejaContinuar.equalsIgnoreCase("S") || desejaContinuar.equalsIgnoreCase("s")) {
				continuar = true;
			} else {
				continuar = false;
			}
			
			
		} while (continuar);
		
				
		

		}

}
