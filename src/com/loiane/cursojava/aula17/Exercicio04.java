package com.loiane.cursojava.aula17;

//import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
		long popA = 80000;
		long popB = 200000;
		int cont = 0;
		
		
		while (popA < popB) {
			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			cont ++;
		}
		
		System.out.println("Popilação de A: " + popA);
		System.out.println("Popilação de B "+ popB);
		System.out.println("B atinge A em : " + cont);

		}

}
