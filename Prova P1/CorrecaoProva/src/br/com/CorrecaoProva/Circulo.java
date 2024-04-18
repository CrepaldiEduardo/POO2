package br.com.CorrecaoProva;

public class Circulo extends BaseFigura implements IComum {
    
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }


    @Override
    public String toString() {
        return "Circulo [cor=" + cor + ", raio=" + raio + "]";
    }

    @Override
    public double getArea() {
        return raio * 3.14 * 2;
    }

    

    
}
