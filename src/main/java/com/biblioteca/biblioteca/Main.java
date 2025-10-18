package com.biblioteca.biblioteca;
import com.biblioteca.biblioteca.modelo.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
    System.out.println("--- DEMONSTRAÇÃO DE POO: BIBLIOTECA SIMPLES ---");

    // ----------------------------------------------------
    // 1. DEMONSTRAÇÃO DE COMPOSIÇÃO (REL. TEM-UM) E CONSTRUTORES
    // ----------------------------------------------------
    System.out.println("\n[1. COMPOSIÇÃO]");

    // Objeto Endereco criado com Construtor
    Endereco endUsuario = new Endereco("Rua das Oliveiras, 123", "João Pessoa");

    // Objeto Usuario criado com Construtor, usando o Endereco (Composição)
    Usuario usuario1 = new Usuario("Maria Silva", 1001, endUsuario);
    Usuario usuario2 = new Usuario("João Santos", 1002, new Endereco("Av. Central, 45", "Cabedelo"));

    usuario1.exibirDados();
    usuario2.exibirDados();


    System.out.println("\n[2. HERANÇA E POLIMORFISMO]");

    // Criação de objetos das classes filhas (Livro e Revista)
    Livro livro1 = new Livro("A Bússola de Ouro", 2005, "Philip Pullman", 400);
    Revista revista1 = new Revista("National Geographic", 2024, 250, "NatGeo Editora");

    // Lista de objetos do TIPO DA CLASSE BASE (ItemBiblioteca)
    List<ItemBiblioteca> acervo = new ArrayList<>();
    acervo.add(livro1);
    acervo.add(revista1);


    for (ItemBiblioteca item : acervo) {
        item.exibirDetalhes();
    }


    System.out.println("\n[3. INTERFACE]");

    // O Livro implementa a interface Emprestavel.
    System.out.println("O Livro está emprestado? " + livro1.estaEmprestado());

    // Chamando métodos definidos pela Interface
    livro1.emprestar(usuario1); // Sucesso
    livro1.emprestar(usuario2); // Erro: já está emprestado (lógica interna do Livro)

    // Devolução
    livro1.devolver();
    System.out.println("O Livro está emprestado? " + livro1.estaEmprestado());

    // Emprestando novamente
    livro1.emprestar(usuario2);
}
}