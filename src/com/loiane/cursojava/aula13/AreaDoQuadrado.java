package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class AreaDoQuadrado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o lado do quadredo:");
		double lado = scan.nextDouble();
		System.out.println("O dobro da área do quadrado é: " + (lado*lado));
		

	}

}
