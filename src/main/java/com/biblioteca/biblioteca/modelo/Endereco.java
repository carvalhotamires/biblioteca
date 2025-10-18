package com.biblioteca.biblioteca.modelo;

public class Endereco {
    // Encapsulamento
    private String rua;
    private String cidade;

    // Construtor
    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    // Método de utilidade
    public String getEnderecoCompleto() {
        return this.rua + ", " + this.cidade;
    }


}