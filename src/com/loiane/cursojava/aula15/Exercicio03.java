package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		String s;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite F para sexo Feminino ou M para sexo Masculino");
		s = scan.next();
		System.out.println(s);
//		usando o if else

		if (s.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		}else if (s.equalsIgnoreCase("m")){
			System.out.println("Masculino");
		}else { System.out.println("Entrada inválida");
		
		}
		
//		usando o switch
		
//		switch (s) {
//		case "f":
//		case "F":
//			System.out.println("Feminino");
//			break;
//		
//		case "m":
//		case "M":
//			System.out.println("Masculino");
//			break;
//			
//		default:
//			System.out.println("Entrada inválida");
//			break;
//		}
		
	}

}
