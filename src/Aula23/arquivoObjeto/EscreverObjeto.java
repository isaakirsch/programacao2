package Aula23.arquivoObjeto;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscreverObjeto {
    public static void main(String[] args){
        //objeto para manipular o caminho para o arquivo
        File caminho = new File("C:\\Users\\kirsc\\Documents\\aula23");
        //testando se o caminho existe
        if(caminho.exists()){
            System.out.println("A pasta existe");
        }
        else{
            //criando ele se não existir
            caminho.mkdirs();
            System.out.println("Caminho criado!");
        }
        //declarando o arquivo para salvar a Pessoa
        File arquivo = new File(caminho,"pessoas.db");
        //mostrar o caminho completo do arquivo
        System.out.println(arquivo.getAbsolutePath());
        try{
            ObjectOutputStream arquivoObj =
                    new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            //criando uma lista de pessoas
            Pessoa[] lista = new Pessoa[10];
            Scanner ler = new Scanner(System.in);
            String opc;
            int cont=0;
            do{
                System.out.println("Lendo informação da pessoa "+(cont+1));
                System.out.print("Qual o nome: ");
                String nome = ler.next();
                System.out.print("Qual o sobrenome: ");
                String sobrenome = ler.next();
                lista[cont] = new Pessoa();
                lista[cont].setNome(nome);
                lista[cont].setSobrenome(sobrenome);
                System.out.print("Tem mais pessoas (s - sim/ n - não): ");
                opc = ler.next().toLowerCase();
                cont++;
            }
            while(opc.equals("s"));

            //criar uma instancia de Pessoa
            //Pessoa p1 = new Pessoa();
           // p1.setNome("Jonas");
            //p1.setSobrenome("Silva");
            //gravar a pessoa no arquivo
            //arquivoObj.writeObject(p1);
            arquivoObj.writeObject(lista);
            //fechar o arquivo
            arquivoObj.close();
        }
        catch (IOException e){
            System.out.println("Erro ao criar o arquivo!");
        }
    }
}
