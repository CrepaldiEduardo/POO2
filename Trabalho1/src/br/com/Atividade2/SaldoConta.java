package br.com.Atividade2;

import java.util.Scanner;

public class SaldoConta extends Executar {
    
    protected double saldo;
    protected double saldoReajuste;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoReajuste() {
        return saldoReajuste;
    }

    public void setSaldoReajuste(double saldoReajuste) {
        this.saldoReajuste = saldoReajuste;
    }

    public SaldoConta() {
    }

    public SaldoConta(double saldo, double saldoReajuste) {
        this.saldo = saldo;
        this.saldoReajuste = saldoReajuste;
    }

    @Override
    public void executar() {

        Scanner scanner = new Scanner(System.in);
            
        System.out.print("Digite o saldo atual da conta poupança: ");
        this.setSaldo(scanner.nextDouble());
    
        this.setSaldoReajuste((this.getSaldo() * 2 / 100) + this.getSaldo());
            
        System.out.println("O novo da poupança agora é: " + this.getSaldoReajuste());
            
        scanner.close();
        
    }

}
