package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class MetrosParaCentimetros {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("entre com comprimento em metros:");
		double metro = scan.nextDouble();
		double centimetro = metro * 100;
		System.out.println("" + metro + " metros corresponde a " + centimetro + " centímetros.");
		

	}

}
