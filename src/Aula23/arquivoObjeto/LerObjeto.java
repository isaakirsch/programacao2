package Aula23.arquivoObjeto;

import java.io.*;

public class LerObjeto {
    public static void main(String[] args) {
        File caminho = new File("C:\\Users\\kirsc\\Documents\\aula23");
        File arquivo = new File(caminho,"pessoas.db");
        try{
            ObjectInputStream arquivoObj =
                    new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
            Pessoa[] lista = (Pessoa[]) arquivoObj.readObject();
            int cont = 0;
            Pessoa p;
            do{
                p=lista[cont];
                if(p!=null)
                    cont++;
            }
            while(p!=null);
            //mostrando as pessoas
            for(int i = 0; i < cont; i++)
                System.out.println(lista[i]);
            arquivoObj.close();
        }
        catch (IOException e){
            System.out.println("Erro ao ler o arquivo");
        }
        catch (ClassNotFoundException e){
            System.out.println("Classe não encontrada");
        }
    }
}

