package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println(" entre com os três lados do triânguo:");
		
		int l1 = scan.nextInt();
		
		int l2 = scan.nextInt();
		
		int l3 = scan.nextInt();
		
		if (l1+l2 < l3 || l2+l3 < l1 || l1+l3 < l2) {
			System.out.println("Não é um Triângulo!"); 
			
		}else if (l1 == l2 && l2 == l3) {
			System.out.println("É um Triângulo Equilátero!"); 
			
		}else if (l1 == l2 || l2 == l3 || l3 == l1) {
			System.out.println("É um Triângulo Isósceles!"); 
			
		}else if (l1 != l2 && l2 != l3) {
			System.out.println("É um Triângulo Escaleno!"); 
			
		}
		
	}

}
