package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com salario do colcaborador:");
		
		double salario;
		double reajuste = 0;
	
		
		salario = scan.nextDouble();
		
		if (salario <= 280) {
			reajuste = 0.20;
			
		} else if (salario <= 700) {
			reajuste = 0.15;
		
		} else if (salario <= 1500) {
			reajuste = 0.10;
			
		} else if (salario > 1500) {
			reajuste = 0.05;
		
		}
		
		System.out.println("O salário anterior era: R$ " + salario);
		
		System.out.println("O percentual é de " + (reajuste * 100) + "%");
		
		System.out.println("O valor do reajuste é: R$ " + (salario * reajuste));

		System.out.println("O salário atual passou para: R$ " + (salario += salario * reajuste));

	}

}
