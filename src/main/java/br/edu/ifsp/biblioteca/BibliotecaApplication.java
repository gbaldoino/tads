package br.edu.ifsp.biblioteca;

import br.edu.ifsp.biblioteca.domain.Livro;

public class BibliotecaApplication {

    public static void main(String[] args) {

        Livro livro = new Livro(
            1L,
            "9788508145607",
            "Dom Casmurro",
            2026
        );

        Livro livro2 = new Livro(
            2L,
            "9788508145021",
            "Dom Quixote",
            2022
    );

        Livro livro3 = new Livro(
            3L,
            "9788508142222",
            "A Saga Crepúsculo",
            2011
        );

        System.out.println(livro3);
    }
}
