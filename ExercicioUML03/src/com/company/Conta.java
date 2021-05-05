package com.company;

public class Conta {
    private int numero;
    private String dono;
    private double saldo;
    private String tipo;
    private double saque;


    public Conta() {
    }

    public Conta(int numero, String dono, double saldo, String tipo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    // Codigo limpo... Limpar todos os acessores que nao estao sendo usados //

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        if(valor <= this.saldo) {
            this.saldo = saldo - valor;
            return true;
        }
        return false;
    }

    public void transferencia(double valor) {
        this.saldo = saldo + valor;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
