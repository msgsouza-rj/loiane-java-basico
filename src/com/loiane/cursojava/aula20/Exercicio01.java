package com.loiane.cursojava.aula20;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int [][] numerosAlearorios = new int [4][4];
		
		Random numeroRandom = new Random();
		
		for (int i=0; i<numerosAlearorios.length; i++) {
			for (int j=0; j<numerosAlearorios[i].length; j++) {
				numerosAlearorios[i][j] = numeroRandom.nextInt(100);
			}
		}
		
		int maior = 0;
		int linha = 0;
		int coluna = 0;
		
		for (int i=0; i<numerosAlearorios.length; i++) {
			for (int j=0; j<numerosAlearorios[i].length; j++) {
				if (numerosAlearorios[i][j] > maior) {
					maior = numerosAlearorios[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		for (int i=0; i<numerosAlearorios.length; i++) {
			for (int j=0; j<numerosAlearorios[i].length; j++) {
				System.out.print(numerosAlearorios[i][j] + " ");
				}
				System.out.println();
			}
		
		
		System.out.println("Maior numero: " + maior);
		System.out.println("linha " + linha);
		System.out.println("coluna: " + coluna);

	}

}
