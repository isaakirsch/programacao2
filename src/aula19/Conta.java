/*Crie a classe conta e seus métodos  e a classe banco. Nessa classe crie opções para o usuário realizar as operações
bancárias possíveis usando a classe Conta.
String titular;
String identificador;
String senha;
float saldo;

depositar(float valor)
boolean sacar(float valor)
String verificarSaldo()

Criar conta
Acessar conta
    Depositar
    Sacar
    Verificar saldo
    Sair
Sair
*/

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
