package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println(" entre com os tr�s lados do tri�nguo:");
		
		int l1 = scan.nextInt();
		
		int l2 = scan.nextInt();
		
		int l3 = scan.nextInt();
		
		if (l1+l2 < l3 || l2+l3 < l1 || l1+l3 < l2) {
			System.out.println("N�o � um Tri�ngulo!"); 
			
		}else if (l1 == l2 && l2 == l3) {
			System.out.println("� um Tri�ngulo Equil�tero!"); 
			
		}else if (l1 == l2 || l2 == l3 || l3 == l1) {
			System.out.println("� um Tri�ngulo Is�sceles!"); 
			
		}else if (l1 != l2 && l2 != l3) {
			System.out.println("� um Tri�ngulo Escaleno!"); 
			
		}
		
	}

}
