package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class CalculaTempoDeDonwload {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do Arquivo em MB e a Velocidade do Link de internet em Mbps");
		double t = scan.nextDouble();
		double v = scan.nextDouble();
		System.out.println("O tempo a aprroximado de download é de: " + (t / (v * 8)) + " Segundos");
	}

}
