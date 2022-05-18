package com.loiane.cursojava.aula24;

public class CriaLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoAbajour = true;
		lampada.tipoLuz = "Amarela";
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajour";
		lampada.tipos[1] = "Lampeões";

	}

}
