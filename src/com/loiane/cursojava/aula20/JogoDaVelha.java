package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] tabuleiro = new String[3][3];

		boolean houveUmVitorioso=false;
		byte opcao=0;
		byte opcaoInstrucoes=0;
		byte jogadorDaVez = 0;
		byte vencedor=0;
		byte escolhaJogadorDaVez;
		int numeroDaJogada=1;
		boolean semVencedor = false;
		
		while(opcao != 3) {
			
			System.out.println("### Jogo da Velha ###");
			System.out.println("(1) Instruçoes do Jogo");
			System.out.println("(2) Quero jogar!");
			System.out.println("(3) Cansei! Quero sai do jogo");
			System.out.println("Digite uma opção:");

			opcao = scan.nextByte();

			if (opcao == 1) {
				

				while (opcaoInstrucoes != 3) {
					System.out.println("(1) Regras do jogo");
					System.out.println("(2) Como Jogar");
					System.out.println("(3) Voltar ao Menu Principal");
					opcaoInstrucoes = scan.nextByte();

					if (opcaoInstrucoes == 1) {
					
						System.out.println("--- Regras do jogo ---");
						System.out.println("------------- O objetivo do jogo é fazer uma sequência de três símbolos iguais,");
						System.out.println(" X !   ! O  | seja em linha vertical, horizontal ou diagonal, enquanto tenta impedir que seu adversário");
						System.out.println("   ! X ! O  | faça o mesmo; Quando um dos participantes faz uma linha, ganha o jogo; ");
						System.out.println("   !   ! X  | Começa do início, normalmente trocando os símbolos escolhido (O) e (X)");
						System.out.println("------------- Cada Jogador joga uma vez e marca uma posição, se não ganhou o outro joga.");

					}else { if (opcaoInstrucoes == 2) {
						System.out.println("--- Como Jogar ---");
						System.out.println("  ________________________ ");
						System.out.println("  7 | 8 | 9       |   |   |  Cada jogador joga uma vez");
						System.out.println(" -----------   -----------|  usando um numero de 1 a 9");
						System.out.println("  4 | 5 | 6  =>   |   |   |  Cada número corresponde a uma");
						System.out.println(" -----------   -----------|  posição no jogo, seguindo as posições");
						System.out.println("  1 | 2 | 3       |   |   |  do Teclado Numérico. Ao fazer uma");
						System.out.println("  ________________________|  jogada, o Tabuleiro é atualizado e");
						System.out.println("o outro jogador pode jogar. Finaliza quando um ganhar.");

					}else {
						System.out.println("Ok, Voltando!");
					}
					}
					System.out.println("");
				}
			}						
			if (opcao == 2) {
				// inializa o tabuleiro
				for (int i=0; i<tabuleiro.length;  i++) {
					for (int j=0; j<tabuleiro[i].length; j++) {
						tabuleiro[i][j]=" ";
					}
				}
				System.out.println("    |   |   ");
				System.out.println(" -----------");
				System.out.println("    |   |   ");
				System.out.println(" -----------");
				System.out.println("    |   |   ");
				System.out.println("");
				System.out.println("______ Vamos Começar!______");


				while (!houveUmVitorioso || !semVencedor) { //Enquanto não houve um vitorioso
					escolhaJogadorDaVez = 0;
					if (numeroDaJogada % 2 == 0) {
						jogadorDaVez = 2;
					}else {
						jogadorDaVez = 1;
					}

					while (escolhaJogadorDaVez<1 || escolhaJogadorDaVez>9) {
						System.out.println("");
						System.out.println("Jogador " +jogadorDaVez+ " , é sua vez! Escolha uma posição: (1 a 9)");
						escolhaJogadorDaVez = scan.nextByte();
					}
					
					++numeroDaJogada;
					
					switch (escolhaJogadorDaVez) {
					case 1:
						if (jogadorDaVez == 1) {
							tabuleiro[2][0] = "O";
						}else {
							tabuleiro[2][0] = "X";
						}
						break;
					case 2:
						if (jogadorDaVez == 1) {
							tabuleiro[2][1] = "O";
						}else {
							tabuleiro[2][1] = "X";
						}
						break;
					case 3:
						if (jogadorDaVez == 1) {
							tabuleiro[2][2] = "O";
						}else {
							tabuleiro[2][2] = "X";
						}
						break;
					case 4:
						if (jogadorDaVez == 1) {
							tabuleiro[1][0] = "O";
						}else {
							tabuleiro[1][0] = "X";
						}
						break;
					case 5:
						if (jogadorDaVez == 1) {
							tabuleiro[1][1] = "O";
						}else {
							tabuleiro[1][1] = "X";
						}
						break;
					case 6:
						if (jogadorDaVez == 1) {
							tabuleiro[1][2] = "O";
						}else {
							tabuleiro[1][2] = "X";
						}
						break;
					case 7:
						if (jogadorDaVez == 1) {
							tabuleiro[0][0] = "O";
						}else {
							tabuleiro[0][0] = "X";
						}
						break;
					case 8:
						if (jogadorDaVez == 1) {
							tabuleiro[0][1] = "O";
						}else {
							tabuleiro[0][1] = "X";
						}
						break;
					case 9:
						if (jogadorDaVez == 1) {
							tabuleiro[0][2] = "O";
						}else {
							tabuleiro[0][2] = "X";
						}
						break;

					}// fim switch
					// atualiza tabuleiro, imprime tabuleiro na tela e testa ganhador
					System.out.println("  "+tabuleiro[0][0]+" | "+tabuleiro[0][1]+" | "+tabuleiro[0][2]+" ");
					System.out.println(" -----------");
					System.out.println("  "+tabuleiro[1][0]+" | "+tabuleiro[1][1]+" | "+tabuleiro[1][2]+" ");
					System.out.println(" -----------");
					System.out.println("  "+tabuleiro[2][0]+" | "+tabuleiro[2][1]+" | "+tabuleiro[2][2]+" ");
					System.out.println("");
					
					// testa caso de vitória
					// testa linha completa
					if ((tabuleiro[0][0]=="X" && tabuleiro[0][1]=="X" && tabuleiro[0][2]=="X") || (tabuleiro[0][0]=="O" && tabuleiro[0][1]=="O" && tabuleiro[0][2]=="O")) {
						vencedor = jogadorDaVez;
						houveUmVitorioso = true;
					}
					
					if ((tabuleiro[1][0]=="X" && tabuleiro[1][1]=="X" && tabuleiro[1][2]=="X") || (tabuleiro[1][0]=="O" && tabuleiro[1][1]=="O" && tabuleiro[1][2]=="O")) {
						vencedor = jogadorDaVez;
						houveUmVitorioso = true;
					}
					if ((tabuleiro[2][0]=="X" && tabuleiro[2][1]=="X" && tabuleiro[2][2]=="X") || (tabuleiro[2][0]=="O" && tabuleiro[2][1]=="O" && tabuleiro[2][2]=="O")) {
						vencedor = jogadorDaVez;
						houveUmVitorioso = true;
					}
					
					// testa diagonal completa
					if ((tabuleiro[0][0]=="X" && tabuleiro[1][1]=="X" && tabuleiro[2][2]=="X") || (tabuleiro[0][0]=="O" && tabuleiro[1][1]=="O" && tabuleiro[2][2]=="O")) {
						vencedor = jogadorDaVez;
						houveUmVitorioso = true;
					}
					if ((tabuleiro[0][2]=="X" && tabuleiro[1][1]=="X" && tabuleiro[2][0]=="X") || (tabuleiro[0][2]=="O" && tabuleiro[1][1]=="O" && tabuleiro[2][0]=="O")) {
						vencedor = jogadorDaVez;
						houveUmVitorioso = true;
					}
					
					// testa coluna completa
					if ((tabuleiro[0][0]=="X" && tabuleiro[1][0]=="X" && tabuleiro[2][2]=="X") || (tabuleiro[0][0]=="O" && tabuleiro[1][0]=="O" && tabuleiro[2][2]=="O")) {
						vencedor = jogadorDaVez;
						houveUmVitorioso = true;
					}
					
					if ((tabuleiro[0][1]=="X" && tabuleiro[1][1]=="X" && tabuleiro[2][1]=="X") || (tabuleiro[0][1]=="O" && tabuleiro[1][1]=="O" && tabuleiro[2][1]=="O")) {
						vencedor = jogadorDaVez;
						houveUmVitorioso = true;
					}
					
					if ((tabuleiro[0][2]=="X" && tabuleiro[1][2]=="X" && tabuleiro[2][2]=="X") || (tabuleiro[0][2]=="O" && tabuleiro[1][2]=="O" && tabuleiro[2][2]=="O")) {
						vencedor = jogadorDaVez;
						houveUmVitorioso = true;
					}
					
					if (numeroDaJogada>9) {
						semVencedor=true;
						houveUmVitorioso = true;
					}


				}// while nao houver um vitoriosoe
				
				if (semVencedor=true) {
					System.out.println("Não houve vencedor!/n");
				}else {
					System.out.println("O Vencedor foi: "+vencedor);
				}

				
			}else {
				if (opcao == 3) {
					System.out.println("OK, Saido do jogo!");
				}
				
			}


		}
		
	}//2o  public

}// 1o public


