package br.com.Atividade2;

import java.util.Scanner;
// Atividade 1
public class Soma {

    protected int num1;
    protected int num2;
    protected int soma;

    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public Soma() {
        
    }
    
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        this.setNum1(scanner.nextInt());
        
        System.out.print("Digite o segundo número inteiro: ");
        this.setNum2 (scanner.nextInt());

        this.setSoma(this.getNum1() + this.getNum2());

        System.out.println("A soma dos números é: " + this.getSoma());

        scanner.close();
    }

}
