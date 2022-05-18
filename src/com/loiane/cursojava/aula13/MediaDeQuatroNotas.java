package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class MediaDeQuatroNotas {

	
	
	public static void main(String[] args) {
		
	double soma = 0;
		
	try (Scanner nota = new Scanner(System.in)) {
		for(int i=1 ; i <= 4 ; i++) {
				
			int n = i;
			System.out.println("entre com a nota" + n + " : ");
			double notaLida = nota.nextDouble();
			soma = soma + notaLida;
		}
	}
		
	System.out.println("A média das quatro notas é: " + soma / 4);
			

	}

}
