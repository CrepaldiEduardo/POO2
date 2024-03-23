package br.com.Atividade2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsumoCombustivel extends Executar {

    protected double tempo;
    protected double velocidade;
    protected double distancia;
    protected double litros;
    
    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getLitros() {
        return litros;
    }
    
    public void setLitros(double litros) {
        this.litros = litros;
    }

    public ConsumoCombustivel() {
    }

    public ConsumoCombustivel(double tempo, double velocidade, double distancia, double litros) {
        this.tempo = tempo;
        this.velocidade = velocidade;
        this.distancia = distancia;
        this.litros = litros;
    }

    @Override
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tempo percorrido durante a viagem (em horas): ");
        this.setTempo(scanner.nextDouble());

        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        this.setVelocidade(scanner.nextDouble());

        Double temp = (this.getTempo()) * (this.getVelocidade());
        System.out.println("temp = " + temp);
        this.setDistancia(temp);

        this.setLitros((this.getDistancia() / 12));

        DecimalFormat formato = new DecimalFormat("#.###");
        this.litros = Double.valueOf(formato.format(getLitros()));
        
        System.out.println("A distância percorrida é: " + this.getDistancia() + "km" + " e a quantidade de litros consumidos na viagem foi de: " + this.getLitros() + "L");

        scanner.close();
        
    }

    
}
