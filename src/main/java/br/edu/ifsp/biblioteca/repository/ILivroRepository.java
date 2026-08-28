package br.edu.ifsp.biblioteca.repository;

import br.edu.ifsp.biblioteca.domain.Livro;

import java.util.List;
import java.util.Optional;

public interface ILivroRepository {
    //inteface define contrato que toda classe que a implente deve a implemntar, contrato = método
    //definição de regras
    //serve pra armazenar itens, coisas (tipo livro)

    public Livro salvar (Livro livro);

    List<Livro> listarTodos();

    Optional<Livro> buscarPorId (Long id);

    Optional <Livro> buscarPorIsbn (String isbn);

    List<Livro> buscarPorTitulo(String titulo);
}
