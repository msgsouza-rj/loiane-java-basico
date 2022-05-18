package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em qual turno vc estuda, M-matutino, V-verpertino ou N-notruno?");
		
		String turno;
		turno = scan.next();
		
		if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia!");
			
		}else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa Tarde!");
			
		}else if (turno.equalsIgnoreCase("n")){
			System.out.println("Boa Noite!");

		}else {
			System.out.println("Entrada Inválida!");

		}

	}

}
