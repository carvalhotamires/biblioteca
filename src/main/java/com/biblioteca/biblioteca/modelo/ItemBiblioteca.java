package com.biblioteca.biblioteca.modelo;

public abstract class ItemBiblioteca {
    // Encapsulamento: Atributos privados
    private String titulo;
    private int anoPublicacao;

    // Construtor
    public ItemBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }


    public abstract void exibirDetalhes();

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}