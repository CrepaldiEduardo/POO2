package br.com.Atividade2;

import java.util.Scanner;

public class MediaAritmetica extends Executar {

    protected double V1;
    protected double V2;
    protected double V3;

    public double getV1() {
        return V1;
    }

    public void setV1(double v1) {
        V1 = v1;
    }

    public double getV2() {
        return V2;
    }

    public void setV2(double v2) {
        V2 = v2;
    }

    public double getV3() {
        return V3;
    }

    public void setV3(double v3) {
        V3 = v3;
    }

    public MediaAritmetica() {
    }

    public MediaAritmetica(int v1, int v2, int v3) {
        V1 = v1;
        V2 = v2;
        V3 = v3;
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double V1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        double V2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        double V3 = scanner.nextInt();

        double media = (V1 + V2 + V3) / 3;

        System.out.println("A média aritmética dos números é: " + media);

        scanner.close();
    }



    
}
