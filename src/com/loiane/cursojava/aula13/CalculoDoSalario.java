package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class CalculoDoSalario {
	
	

	public static void main(String[] args) {
		double salarioBruto;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o lalor da sua hora tralhada e quantas horas vc trabalhou: ");
		double valorPorHora = scan.nextDouble();
		int horasTrabalhadas = scan.nextInt();
		salarioBruto = valorPorHora * horasTrabalhadas;
		System.out.println("O Seu sal�rio Bruto �: R$ " + salarioBruto);
		System.out.println("Voc� pagou R$ " + (salarioBruto * 0.08) + " de INSS");
 		System.out.println("Voc� pagou R$ " + (salarioBruto * 0.05) + " para o Sindicato");
		System.out.println("O seu sal�rio l�quido �: R$" + (salarioBruto - salarioBruto * 0.24));
		

	}

}
