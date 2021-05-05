package com.company;

public class ContaCorrente extends Conta {
    private double limite = 100;

    public ContaCorrente(double saldo) {
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor) {
        double saldoComLimite = this.getSaldo() + limite;
        if ((saldoComLimite - valor) >= 0) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Transacao nao pode ser realizada pois ultrapassa o limite de R$100, seu saldo atual e de " + getSaldo());
        }
        return false;
    }
}