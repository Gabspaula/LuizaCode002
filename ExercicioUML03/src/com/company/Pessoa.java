package com.company;

public class Pessoa {
    // ATRIBUINDO VALORES //
    private String nome;
    private String cpf;
    private String endereco;
    private Conta conta;

    // CONSTRUTORES //

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String endereco, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.conta = conta;
    }

    // GETTERS E SETTERS //
    // Codigo limpo... Limpar todos os acessores que nao estao sendo usados //

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void adicionarConta(Conta conta) {
        this.conta = conta;
    }

    public String verInfos() {
        System.out.println("------- DADOS DO CLIENTE -------");
        System.out.println("Nome: " + getNome());
        System.out.println("Documento: " + getCpf());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Numero da conta: " + getConta().getNumero());
        System.out.println("Tipo da conta: " + getConta().getTipo());
        return null;
    }

}
