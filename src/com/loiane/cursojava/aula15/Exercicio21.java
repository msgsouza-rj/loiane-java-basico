package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de litros vendidos:");
		double litros = scan.nextInt();
		
		System.out.println("tipo de combustível (A alcooo ou G gasolina) :");
		String tipo = scan.next();
		
		switch (tipo) {
		case "A":
		case "a": if (litros > 20) {
				System.out.println("Valor pago: R$ " + (litros * 1.90 * 0.95));
			} else {
				System.out.println("Valor pago: R$ " + (litros * 1.90 * 0.97));
			} break;
			
		case "G":
		case "g": if (litros > 20) {
				System.out.println("Valor pago: R$ " + (litros * 2.50 * 0.96));
			} else {
				System.out.println("Valor pago: R$ " + (litros * 2.50 * 0.94));
			} break;
			
		default: System.out.println("Entrada inválda!");
		}
				
	}

}
