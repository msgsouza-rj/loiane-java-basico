package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		String l;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com uma letra:");
		
		l = scan.next();
		
//		com if
//		if (l.equalsIgnoreCase("a") || l.equalsIgnoreCase("e") || l.equalsIgnoreCase("i")
//				|| l.equalsIgnoreCase("o") || l.equalsIgnoreCase("u")) {
//			System.out.println(l + " é uma vogal!");
//			
//		}else {
//			System.out.println(l + " é uma consoante!");
//		}
		
//		com Switch
//				
//		switch (l) {
//			
//		case "a":
//		case "e":
//		case "i":
//		case "o":
//		case "u":
//		case "A":
//		case "E":
//		case "I":
//		case "O":
//		case "U": System.out.println("Vogal!"); break;
//		default: System.out.println("Consoante!");
//			
//		}
		
//		com Switch e teste 
		
		if (l.length() >1) {
			System.out.println("Não é uma letra válida!");
		} else {
			switch (l) {
			
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("Vogal!"); break;
			default: System.out.println("Consoante!");
		}

	}

}
}
