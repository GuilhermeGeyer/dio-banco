package com.projeto;

public class ContaPoupanca extends Conta {

    public void mostrarExtrato(){
        super.mostrarExtratosComuns();
        System.out.println("Saldo da conta poupança: " + super.saldo + "\n");
    }
}
