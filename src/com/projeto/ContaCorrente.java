package com.projeto;

public class ContaCorrente extends Conta {

    public void mostrarExtrato(){
        super.mostrarExtratosComuns();
        System.out.println("Saldo da conta corrente: " + super.saldo + "\n");
    }
}
