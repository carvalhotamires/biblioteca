package com.biblioteca.biblioteca.modelo;

import com.biblioteca.biblioteca.interfaces.Emprestavel;

public class Livro extends ItemBiblioteca implements Emprestavel {
    // ... Atributos e Construtor existentes ...
    private String autor;
    private int numPaginas;

    // Atributos de controle de Emprestimo
    private boolean emprestado = false;
    private Usuario usuarioEmprestimo; // Composição/Agregação fraca

    // Construtor já existente
    public Livro(String titulo, int anoPublicacao, String autor, int numPaginas) {
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }


    @Override
    public void exibirDetalhes() {
        // ... (implementação anterior)
    }

    // Implementação da Interface
    @Override
    public void emprestar(Usuario usuario) {
        if (!emprestado) {
            this.emprestado = true;
            this.usuarioEmprestimo = usuario;
            System.out.println("\nLivro '" + getTitulo() + "' emprestado para: " + usuario.getNome());
        } else {
            System.out.println("\nERRO: Livro já está emprestado para " + this.usuarioEmprestimo.getNome());
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            this.emprestado = false;
            this.usuarioEmprestimo = null;
            System.out.println("Livro '" + getTitulo() + "' devolvido com sucesso.");
        } else {
            System.out.println("ERRO: Livro não estava emprestado.");
        }
    }

    @Override
    public boolean estaEmprestado() {
        return this.emprestado;
    }
}