package com.loiane.cursojava.aula24;

public class CriaLivro {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.nome = "Nome do livro";
		livro.autor = "Mauro";
		livro.qtdPaginas = 1000;
		
		System.out.println("Nome: " +livro.nome+ " - Autor: "+livro.autor+" Quantidade de páginas: " +livro.qtdPaginas);

	}

}
