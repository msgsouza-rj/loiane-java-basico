package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		byte maior=0;
		byte numero=0;
		
		System.out.println("Entre com 5 numeros: ");
		for (byte i=0; i<5; i++) {
			numero = scan.nextByte();
			if (numero > maior) {
				maior = numero;
			}
		}
		System.out.println("O maior é: " + maior);
		

	}

}
