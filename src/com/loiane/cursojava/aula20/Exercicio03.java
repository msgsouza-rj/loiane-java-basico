package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int [][] m = new int [3][3];
		Scanner scan = new Scanner(System.in);
		int numeroDePares = 0;
		int numeroDeImpares = 0;
		
		System.out.println(m.length);
		
		for (int i=0; i<m.length;i++) {
			for (int j=0; j<m[i].length; j++) {
				System.out.println("Entre com um valor para a matrix " + "["+i+"]" + "["+j+"]");
				m[i][j] = scan.nextInt();
				if (m[i][j] % 2 == 0) {
//					numeroDePares = numeroDePares + 1;
//					++numeroDePares;
					numeroDePares += 1;
				}else {
//					numeroDeImpares = numeroDeImpares + 1;
//					++numeroDeImpares;
					numeroDeImpares += 1;
				}
			}
		}
		for (int i=0; i<m.length;i++) {
			for (int j=0; j<m[i].length; j++) {
				System.out.print(m[i][j]+ " ! ");
			}
			System.out.println();
		}
		System.out.println("hoveram " + numeroDePares + " numeros pares");
		System.out.println("hoveram " + numeroDeImpares + " numeros impares");

	}

}
