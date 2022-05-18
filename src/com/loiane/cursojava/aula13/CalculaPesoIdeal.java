package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class CalculaPesoIdeal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a sua altura:");
		double a=scan.nextDouble();
		System.out.println("O seu peso ideal é: " + ((72.7 * a)-58));
	

	}

}
