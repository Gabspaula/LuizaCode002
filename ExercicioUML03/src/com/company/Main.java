package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Crie tres objetos Pessoa e para cada, crie uma conta //

        Conta conta01 = new Conta(7878, "Joana", 1000.00, "CP");
        Conta conta02 = new Conta(1212, "Pedro", 100.00, "CC");
        Conta conta03 = new Conta(5656, "Alison", 500.00, "CC");

        Pessoa pessoa01 = new Pessoa("Joana", "123456", "Av. aiai", conta01);
        Pessoa pessoa02 = new Pessoa("Pedro", "789456", "Av. ueue", conta02);
        Pessoa pessoa03 = new Pessoa("Alison", "456123", "Av. obobob", conta03);


        System.out.println(pessoa01.getNome() + " " + conta01.getSaldo());

        // Faca operacoes de sacar e transferir dinheiro entre essas contas //
        System.out.println("Ola Joana!");
        boolean p1saca = pessoa01.getConta().sacar(50);
        if (p1saca == true) {
            System.out.println("Saque realizado com sucesso! Seu saldo atual e de: " + pessoa01.getConta().getSaldo() + "\n");
        } else {
            System.out.println("Saldo indisponivel! \n");
        }

        // P2 realiza saque //
        System.out.println("Ola Pedro! Qual o valor a ser sacado? ");
        double valor = scan.nextDouble();
        boolean p2saca = pessoa02.getConta().sacar(valor);
        if (p2saca == true) {
            System.out.print("Saque realizado com sucesso! Seu saldo atual e de: " + pessoa02.getConta().getSaldo() + "\n");
        } else {
            System.out.print("Saldo indisponivel! Seu saldo atual e de: " + pessoa02.getConta().getSaldo() + "\n");
        }

        // P3 transfere para P1 //
        System.out.println("\nOla Alison!");
        System.out.print("Qual o valor a ser transferido?");
        double transferencia = scan.nextDouble();
        boolean p3saca = pessoa03.getConta().sacar(transferencia);
        if (p3saca == true) {
            System.out.println("Transferencia realizada com sucesso!");
            pessoa01.getConta().transferencia(transferencia);
        } else {
            System.out.println("Saldo indisponivel!");
        }

        // Saldo final das contas //
        System.out.println("\nSaldo de Joana " + pessoa01.getConta().getSaldo());
        System.out.println("Saldo de Pedro " + pessoa02.getConta().getSaldo());
        System.out.println("Saldo de Alison " + pessoa03.getConta().getSaldo());

        // Exercicio 9 - Conta Corrente, saldo 100 //
        // Corrigir retorno apos limite //
        System.out.println("\n \nParte da Conta Corrente");
        ContaCorrente tipoCC = new ContaCorrente(pessoa02.getConta().getSaldo());
        tipoCC.setDono(pessoa02.getNome());
        tipoCC.setSaldo(100);

        System.out.println("Nome do cliente: " + pessoa02.getNome());
        System.out.println("Saldo atual em conta: " + tipoCC.getSaldo());
        System.out.println("Valor a ser sacado: " + tipoCC.sacar(250));
        System.out.println("Saldo apos saque: " + tipoCC.getSaldo());

    }
}
