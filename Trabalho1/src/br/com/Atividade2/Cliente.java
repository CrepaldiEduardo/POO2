package br.com.Atividade2;

import java.util.Scanner;

public class Cliente {
    
    String nome;
    String endereco;
    String telefone;
    
    
    public Cliente() {
    }

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void ImprimirInfo(){

        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        this.setNome(scanner.nextLine());

        System.out.print("Digite o seu endereco: ");
        this.setEndereco(scanner.nextLine());

        System.out.print("Digite o seu telefone: ");
        this.setTelefone(scanner.nextLine());
       
        System.out.println("-----DADOS DO CLIENTE-----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Telefone: " + this.getTelefone());
        
        scanner.close();
    }
}
