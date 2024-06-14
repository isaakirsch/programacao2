package aula19;

public class Conta {
    String titular;
    String identificador;
    String senha;
    float saldo;

    void definirTitular(String nome){
        titular = nome;
    }
    String definirIdentificador(String identificador){
        return identificador;
    }
    String definirSenha(String senha){
        return senha;
    }
    void depositar(float valor){
        saldo+=valor;
    }
    boolean validarAcesso(String identificador, String senha){
        return this.identificador.equals(identificador) && this.senha.equals(senha);
    }
    String saldo(){
        return String.format("Seu saldo é de R$%.2f", saldo);
    }
    boolean sacar(float valor){
        if (saldo>=valor){
            saldo-=valor;
            return true;
        }
        return false;
    }
}
