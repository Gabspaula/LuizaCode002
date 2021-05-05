package com.company;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno() {
    }

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void calcularMedia() {
        double notaFinal = this.nota1 + this.nota2 / 2;
        System.out.println("A nota final da alunx " + getNome() + " foi de " + notaFinal);
        boolean aprovOuReprov = notaFinal >= 7;
        if (aprovOuReprov == true) {
            System.out.println("Parabens alunx " + getNome() + " voce foi aprovado!");
        } else {
            System.out.println("Voce ainda nao chegou la =(");
        }

    }
}
