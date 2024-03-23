package br.com.Atividade2;

import java.util.Scanner;

public class Produto extends Executar {
    protected int x;
    protected int y;
    protected int ResultProduto = x * y;
  
    public Produto(int x, int y, int resultProduto) {
        this.x = x;
        this.y = y;
        ResultProduto = resultProduto;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResultProduto() {
        return ResultProduto;
    }

    public void setResultProduto(int resultProduto) {
        ResultProduto = resultProduto;
    }

    public Produto() {
    }

    @Override
    public void executar() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        this.setX(scanner.nextInt());
        
        System.out.print("Digite o segundo número inteiro: ");
        this.setY(scanner.nextInt());
        
        this.setResultProduto(this.getX() * this.getY());
       
        System.out.println("O produto dos números é: " + this.getResultProduto());

        
        scanner.close();
        
    }

    
}
