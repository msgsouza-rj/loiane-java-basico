package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com o ano");
		
		int ano = scan.nextInt();
		
		if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("� bissexto!");
						
		} else {
			System.out.println("N�o � bissexto!");
		}
	}

}
