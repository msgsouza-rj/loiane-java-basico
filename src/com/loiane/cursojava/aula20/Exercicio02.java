package com.loiane.cursojava.aula20;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int [][] numerosAlearorios = new int [10][10];
		
		Random numeroRandom = new Random();
		
		for (int i=0; i<numerosAlearorios.length; i++) {
			for (int j=0; j<numerosAlearorios[i].length; j++) {
				numerosAlearorios[i][j] = numeroRandom.nextInt(100);
			}
		}
		
		for (int i=0; i<numerosAlearorios.length; i++) {
			for (int j=0; j<numerosAlearorios[i].length; j++) {
				System.out.print(numerosAlearorios[i][j] + " ");
				}
				System.out.println();
			}
		
		
		int maior = 0;
		int menor = 101;
		
		for (int i=0; i<numerosAlearorios.length; i++) {
				if (numerosAlearorios[5][i] > maior) {
					maior = numerosAlearorios[5][i];
				}
				if (numerosAlearorios[5][i] < menor) {
					menor = numerosAlearorios[5][i];
				}
			}
			
			System.out.println("Maior numero da linha 5: " + maior);
			System.out.println("Menor numero da linha 5: " + menor);
			
			maior = 0;
			menor = 101;

			for (int i=0; i<numerosAlearorios.length; i++) {
				if (numerosAlearorios[7][i] > maior) {
					maior = numerosAlearorios[7][i];
				}
				if (numerosAlearorios[7][i] < menor) {
					menor = numerosAlearorios[7][i];
				}
				
			}
			
			System.out.println("Maior numero da linha 7: " + maior);
			System.out.println("Menor numero da linha 7: " + menor);
	}

}
