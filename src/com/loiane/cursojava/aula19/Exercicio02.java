package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		int i = 0;
		int[] vetor01 = new int [8];
		int[] vetor02 = new int [vetor01.length];
		
		for (int i = 0; i < vetor01.length ; i++) {
			System.out.println("entre com um numero");
			vetor01[i] = scan.nextInt();
			vetor02[i] = vetor01[i] * 2;
		}
		
		for (int i = 0; i < vetor01.length ; i++) {
			System.out.print("A " + vetor01[i] + "- ");
			System.out.print("B " + vetor02[i] + "- ");
		}
	}
}
