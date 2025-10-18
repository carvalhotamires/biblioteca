package com.biblioteca.biblioteca.interfaces;

import com.biblioteca.biblioteca.modelo.Usuario;

public interface Emprestavel {
    void emprestar(Usuario usuario);
    void devolver();
    boolean estaEmprestado();
}