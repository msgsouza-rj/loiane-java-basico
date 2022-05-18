package com.loiane.cursojava.aula24;

import java.util.Date;

public class CriaLivroBiblioteca {

	public static void main(String[] args) {
		LivroBiblioteca livroB = new LivroBiblioteca();
		livroB.nome = "Nome do livro";
		livroB.autor = "Mauro";
		livroB.qtdPaginas = 1000;
		
		livroB.emprestado = true;
		livroB.dataEntrega = new Date();
		livroB.emprestadoA = "Seu Zé";
		

		System.out.println("Nome: " +livroB.nome+ " - Autor: "+livroB.autor+" Quantidade de páginas: " +livroB.qtdPaginas);


	}

}
