package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // PRATICA 4 //
        Produto produto2 = new Produto(002, "Melancia");
        Produto produto3 = new Produto(003, "Abacaxi");

        Pessoa cliente1 = new Pessoa();

        Compra compra2 = new Compra();

        Scanner scan = new Scanner(System.in);

        String nome;
        int idd, cnh;

        System.out.println("Bem vindo! Para realizar uma compra precisamos de um cadastro:");
        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.println("Idade");
        idd = scan.nextInt();
        System.out.println("CNH");
        cnh = scan.nextInt();

        cliente1.setNome(nome);
        cliente1.setIdade(idd);
        cliente1.setCnh(cnh);

        System.out.println("Selecione o produto que deseja comprar: ");
        System.out.println("002 - Melancia");
        System.out.println("003 - Abacaxi");
        int codigo = scan.nextInt();

        switch (codigo) {
            case 002:
                System.out.println("Voce escolheu o produto Melancia.");
                break;
            case 003:
                System.out.println("Voce escolheu o produto Abacaxi.");
                break;
            default:
                System.out.println("Codigo inexistente, tente novamente!");
        }

        compra2.comprar();







//        Pessoa lucas = new Pessoa();
//        Endereco lucasEnd = new Endereco("Av. ueue", 5, "SR", "SP");
//        Compra compra1 = new Compra();
//        Produto produto1 = new Produto(001, "Pera");
//
//        // ATRIBUINDO VALORES PESSOA E ENDERECO //
//        lucas.setNome("Lucax");
//        lucas.setIdade(25);
//        lucas.setCnh(797987);
//        lucas.setEndereco(lucasEnd);
//
//        // ATRIBUINDO VALOR AO PRODUTO E COMPRA //
//        produto1.setNome("Pera");
//        produto1.setCodigo(001);
//        compra1.setPessoa(lucas);
//
//        // ACESSANDO VALORES PESSOA E ENDERECO //
//        System.out.println("O nome do cliente e: " + lucas.getNome());
//        System.out.println("Idade: " + lucas.getIdade());
//        System.out.println("Documento CNH: " + lucas.getCnh());
//        System.out.println("Endereco: " + lucas.getEndereco().getLogradouro() + " " + lucas.getEndereco().getNumero() + " " + lucas.getEndereco().getEstado());
//
//        // ACESSANDO VALORES PRODUTO E COMPRA //
//        System.out.println("\n \n O nome do cliente: " + lucas.getNome() + " documento " + lucas.getCnh());
//        System.out.println("Cliente: " + lucas.getNome() + " " + produto1.getNome());
//
//        // !!! Questao do enunciado: Sera possivel comprar usando o metodo comprar, passando como parametro dois objetos  //
//        //                               um do tipo Pessoa e o outro do tipo Produto???                                   //



    }
}
