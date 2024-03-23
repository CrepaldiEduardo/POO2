package br.com.Atividade2;

import java.util.Scanner;

public class SalarioFuncionario extends Executar {
    
    protected double salarioAtual;
    protected double percentualReajuste;
    protected double reajuste;
    protected double novoSalario;
    
    public double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public double getPercentualReajuste() {
        return percentualReajuste;
    }

    public void setPercentualReajuste(double percentualReajuste) {
        this.percentualReajuste = percentualReajuste;
    }

    public double getReajuste() {
        return reajuste;
    }

    public void setReajuste(double reajuste) {
        this.reajuste = reajuste;
    }

    public double getNovoSalario() {
        return novoSalario;
    }
    
    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }

    public SalarioFuncionario() {
    }

    public SalarioFuncionario(double salarioAtual, double percentualReajuste, double reajuste, double novoSalario) {
        this.salarioAtual = salarioAtual;
        this.percentualReajuste = percentualReajuste;
        this.reajuste = reajuste;
        this.novoSalario = novoSalario;
    }

    @Override
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário atual do funcionário: ");
        this.setSalarioAtual(scanner.nextDouble());

        System.out.print("Digite o percentual de reajuste (em %): ");
        this.setReajuste((scanner.nextDouble()));

        this.setPercentualReajuste(this.getSalarioAtual() * (this.getReajuste() / 100));

        this.setNovoSalario(this.getPercentualReajuste() + this.getSalarioAtual());

        System.out.println("O novo salário do funcionário é: " + this.getNovoSalario());

        scanner.close();
        
    }
    


}
