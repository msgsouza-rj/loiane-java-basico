package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String nome = "";
		int idade = 0;
		double salario = 0;
		char sexo = ' ';
		char estadoCivil;
		
		
		do {
			System.out.println("Entre com o nome:");
			nome = scan.next();
						
		}while (nome.length() < 3);
		
		do {
			System.out.println("Entre com a idade:");
			idade = scan.nextInt();
			
		} while (idade <0 || idade > 150);
		
		do {
			System.out.println("Entre com o salário:");
			salario = scan.nextDouble();
		} while (salario <= 0);
		
		do {
			System.out.println("Sexo (M)asculino ou (F)eminino?");
			sexo = scan.next().charAt(0);
//			System.out.println("s = " + sexo);
						
		} while (sexo != 'M' && sexo != 'm' && sexo != 'f' && sexo != 'F');
		
		do {
			System.out.println("Estado civil: (S)olteiro, (C)asado, (V)iuvo ou (D)ivorciado");
			estadoCivil = scan.next().charAt(0);
//			System.out.println("e = " + estadoCivil);
						
		} while (estadoCivil != 'S' && estadoCivil != 's' && estadoCivil != 'C' && estadoCivil != 'c' &&
				estadoCivil != 'V' && estadoCivil != 'v' && estadoCivil != 'D' && estadoCivil != 'd');
			
				
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);
	
		}

}
