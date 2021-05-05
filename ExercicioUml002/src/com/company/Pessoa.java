package com.company;

public class Pessoa {
    // ATRIBUINDO VALORES A VARIAVEIS //
    private String nome;
    private int idade;
    private int cnh;
    private Endereco endereco;

    // CONSTRUTORES //

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, int cnh) {
        this.nome = nome;
        this.idade = idade;
        this.cnh = cnh;
    }

    public void verInfos() {
        System.out.println("--------------------------");
        System.out.println("O nome e: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CNH: " + getCnh());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("-------------------------");
    }

    public Pessoa(Endereco endereco) {
        this.endereco = endereco;
    }

    // METODOS ACESSORES - GETTERS E SETTERS //
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // CRIANDO OS METODOS DA CLASSE //
    public void consultaEndereco(String Endereco) {

    }

    public void consultaNome(String nome) {

    }

}
