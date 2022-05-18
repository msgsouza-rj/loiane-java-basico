package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int horas = 24;
		int dias = 31;
		boolean sair = false;
		String[][] compromissos = new String [dias][horas];
		int diaDoCompromisso = 0;
		int horaDoCompromisso = 0;
		int opcao=0;
		
		while (!sair) {
						
			System.out.println("--- Menu  ----");
			System.out.println("1 - Adicionar Compromisso");
			System.out.println("2 - Consulultar Compromisso");
			System.out.println("3 - Sair");
			System.out.println("Entre com uma opção");
			
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Entre com o dia do compromisso:");
				diaDoCompromisso = scan.nextInt();
				System.out.println("Entre com a hora do compromisso:");
				horaDoCompromisso = scan.nextInt();
				System.out.println("Digite o compromisso:");
				compromissos[diaDoCompromisso][horaDoCompromisso] = scan.next();
				if (compromissos[diaDoCompromisso][horaDoCompromisso] == null ) {
					System.out.println("O compromisso não foi agendado!");
				}else {
					System.out.println("Compromisso agendado!");
				}
				opcao=0;
				break;
				
			case 2:
				System.out.println("Entre com o dia do compromisso:");
				diaDoCompromisso = scan.nextInt();
				System.out.println("Entre com a hora do compromisso:");
				horaDoCompromisso = scan.nextInt();
				System.out.println("Compromisso do dia " +diaDoCompromisso+ " às " +horaDoCompromisso+
						" horas: " + compromissos[diaDoCompromisso][horaDoCompromisso]);
				break;
				
			case 3:
				sair = true;
				break;
				
			default:
				System.out.println("Entrada inválida!");
			}
			System.out.println();
						
		}
		System.out.println("Finalizado!");
		

	}

}
