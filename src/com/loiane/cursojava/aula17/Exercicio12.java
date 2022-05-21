package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		int numero=0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Gerador de Tabuada");
		while ( numero <1 || numero >10) {
			System.out.println("Entre com um número de 01 a 10");
			numero = scan.nextInt();
		}
		
		System.out.println("# Tabuada de : < " + numero + " >");
		for (int i=0; i<=10 ; i++) {
			System.out.println(numero + " X " + i + " = " + numero * i);
		}
		
	}

}
