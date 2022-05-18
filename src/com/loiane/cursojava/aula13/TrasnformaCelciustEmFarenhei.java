package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class TrasnformaCelciustEmFarenhei {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite a temperatura em Farenheit:");
			double c=scan.nextDouble();
			System.out.println("A temperatura em Celcius é: " + (c * 1.8 + 32));

		}

}
