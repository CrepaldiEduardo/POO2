package br.com.Atividade2;

import java.util.Scanner;

public class ConversaoTemp extends Executar{

    protected double celsius;
    protected double fahrenheit;

    
    public ConversaoTemp(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public ConversaoTemp() {
    }

    public static double Converter(double celsius) {
        return ((9 * celsius) + 160) / 5;
    }


    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = ((9 * celsius) + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + " °F");

        scanner.close();
    }
    
}
