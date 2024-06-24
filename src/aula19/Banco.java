package aula19;

import java.util.Random;
import java.util.Scanner;

public class Banco {
        public static void main(String[] args){
            Scanner ler = new Scanner(System.in);
            Conta conta = new Conta();

                System.out.println("Banco");
                System.out.println("-----------------------");
                System.out.println("Selecione uma opção: ");
                System.out.println("1- Criar conta");
                System.out.println("2- Entrar na conta");
                System.out.println("3- Sair");
                System.out.println("-----------------------");


                System.out.print("Digite o nome do titular da conta: ");
                String titular = ler.next();
                System.out.println("Qual o deposito inicial: ");
                float valor = ler.nextFloat();
                System.out.print("Digite a sua senha da conta: ");
                String senha = ler.next();

            conta.titular = titular;
            conta.identificador = "conta"+new Random().nextInt(1000,10000);
            conta.depositar(valor);
            conta.senha = senha;
            System.out.println("Conta cadastrada obteve o id: "+conta.identificador);
            //acessando a conta
            System.out.println("Digite a senha: ");
            senha = ler.next();
            System.out.println("Digite o identificador: ");
            String identificador = ler.next();
            if(conta.validarAcesso(identificador,senha)){
                char opc;
                do{
                    System.out.println("Selecione uma opção: ");
                    System.out.println(" v - verificar saldo");
                    System.out.println(" d - depositar");
                    System.out.println(" s- sacar");
                    System.out.println(" e - sair");
                    opc = ler.next().toLowerCase().charAt(0);
                    switch (opc){
                        case 'v' -> System.out.println(conta.saldo());
                        case 'd' -> {
                            System.out.println("Qual valor deseja depositar: ");
                            valor = ler.nextFloat();
                            conta.depositar(valor);
                            System.out.println("Deposito Realizado!");
                        }
                        case 's' -> {
                            System.out.println("Qual valor deseja depositar: ");
                            valor = ler.nextFloat();
                            if(conta.sacar(valor)){
                                System.out.println("Saque realizado!");
                            }
                            else
                                System.out.println("Saldo insuficiente!");
                        }
                    }
                }
                while (opc!= 'e');
            }
        }
}
