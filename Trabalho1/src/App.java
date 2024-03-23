import java.util.Scanner;

import br.com.Atividade2.ConsumoCombustivel;
import br.com.Atividade2.ConversaoTemp;
import br.com.Atividade2.Executar;
import br.com.Atividade2.MediaAritmetica;
import br.com.Atividade2.Produto;
import br.com.Atividade2.Retangulo;
import br.com.Atividade2.SalarioFuncionario;
import br.com.Atividade2.SaldoConta;
import br.com.Atividade2.Cliente;
import br.com.Atividade2.Soma;
import br.com.Atividade2.SucessorAntecessor;

public class App{

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Produto");
        System.out.println("3 - Média Aritmética");
        System.out.println("4 - Sucessor/Antecessor");
        System.out.println("5 - Dados de Cliente");
        System.out.println("6 - Saldo da Conta");
        System.out.println("7 - Retângulo");
        System.out.println("8 - Saldo com reajuste");
        System.out.println("9 - Conversão de Temperatura");
        System.out.println("10 - Consumo de combustível");

        System.out.print("Digite o número correspondente à operação desejada: ");
        int operacao = scanner.nextInt();

        Executar executar = null;

        switch (operacao) {
            case 1:
                Soma exeSoma = new Soma();
                exeSoma.executar();
                break;
            case 2:
                Produto execProduto = new Produto();
                execProduto.executar();
                break;
            case 3:
                MediaAritmetica execMediaAritmetica = new MediaAritmetica();
                execMediaAritmetica.executar();
                break;
            case 4:
                SucessorAntecessor execSucessorAntecessor = new SucessorAntecessor();
                execSucessorAntecessor.executar();
                break;
            case 5:
                Cliente execCliente = new Cliente();
                execCliente.executar();
                break;
            case 6:
                SaldoConta exeSaldoConta = new SaldoConta();
                exeSaldoConta.executar();
                break;
            case 7:
                Retangulo execRetangulo = new Retangulo();
                execRetangulo.executar();
                break;
            case 8:
            SalarioFuncionario execSalarioFuncionario = new SalarioFuncionario();
                execSalarioFuncionario.executar();
                break;
            case 9:
                ConversaoTemp exexConversaoTemp = new ConversaoTemp();
                exexConversaoTemp.executar();
                break;
            case 10:
                ConsumoCombustivel execcConsumoCombustivel = new ConsumoCombustivel();
                execcConsumoCombustivel.executar();
                break;
            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
    
}
  
