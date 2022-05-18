package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double precoDoMorango;
		double precoDaMaca;
		int percentualDesconto = 0;
		double totalDaVenda;
		double desconto = 0;
		
		System.out.println("Quantidade de morangos adiquiridas (em quilos)?");
		double qtdMorango = scan.nextDouble();
		
		System.out.println("Quantidade de maça adiquiridas (em quilos)?");
		double qtdMaca = scan.nextDouble();
		
		if (qtdMorango > 5) {
			precoDoMorango = 2.20;
		} else {
			precoDoMorango = 2.50;
		}
		
		if (qtdMaca > 5) {
			precoDaMaca = 1.50;
		} else {
			precoDaMaca = 1.80;
		}
		
		totalDaVenda = (qtdMorango * precoDoMorango) + (qtdMaca * precoDaMaca);
		
		
		if (qtdMorango + qtdMaca > 8 || totalDaVenda > 25.00) {
			percentualDesconto = 10;
			desconto = (totalDaVenda * percentualDesconto) / 100;
		} else {
			
		}
		
		System.out.printf("Total da Venda: R$ %.2f %n", (totalDaVenda - desconto));
	}

}
