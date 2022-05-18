package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		int i = 0;
		int[] vetor01 = new int [15];
		double[] vetor02 = new double [vetor01.length];
		
		for (int i = 0; i < vetor01.length ; i++) {
			System.out.println("entre com um numero");
			vetor01[i] = scan.nextInt();
			vetor02[i] = Math.sqrt(vetor01[i]);
		}
		
		System.out.print("Vetor A : ");
		for (int i = 0; i < vetor01.length ; i++) {
			System.out.print(vetor01[i] + " ");
		}
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.print("Vetor B : ");
		for (int i = 0; i < vetor01.length ; i++) {
			System.out.print(df.format(vetor02[i]) + " ");
		}
		
	}
}
