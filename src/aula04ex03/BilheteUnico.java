package aula04ex03;

import java.util.Random;

public class BilheteUnico {

    int numeroBilhete;
    String nome;
    double saldo;
    String tipoTarifa;
    final static double TARIFABASE = 5.40;

    public BilheteUnico(String nome, String tipoTarifa) {
        Random random = new Random();
        this.nome = nome;
        this.tipoTarifa = tipoTarifa;
        this.numeroBilhete = random.nextInt(1000, 9999);
    }

    public boolean passarNaCatraca() {
        double valor = TARIFABASE;
        boolean status = false;
        if (tipoTarifa.equalsIgnoreCase("Estudante") ||
                tipoTarifa.equalsIgnoreCase("Professor")) {
            valor = valor / 2;
        }
        if (saldo < valor) {
            return false;
        }
        saldo = saldo - valor;
        return status;
    }

    public void carregar(double valor) {
        this.saldo += valor;
    }
}
