package br.com.Atividade2;

import java.util.Scanner;

public class SucessorAntecessor {

    protected int numero;
    protected int sucessor;
    protected int antecessor;
   
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSucessor() {
        return sucessor;
    }

    public void setSucessor(int sucessor) {
        this.sucessor = sucessor;
    }

    public int getAntecessor() {
        return antecessor;
    }
    
    public void setAntecessor(int antecessor) {
        this.antecessor = antecessor;
    }

    public SucessorAntecessor() {
    }

    public SucessorAntecessor(int numero, int sucessor, int antecessor) {
        this.numero = numero;
        this.sucessor = sucessor;
        this.antecessor = antecessor;
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        this.setNumero(scanner.nextInt());

        this.setAntecessor(this.getNumero() - 1);

        this.setSucessor(this.getNumero() + 1);

        System.out.println("O seu antecessor é: " + this.getAntecessor());
        System.out.println("O seu sucessor é: " + this.getSucessor());
        
        scanner.close();
    }

}
