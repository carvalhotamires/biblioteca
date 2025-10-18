package com.biblioteca.biblioteca.modelo;

public class Revista extends ItemBiblioteca {
    // Encapsulamento
    private int edicao;
    private String editora;

    // Construtor
    public Revista(String titulo, int anoPublicacao, int edicao, String editora) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
        this.editora = editora;
    }

    // Polimorfismo: Sobrescrita do método da classe base
    @Override
    public void exibirDetalhes() {
        System.out.println("--- Revista ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Editora: " + this.editora);
        System.out.println("Ano: " + getAnoPublicacao());
        System.out.println("Edição N°: " + this.edicao);
    }

    // Getters
    public String getEditora() {
        return editora;
    }
}