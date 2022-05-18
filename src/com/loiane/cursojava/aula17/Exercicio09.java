package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		byte numero=0;
		byte soma=0;
		
		System.out.println("Entre com 5 numeros: ");
		for (byte i=0; i<5; i++) {
			numero = scan.nextByte();
				soma+= numero;
			
		}
		System.out.println("A soma  é: " + soma + " e a média é:1 " + soma/5);
		

	}

}
