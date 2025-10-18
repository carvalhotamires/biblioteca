package com.biblioteca.biblioteca.modelo;

public class Usuario {
    // Encapsulamento
    private String nome;
    private int matricula;

    // Composição: Relação "tem-um" Endereco
    private Endereco endereco;

    // Construtor
    public Usuario(String nome, int matricula, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco; // Objeto Endereco passado na construção
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome + " (Matrícula: " + this.matricula + ")");
        System.out.println("Mora em: " + this.endereco.getEnderecoCompleto());
    }

    // Getters
    public String getNome() {
        return nome;
    }
}