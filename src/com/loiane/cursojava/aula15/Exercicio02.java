package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int n1;
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um número inteiro");
		n1 = scan.nextInt();
		if (n1 >= 0) {
			System.out.println("O número é Positivo!");
		}else {System.out.println("O número Negativo!");
		
		}
		
	}

}
