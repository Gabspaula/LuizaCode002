package com.company;

import javax.print.DocFlavor;

public class Compra {
    private Pessoa pessoa;
    private Produto produto;

    public Compra () {

    }

    public Compra(Pessoa pessoa, Produto produto) {
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String comprar() {
        System.out.println(getPessoa().getNome() + " " + getProduto().getNome());
        return null;
    }

    public void verificarCompra(String s) {
        System.out.println("Cliente: " + this.getPessoa().getNome() + this.getProduto().getNome());
    }
}
