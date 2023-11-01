import java.util.Scanner;

public class caixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializando arrays para armazenar dados da conta
        String[] numerosContas = new String[10];
        String[] nomesTitulares = new String[10];
        double[] saldos = new double[10];

        int opcao;
        do {
            System.out.println("Bem-vindo ao Caixa Eletrônico!");
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Encerrar Programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();


        } while (opcao != 5);
    }



    }