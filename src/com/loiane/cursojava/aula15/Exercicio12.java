package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		double salarioBruto;
		int ir = 0;
		double valorHora;
		int qtdHora;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com valor da hora:");
		
		valorHora = scan.nextDouble();
		
		System.out.println("Entre com o numero de horas tabalhadas:");

		qtdHora = scan.nextInt();
		
		salarioBruto = valorHora * qtdHora;
				
		if (salarioBruto <= 900) {
			ir = 0;
			
		} else if (salarioBruto <= 1500) {
			ir = 5;
		
		} else if (salarioBruto <= 2500) {
			ir = 10;
			
		} else if (salarioBruto > 2500) {
			ir = 20;
		
		}
		
				
		System.out.println("O salário bruto é: R$ " + salarioBruto);
		
		System.out.println("(-) IR (" + ir + "%) : R$ " + ((salarioBruto / 100) * ir));
		
		System.out.println("(-) INSS (10%) : R$ " + (salarioBruto / 100) * 10);
		
		System.out.println("FGTS (11%) : R$ " + (salarioBruto / 100) * 11);

		System.out.println("Total de descontos: R$ " + ((salarioBruto / 100) * (ir + 13)));
		
		System.out.println("O salario liquido é: R$ " + (salarioBruto - ((salarioBruto / 100 ) * (ir + 13))));

	}

}
