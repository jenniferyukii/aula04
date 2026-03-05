package aula04ex02;

public class SenhaAtendimento {

    String paciente;
    int senha;
    static int controle = 100;
    //não vai pra dentro do objeto

    public SenhaAtendimento(String paciente){
        this.paciente = paciente;
        this.senha = controle;
        controle++;
    }

    public String getDados(){
        return "Paciente: " + paciente + " | Senha: # " + senha;
        //return paciente + "" + senha;
    }

}
