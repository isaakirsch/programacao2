package Aula22.exemploFinal;

public class Operacoes {
    //atributo com o modificador final precisam ser inicializados, caso não seja
    //a inicialização deve ocorrer até o final do construtor
    final double valor;

    //para criar uma constante ela deve ser estática e final ao mesmo tempo
    //acesso global -> public
    //disponível diretamente na classe -> static
    //inalteravel -> final
    public static final double PI = 3.141592653589793;

    public Operacoes(){
        valor = 10;
    }
}
