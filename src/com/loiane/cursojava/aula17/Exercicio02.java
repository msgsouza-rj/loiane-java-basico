package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String nome = "";
		String senha = "";
		
		do {
			System.out.println("Entre com o nome do usuário:");
			nome = scan.next();
//			System.out.println("nome:" + nome);
			
			
			System.out.println("Entre com a senha:");
			senha = scan.next();
//			System.out.println("senha:" + senha);
			
			if (nome.equals(senha)) {
				System.out.println("O Nome e a senha não podem ser iguais! Repita o login.");
							}
			
		} while (nome.equals(senha));
		
		
		System.out.println("fim");
		
	}

}
