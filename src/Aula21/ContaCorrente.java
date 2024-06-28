package Aula21;

public class ContaCorrente extends Conta{
    private float limite;
    public ContaCorrente (String titular, String senha, float limite){
        super (titular, senha);
        this.limite = limite;
    }

    boolean sacar(float valor){
        if (saldo>=valor){
            saldo-=valor;
            return true;
        }
        return false;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public String verificaSaldo(){
        String retorno = String.format("Seu saldo é de R$%.2f", saldo);
        if(saldo>=0)
            retorno+=String.format("Limite disponível %.2f", limite);
        else
            retorno+=String.format("Limite disponível %.2f", limite+saldo);
        return retorno;
    }
}