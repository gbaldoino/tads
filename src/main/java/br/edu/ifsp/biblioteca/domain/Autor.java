package br.edu.ifsp.biblioteca.domain;

public class Autor {

    private Long id; //long minúsculo primitivo = 0, Long maiúsculo definido = null
    private String nome;

    public Autor(String nome) {
        //método construtor
        this.nome = nome;
    }

    public Long getId () {
        return this.id; //"pega" a informação private
    }
    public void setId(Long id) {
        this.id = id; //"altera" ou "implementa" a informação private
    }

    public String getNome () {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override  //Por padrão, toda classe em Java herda o método toString() original da
    // classe mãe Object. Se você não sobrescrever esse método, ao tentar imprimir o
    //  objeto no terminal, o Java vai exibir algo ilegível
    public String toString() {
        return this.nome;
        //imprime a mensagem de toString
    }
}
