package com.loiane.cursojava.aula24;

public class CriaCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numeroDePassageiros = 15;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numeroDePassageiros);



	}

}
