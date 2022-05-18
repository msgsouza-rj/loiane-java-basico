package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class TrasnformaFarenheitEmCelcius {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em Farenheit:");
		double f=scan.nextDouble();
		System.out.println("A temperatura em Celcius é: " + (5 * (f-32) /9 ));

	}

}
