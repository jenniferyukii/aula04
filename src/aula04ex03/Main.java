package aula04ex03;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static BilheteUnico bilhete;

    static {
        System.out.println("Nome do usuário ---> ");
        String nome = sc.nextLine();
        System.out.println("Tipo de tarifa ---> (Professor - Estudante - Comum) ");
        String tipoTarifa = sc.nextLine();
        bilhete = new BilheteUnico(nome, tipoTarifa);
        //instanciando o objeto
        //bloco static
        //static nao pertence a nenhum objeto
    }

    public static void main(String[] args) {
        int opcao;
        //variavel local nao tem valor
        do {
            System.out.println("***********************");
            System.out.println(" 1. Carregar bilhete");
            System.out.println(" 2. Consultar Saldo");
            System.out.println(" 3. Passar na catraca");
            System.out.println(" 4. Finalizar");
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> carregarBilhete();
                case 2 -> consultarSaldo();
                case 3 -> passarNaCatraca();
                case 4 -> System.out.println("Obrigado por usar o nosso APP");
                default -> System.out.println("Opção inválida");
            }

        } while(opcao !=4);
    }

    private static void consultarSaldo() {
        System.out.println("Saldo atual : R$ " + bilhete.saldo);
    }

    private static void carregarBilhete() {
        double valor;
        System.out.println("Valor para carregar o bilhete --> R$ ");
        valor = sc.nextDouble();
        bilhete.carregar(valor);
    }

    private static void passarNaCatraca() {
        if(bilhete.passarNaCatraca()==false){
            System.out.println("Saldo insuficiente");
        }
        consultarSaldo();
    }

}
