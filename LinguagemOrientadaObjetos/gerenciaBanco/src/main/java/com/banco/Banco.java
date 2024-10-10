package gerenciaBanco.src.main.java.com.banco;

import java.util.Scanner;

public class Banco {
    private String name;
    private String sobrenome;
    private String cpf;
    private double saldo;

    public Banco() {
        this.saldo = 0.0;
    }

    public void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        this.name = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        this.sobrenome = scanner.nextLine();

        System.out.print("Digite seu CPF: ");
        this.cpf = scanner.nextLine();

        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é: " + this.saldo);
    }

    public void depositar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do deposito: ");
        double deposito = scanner.nextDouble();
        this.saldo += deposito;
        System.out.println("Deposito realizado com sucesso!");
    }

    public void sacar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do saque: ");
        double saque = scanner.nextDouble();

        if (this.saldo >= saque) {
            this.saldo -= saque;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
