package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero:");
		int num1=scan.nextInt();
		

		System.out.println("Entre com o segundo numero:");
		int num2=scan.nextInt();
		
		System.out.println("Entre com a opera��o aritim�tica desejada: ( + - * /):");
		String operacao = scan.next();
		
		System.out.println(operacao);
		
		double resultado = 0;
		
		boolean valida = true;
		
		switch (operacao) {
		
		case "+": resultado = num1 + num2; break;
		
		case "-": resultado = num1 - num2; break;
		
		case "*": resultado = num1 * num2; break;
		
		case "/": resultado = num1 / num2; break;
		
		default : System.out.println("Entrada inv�lida!"); valida = false;
		}
		
				
		if (valida) {
			
			System.out.println("O resultado �: " + resultado);
			
			if (resultado >=0) {
				System.out.println("Resultado positivo");
			}else {
				System.out.println("Resultado negativo");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("� par");
			} else {
				System.out.println("� impar");
			}
			
		}
		
		

	}

}
