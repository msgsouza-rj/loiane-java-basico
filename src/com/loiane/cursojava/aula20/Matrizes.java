package com.loiane.cursojava.aula20;

import java.text.DecimalFormat;

public class Matrizes {

	public static void main(String[] args) {
		
		double [][] notasAlunos = new double [3] [4];
		
		notasAlunos [0][0] = 10;
		notasAlunos [0][1] = 7;
		notasAlunos [0][2] = 9;
		notasAlunos [0][3] = 9.5;
		
		notasAlunos [1][0] = 8;
		notasAlunos [1][1] = 9;
		notasAlunos [1][2] = 10;
		notasAlunos [1][3] = 7;
		
		notasAlunos [2][0] = 9;
		notasAlunos [2][1] = 8;
		notasAlunos [2][2] = 7;
		notasAlunos [2][3] = 9;
		
//		System.out.print(notasAlunos.length);
		int i, j;
		for (i=0; i < notasAlunos.length; i++){
			System.out.println("IL -" + notasAlunos.length);
			for ( j=0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " ; ");
			}
			
			System.out.println();
			
		}
		
		System.out.println("Calculando a Média de cada aluno");
		double soma = 0;
		DecimalFormat df = new DecimalFormat("###,###.##");
		for (i=0; i < notasAlunos.length; i++){
			soma = 0;
			for ( j=0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " ; ");
				soma += notasAlunos[i][j];
			}
			System.out.print(" Média-> " + df.format(soma/4));
			System.out.println();
		}
		
		double[] notasAluno1  = {7, 8, 9, 10};
		double[][] notasAluno2  = {{1, 2, 3, 4}, {5, 6, 7, 8}};
		
		for (i=0; i < notasAluno1.length; i++){
			System.out.print(notasAluno1[i] + " ; ");
			}
			System.out.println();
		
		for (i=0; i<notasAluno2.length; i++) {
			for (j=0; j <notasAluno2[i].length; j++) {
				System.out.print(notasAluno2[i][j] + " ; ");
			}
			System.out.println();
		}
		
			
			
	}

}

