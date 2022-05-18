package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class SalarioPorHorasTrabalhadas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quanto você ganha por hora:");
		double valorHora = scan.nextDouble();
		System.out.println("Digite o numero de horas trabalhadas:");
		double numeroDeHoras = scan.nextDouble();
		System.out.println("O seu salário total no mês é de: " + (valorHora * numeroDeHoras));


	}

}
