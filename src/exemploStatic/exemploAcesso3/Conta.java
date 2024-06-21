package exemploStatic.exemploAcesso3;

import java.util.Random;

public class Conta {
    String titular;
    String identificador;
    String senha;
    private float saldo;

    static String  nomeBanco;
    Conta(String titular, String senha, float deposito){
        this.titular = titular;
        this.senha = senha;
        saldo = deposito;
        geraIdentificador();
    }
    void definirTitular(String nome){
        titular = nome;
    }
    String definirIdentificador(String identificador){
        return identificador;
    }
    String definirSenha(String senha){
        return senha;
    }
    public void depositar(float valor){
        saldo+=valor;
    }

    void geraIdentificador() {
        Random aleatorio = new Random();
        String identificador = "";
        for (int i = 0; i < 4; i++) {
            identificador += (char) aleatorio.nextInt(65, 90);
        }
        identificador += aleatorio.nextInt(1000, 2000);
        this.identificador = identificador;
    }
        boolean validarAcesso(String identificador, String senha){
            return this.identificador.equals(identificador) && this.senha.equals(senha);
        }
        String saldo(){
            return String.format("Seu saldo é de R$%.2f", saldo);
        }
        public boolean sacar(float valor){
            if (saldo>=valor){
                saldo-=valor;
                return true;
            }
            return false;
        }
}
