package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero carrespondente a o dia da semana:");
		
		int dia = scan.nextInt();
		
		switch (dia){
		
		case 1: System.out.println("Domingo"); break;
		
		case 2: System.out.println("Segunda"); break;
		
		case 3: System.out.println("Ter�a"); break;
		
		case 4: System.out.println("Quarta"); break;
		
		case 5: System.out.println("Quinta"); break;
		
		case 6: System.out.println("Sexta"); break;
		
		case 7: System.out.println("S�bado"); break;
		
		default: System.out.println("N�o rolou!"); break;
			
		}

	}

}
