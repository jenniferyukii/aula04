package aula04ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        double valor;
        int qtde;
        double porcentagem;

        System.out.println("Nome do produto --> ");
        nome = sc.next();
        System.out.println("Valor do produto --> ");
        valor = sc.nextDouble();
        System.out.println("Quantidade inicial no estoque --> ");
        qtde = sc.nextInt();
        Produto p = new Produto(nome,valor,qtde);

        //porcentagem para aumentar o valor do produto
        System.out.println("Qual a porcentagem de aumento? ");
        porcentagem = sc.nextDouble();

        p.aumentoValor(10);
        System.out.println(p.valor);
    }
}
