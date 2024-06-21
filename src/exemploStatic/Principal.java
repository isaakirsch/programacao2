package exemploStatic;

public class Principal {
    public static void main(String[] args){
        Conta c1 = new Conta("Ana", "123", 10);
        System.out.println("Conta cadastrada com ID: "+c1.getIdentificador());
        Conta c2 = new Conta("José","345",100);
        System.out.println("Conta cadastrada com id: "+c2.getIdentificador());
        c1.depositar(100);
        c1.sacar(10);
        System.out.println(c1.saldo());
        //c1.identificador = "teste";
    }
} /*testando o atributo estático
        c1.nomeBanco = "Banco CIMOL";
        System.out.println("Nome do banco c1 "+c1.nomeBanco);
        System.out.println("Nome do banco c2 "+c2.nomeBanco);
        //acesso diretamente pela Classe, já que é um atributo estatico
        Conta.nomeBanco = "Teste";
        System.out.println("Nome do banco c1 "+c1.nomeBanco);
        System.out.println("Nome do banco c2 "+c2.nomeBanco);*/