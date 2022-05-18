package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double n1;
		double n2;
		double media;
		char conceito = ' ';
		String status ="";
		
		System.out.println("Eentre com a primeira nota:");
		
		n1 = scan.nextDouble();
		
		System.out.println("Eentre com a segunda nota:");
		
		n2 = scan.nextDouble();
		
		media = (n1 + n2)/2;
		
		if (media >= 9.0 && media <= 10) {
			conceito = 'A'; status = "Aprovado";
			
		} else if (media >= 7.5 && media < 9.0) {
			conceito = 'B'; status = "Aprovado";
			
		}else if (media >= 6.0 && media < 7.5) {
			conceito = 'C'; status = "Aprovado";
			
		}else if (media >= 4.0 && media < 6.0) {
			conceito = 'D'; status = "Reprovado";
			
		}else if (media < 4.0) {
			conceito = 'E'; status = "Reprovado";
			
		}
		
		System.out.println("Notas: " + n1 + " , " + n2);
		
		System.out.println("Média: " + media);
		
		System.out.println("Conceito: " + conceito);
		
		System.out.println("Status: " + status);


	}

}
