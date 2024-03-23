package br.com.Atividade2;

import java.util.Scanner;

public class Retangulo extends Executar {
   
    protected double base;
    protected double altura;
    protected double perimetro;
    protected double area;
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }
    
    public void setArea(double area) {
        this.area = area;
    }

    public Retangulo() {
    }

    public Retangulo(double base, double altura, double perimetro, double area) {
        this.base = base;
        this.altura = altura;
        this.perimetro = perimetro;
        this.area = area;
    }

    @Override
    public void executar() {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a base do triângulo: ");
        this.setBase(scanner.nextDouble());

        System.out.print("Digite a altura do triângulo: ");
        this.setAltura(scanner.nextDouble());

        this.setPerimetro(this.getBase() + this.getAltura());

        this.setArea(this.getBase() * this.getAltura());

        System.out.println("O perímetro do triângulo é igual a: " + this.getPerimetro());
        System.out.println("A área do triângulo é igual a: " + this.getArea());
        
        scanner.close();
        
    }

    
}
