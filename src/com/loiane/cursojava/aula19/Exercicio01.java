package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int[] vetor01 = new int [5];
		int[] vetor02 = new int [5];
		
		for (i = 0; i < vetor01.length ; i++) {
			
		
			System.out.println("entre com um numero");
			vetor01[i] = scan.nextInt();
		
		}
		
		i=0;
		for (i = 0; i < vetor01.length ; i++) {
			
			vetor02[i] = vetor01[i];
			
		}
		
		i=0;
		System.out.println("i" + i);
		System.out.println("vetor" + vetor01.length);
		while (i < vetor01.length) {
			System.out.println("Vetor A (" + i + ") = " + vetor01[i]);
			System.out.println("Vetor B (" + i + ") = " + vetor02[i]);
			i++;
		}
		
	}

}
