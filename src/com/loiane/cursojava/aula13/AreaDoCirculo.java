package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class AreaDoCirculo {

	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o Raio do Círculo:");
		double raio = scan.nextDouble();
		double area = (3.1416 * (raio * raio));
//		System.out.printf("A área é: %.2f", area);

		System.out.printf("A área é: %.2f %n" , (3.1416 * (raio * raio)));

	}

}
