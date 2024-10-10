package gerenciaBanco.src.main.java.com.banco;

import java.util.Scanner;

public class GerenciaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("=== Menu do Banco ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Consultar Saldo");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Cadastrar Cliente
                    banco.cadastrarCliente();
                    break;
                case 2: // Consultar Saldo
                    banco.consultarSaldo();
                    break;
                case 3: // Depositar
                    banco.depositar();
                    break;
                case 4: // Sacar
                    banco.sacar();
                    break;
                case 5: // Sair
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
        scanner.close();
    }
}
