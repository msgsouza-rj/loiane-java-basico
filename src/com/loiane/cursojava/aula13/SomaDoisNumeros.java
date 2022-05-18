package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("entre com dois números:");
		
		int nun1 = sc1.nextInt();
		int nun2 = sc2.nextInt();
		
		System.out.println("O primeiro número é: " + nun1 + 
				" e o segundo número é: " + nun2);

	}

}
