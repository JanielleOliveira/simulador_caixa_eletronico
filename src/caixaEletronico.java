import java.util.Scanner;

public class caixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializando arrays para armazenar dados da conta
        String[] numerosContas = new String[100];
        String[] nomesTitulares = new String[100];
        double[] saldos = new double[100];


        int opcao;
        do { // Inicia um loop que mantém o programa em execução
            System.out.println("Bem-vindo ao Caixa Eletrônico!"); // Exibe um cabeçalho
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Realizar Depósito");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Realizar Saque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: "); // Exibe as opções do menu e solicita uma escolha

            opcao = scanner.nextInt(); // Lê a escolha do usuário

            switch (opcao) { // Inicia um bloco de switch para lidar com a escolha do usuário
                case 1:
                    cadastrarConta(scanner, numerosContas, nomesTitulares, saldos);// Chama a função para cadastrar uma nova conta
                    break;
                case 2:
                    depositar(scanner, numerosContas, saldos);
                    break;
                case 3:
                    consultarSaldo(scanner, numerosContas, saldos);// Chama a função para consultar o saldo
                    break;
                case 4:
                    sacar(scanner, numerosContas, saldos);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");// Trata escolhas inválidas
            }

        } while (opcao != 5);


    }

    // Função para cadastrar uma conta
    private static void cadastrarConta(Scanner scanner, String[] numerosContas, String[] nomesTitulares, double[] saldos) {
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Nome do titular: ");
        scanner.next();
        System.out.println("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        saldos[numeroConta] = saldoInicial;  // Armazena o saldo inicial no array
        System.out.println("Conta cadastrada com sucesso!");
    }

    // Função para realizar um depósito
    private static void depositar(Scanner scanner, String[] numerosContas, double[] saldos) {
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Digite o valor do depósito: ");
        double valorDeposito = scanner.nextDouble();
        saldos[numeroConta] += valorDeposito; // Adiciona o valor do depósito ao saldo da conta
        System.out.println("Depósito realizado com sucesso.");
    }

    // Função para consultar o saldo
    private static void consultarSaldo(Scanner scanner, String[] numerosContas, double[] saldos) {
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        double saldo = saldos[numeroConta]; // Lê o saldo da conta a partir do array
        System.out.println("Saldo da conta " + numeroConta + ": " + saldo);
    }

    // Função para realizar um saque
    private static void sacar(Scanner scanner, String[] numerosContas, double[] saldos) {
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Digite o valor do saque: ");
        double valorSaque = scanner.nextDouble();
        if (saldos[numeroConta] >= valorSaque) { // Verifica se o saldo é suficiente
            saldos[numeroConta] -= valorSaque; // Subtrai o valor do saque do saldo da conta
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }


}
