package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class SalarioPorHorasTrabalhadas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quanto voc� ganha por hora:");
		double valorHora = scan.nextDouble();
		System.out.println("Digite o numero de horas trabalhadas:");
		double numeroDeHoras = scan.nextDouble();
		System.out.println("O seu sal�rio total no m�s � de: " + (valorHora * numeroDeHoras));


	}

}
