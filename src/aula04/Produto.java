package aula04;

public class Produto {

    String nome;
    double valor;
    int qtdeDisp;

    //void não retorna
    public Produto(String nome, double valor, int qtdeDisp){
        this.nome = nome;
        this.valor = valor;
        this.qtdeDisp = qtdeDisp;
    }

    //static em situações gerais
    public void aumentoValor(double perc){
        valor *= (1+perc)/100;
    }

}
