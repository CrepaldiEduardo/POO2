import br.com.CorrecaoProva.Circulo;
import br.com.CorrecaoProva.Quadrado;
import br.com.CorrecaoProva.Retangulo;
import br.com.CorrecaoProva.Triangulo;


public class App {
    public static void main(String[] args) throws Exception {
         Quadrado quadrado = new Quadrado();
         quadrado.setCor("Roxo");
         quadrado.setLado1(4);
         Triangulo triangulo = new Triangulo(5, 12);
         Circulo circulo = new Circulo(10.2);
         Retangulo retangulo = new Retangulo(32, 12);
         System.out.println(quadrado);
         System.out.println("Base do Quadrado: " + quadrado.getArea());
         System.out.println(triangulo);
         System.out.println("Base do Quadrado: " + triangulo.getArea());
         System.out.println(circulo);
         System.out.println("Base do Quadrado: " + circulo.getArea());
         System.out.println(retangulo);
         System.out.println("Base do Quadrado: " + triangulo.getArea());

    }
}
