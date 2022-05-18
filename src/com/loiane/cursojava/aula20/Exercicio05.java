package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int horas = 24;
		int dias = 31;
		boolean sair = false;
		String[][] compromissos = new String [dias][horas];
		int diaDoCompromisso = 0;
		int horaDoCompromisso = 0;
		byte opcao;
		
		while (!sair) {
						
			System.out.println("--- Menu  ----");
			System.out.println("1 - Adicionar Compromisso");
			System.out.println("2 - Consulultar Compromisso");
			System.out.println("3 - Sair");
			System.out.println("Entre com uma opção");
			
			opcao = scan.nextByte();
			
			
			if (opcao == 1) {
				// adiciona
				boolean diaValido = false;
				while (!diaValido) {
					System.out.println("Entre com o dia do compromisso:");
					diaDoCompromisso = scan.nextInt();
					if (diaDoCompromisso<1 || diaDoCompromisso>31) {
						System.out.println("Dia inválido!/n");
					}else {
						diaValido = true;
					}
				}
				
				boolean horaValida = false;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso:");
					horaDoCompromisso = scan.nextInt();
					if (horaDoCompromisso<0 || horaDoCompromisso>24) {
						System.out.println("Hora Invalida!/n");
					}else {
						horaValida = true;
					}
				}
				System.out.println("Digite o compromisso:");
				compromissos[--diaDoCompromisso][--horaDoCompromisso] = scan.next();
				if (compromissos[diaDoCompromisso][horaDoCompromisso] == null ) {
					System.out.println("O compromisso não foi agendado!");
				}else {
					System.out.println("Compromisso agendado!");
				}
								
			}else {
				if (opcao == 2) {
					// consulta
					
					boolean diaValido = false;
					while (!diaValido) {
						System.out.println("Entre com o dia do compromisso:");
						diaDoCompromisso = scan.nextInt();
						if (diaDoCompromisso<1 || diaDoCompromisso>31) {
							System.out.println("Dia inválido!/n");
						}else {
							diaValido = true;
						}
					}
					
					boolean horaValida = false;
					while (!horaValida) {
						System.out.println("Entre com a hora do compromisso:");
						horaDoCompromisso = scan.nextInt();
						if (horaDoCompromisso<0 || horaDoCompromisso>24) {
							System.out.println("Hora Invalida!/n");
						}else {
							horaValida = true;
						}
					}
					System.out.println("Compromisso do dia " + diaDoCompromisso + " às " + horaDoCompromisso +
							" horas: " + compromissos[--diaDoCompromisso][--horaDoCompromisso]);
					
				} else {
					if (opcao ==3) {
						sair = true;
					}else {
						System.out.println("Entrada invalida! \n");
					}
				}
			}
			
			
		}// 3
		System.out.println("Finalizado!");
		

	} // 2

} // 1
