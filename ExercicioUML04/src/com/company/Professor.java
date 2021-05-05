package com.company;

import java.util.Scanner;

public class Professor {
    private String nome;
    private String curso;
    private int cpf;
    private double salario;
    private int listaDeAlunos;
    private double valorAula = 29.00;

    public Professor() {
    }

    public Professor(String nome, String curso, int cpf, double salario, int listaDeAlunos) {
        this.nome = nome;
        this.curso = curso;
        this.cpf = cpf;
        this.salario = salario;
        this.listaDeAlunos = listaDeAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(int listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public void salarioProf() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantas aulas voce ministra? ");
        int aulasMinistradas = scan.nextInt();
        double sala = valorAula * aulasMinistradas;
        System.out.print("O salario total do professor e: " + sala);
    }
}
