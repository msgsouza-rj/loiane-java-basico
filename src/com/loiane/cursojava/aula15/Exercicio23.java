package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o tipo da carne desejada ( file duplo, alcatra ou picanha)?");
		String tipoDeCarne = scan.next();
		
		System.out.println("Quantidade de Carne comprada?");
		double qdtCarne = scan.nextDouble();
		
		System.out.println("Pagamento em Cartão S ou N?");
		String cartao = scan.next();
		
		double precoFile;
		double precoAlcatra;
		double precoPicanha;
		int desconto = 0;
		double valorParcial;
		double precoDaCarne = 0;
		double valorDoDesconto = 0;
		String formaDePagmento;
		
		if (cartao.equalsIgnoreCase("s")) {
			desconto = 5;
			formaDePagmento = "Cartão Tabajara";
		} else {
			formaDePagmento = "Dinheiro";
		}
				
		if (tipoDeCarne.equalsIgnoreCase("file duplo")) {
			if (qdtCarne > 5) {
				precoDaCarne = 5.80;
			} else {
				precoDaCarne = 4.90;
			}
		}
		if (tipoDeCarne.equalsIgnoreCase("alcatra")) {
			if (qdtCarne > 5) {
				precoDaCarne = 6.80;
			} else {
				precoDaCarne = 5.90;
			}
		}
		if (tipoDeCarne.equalsIgnoreCase("picanha")) {
			if (qdtCarne > 5) {
				precoDaCarne = 7.80;
			} else {
				precoDaCarne = 6.90;
			}
		}
		
		valorParcial = precoDaCarne * qdtCarne;
		valorDoDesconto = (valorParcial * desconto) / 100;
		
		System.out.println("_____________________________");
		System.out.println("*** Cupon fiscal ***");
		System.out.println("Tipo da carne: " + tipoDeCarne );
		System.out.println("Quantidade comprada: " + qdtCarne + " kgs");
		System.out.println("Preço total: R$ " + valorParcial);
		System.out.println("Forma de pagamento: " + formaDePagmento);
		System.out.println("Valor do Desconto: R$ " + valorDoDesconto);
		System.out.println("Total a pagar: R$ " + (valorParcial - valorDoDesconto));
		System.out.println("_____________________________");
				
	}

}
