package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);*/
		
//		System.out.println("digite sua idade");
//		int idade = scan.nextInt();
//		System.out.println("Sua idade é: " + idade);
		
//		System.out.println("digite sua altura");
//		double altura = scan.nextDouble();
//		System.out.println("Sua altura é: " + altura);
		
//		float altura = 0.0f;
		
		System.out.println("Digite primeiro nome, idade, num de filhos, altura e se tem pet");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		double altura = scan.nextDouble();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("VC digitou:");
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		System.out.println("idade: " + idade);
		System.out.println("nun filhos: " + qtdFilhos);
		System.out.println("altura: " + altura);
		System.out.println("Tem Pet: " + temPet);
		
	}

}
