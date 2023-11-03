import java.util.Scanner;

public class caixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializando arrays para armazenar dados da conta
        String[] numerosContas = new String[10];
        String[] nomesTitulares = new String[10];
        double[] saldos = new double[10];

        int opcao;
        do { // Inicia um loop que mantém o programa em execução
            System.out.println("Bem-vindo ao Caixa Eletrônico!"); // Exibe um cabeçalho
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Consultar Saldo");
            System.out.println("3. Realizar Depósito");
            System.out.println("4. Realizar Saque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: "); // Exibe as opções do menu e solicita uma escolha

            opcao = scanner.nextInt(); // Lê a escolha do usuário

        } while (opcao != 5);


    }
}