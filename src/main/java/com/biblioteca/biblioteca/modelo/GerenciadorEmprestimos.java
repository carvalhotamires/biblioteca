package com.biblioteca.biblioteca.modelo;

import com.biblioteca.biblioteca.interfaces.Emprestavel;

public class GerenciadorEmprestimos {
    public void mostrarStatus(Emprestavel item) {
        System.out.println("Status do item: " +
                (item.estaEmprestado() ? "Emprestado" : "Disponível"));
    }
}
