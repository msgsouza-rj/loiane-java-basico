package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int n1;
		int n2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o primeiro número inteiro:");
		n1 = scan.nextInt();
		System.out.println("Entre com o segundo número inteiro:");
		n2 = scan.nextInt();
		if (n1 > n2) {
			System.out.println("O maior número é: " + n1);
		}else {System.out.println("O maior número é: " + n2);
		
		}
		
	}

}
