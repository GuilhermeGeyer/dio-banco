package com.projeto;

public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        agencia = AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    protected void mostrarExtratosComuns(){
        System.out.println("=== Extrato bancário ===");
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da conta: " + this.numero);
    }

    protected void mostrarExtrato(){}

}
