import java.io.*;
import java.util.Scanner;

public class caixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializando arrays para armazenar dados da conta
        String[] numerosContas = new String[100];
        String[] nomesTitulares = new String[100];
        double[] saldos = new double[100];

        // Carregar dados a partir do arquivo "contas.txt" (leitura)
        carregarDados(numerosContas, nomesTitulares, saldos);

        int opcao;
        do {
            System.out.println("Bem-vindo ao Caixa Eletrônico!");
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Realizar Depósito");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Realizar Saque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarConta(scanner, numerosContas, nomesTitulares, saldos);
                    break;
                case 2:
                    depositar(scanner, numerosContas, saldos);
                    break;
                case 3:
                    consultarSaldo(scanner, saldos);
                    break;
                case 4:
                    sacar(scanner, saldos);
                    break;
                case 5:
                    salvarDados(numerosContas, nomesTitulares, saldos);
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private static void cadastrarConta(Scanner scanner, String[] numerosContas, String[] nomesTitulares, double[] saldos) {
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nome do titular: ");
        String nomeTitular = scanner.nextLine();
        System.out.println("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        saldos[numeroConta] = saldoInicial;
        numerosContas[numeroConta] = Integer.toString(numeroConta);
        nomesTitulares[numeroConta] = nomeTitular;
        System.out.println("Conta cadastrada com sucesso!");
    }

    private static void depositar(Scanner scanner, String[] numerosContas, double[] saldos) {
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Digite o valor do depósito: ");
        double valorDeposito = scanner.nextDouble();
        saldos[numeroConta] += valorDeposito;
        System.out.println("Depósito realizado com sucesso.");
    }

    private static void consultarSaldo(Scanner scanner, double[] saldos) {
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        double saldo = saldos[numeroConta];
        System.out.println("Saldo da conta " + numeroConta + ": " + saldo);
    }

    private static void sacar(Scanner scanner, double[] saldos) {
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Digite o valor do saque: ");
        double valorSaque = scanner.nextDouble();
        if (saldos[numeroConta] >= valorSaque) {
            saldos[numeroConta] -= valorSaque;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    private static void salvarDados(String[] numerosContas, String[] nomesTitulares, double[] saldos) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("contas.txt"));
            for (int i = 0; i < numerosContas.length; i++) {
                if (numerosContas[i] != null) {
                    String line = numerosContas[i] + "," + nomesTitulares[i] + "," + saldos[i];
                    writer.write(line);
                    writer.newLine();
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados das contas.");
        }
    }

    private static void carregarDados(String[] numerosContas, String[] nomesTitulares, double[] saldos) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("contas.txt"));
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                numerosContas[i] = parts[0];
                nomesTitulares[i] = parts[1];
                saldos[i] = Double.parseDouble(parts[2]);
                i++;
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Arquivo de dados não encontrado. Criando novo arquivo.");
        }
    }

}
