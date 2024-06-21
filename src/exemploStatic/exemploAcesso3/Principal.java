package exemploStatic.exemploAcesso3;

public class Principal {
    public static void main(String[] args){
        aula20.exemploStatic.exemploAcesso3.Conta c1 = new aula20.exemploStatic.exemploAcesso3.Conta("Ana", "123", 10);
        System.out.println("Conta cadastrada com ID: "+c1.identificador);
        aula20.exemploStatic.exemploAcesso3.Conta c2 = new aula20.exemploStatic.exemploAcesso3.Conta("José","345",100);
        System.out.println("Conta cadastrada com id: "+c2.identificador);
        //c1.saldo = 0;

    }
}




        /*testando o atributo estático
        c1.nomeBanco = "Banco CIMOL";
        System.out.println("Nome do banco c1 "+c1.nomeBanco);
        System.out.println("Nome do banco c2 "+c2.nomeBanco);
        acesso diretamente pela Classe, já que é um atributo estatico
        Conta.nomeBanco = "Teste";
        System.out.println("Nome do banco c1 "+c1.nomeBanco);
        System.out.println("Nome do banco c2 "+c2.nomeBanco);*/