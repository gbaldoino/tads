package br.edu.ifsp.biblioteca.repository;

import br.edu.ifsp.biblioteca.domain.Livro;

import java.util.*;

public class LivroRepositoryEmMemoria implements ILivroRepository {

    private final Map<Long, Livro> livros = new HashMap<>();
    //final não pode ser alterada
    private Long sequenciaId = 0L;

    @Override
    public Livro salvar(Livro livro) {

        if (livro.getId() == null) {
            this.sequenciaId++; // = this.sequenciaId + 1
            livro.setId(this.sequenciaId);
        }

        this.livros.put(livro.getId(), livro);

        return livro;
    }

    @Override
    public List<Livro> listarTodos() {
        return new ArrayList<>(this.livros.values());
    }

    @Override
    public Optional<Livro> buscarPorId(Long id) {

        return Optional.ofNullable(this.livros.get(id));

//        estrutura de dados diz que algo é opcional (if funcional)
//
//        Livro l = this.livros.get(id);
//        retun l == null ? Optional.empty()
//
//        if (l == null) {
//            return Optional.empty();
//        }
//
//        return Optional.of(l);
    }

    @Override
    public Optional<Livro> buscarPorIsbn(String isbn) {

        List <Livro> colecaoLivros = new ArrayList<> (this.livros.values());

//
//        for tradicional
//        for (int i = 0; i < colecaoLivros.size(); i++) {
//            Livro livro = colecaoLivros.get(i);
//        }

//        for each
        for (Livro livro : colecaoLivros) {
            if (livro != null && isbn.equals(livro.getIsbn())) {
            return Optional.of(livro);
            }
        }

        return Optional.empty();
    }



    @Override
    public List<Livro> buscarPorTitulo(String titulo) {

        if (titulo == null) {
            return new ArrayList<>();
        }

        List<Livro> resultado = new ArrayList<>();

        // for each
        for (Livro livro : this.livros.values()) {

            if (livro.getTitulo().contains(titulo)) {
                resultado.add((livro));
            }
        }

        return resultado;

    }




}
