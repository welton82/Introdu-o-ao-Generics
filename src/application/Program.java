package application;

import entities.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IllegalAccessException {

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a quantidde de Numeros deseja informar: ");
        Integer num = scan.nextInt();
        PrintService<String> p = new PrintService<>();
        try{

            for(int i = 1; i<=num; i++){
                System.out.print("Informe o Valor " + i + " Para Lista:");
                String v = scan.next();
                p.adicionar(v);
            }

            System.out.println("Primeiro Elemento da Lista: " + p.getPrimeiroElemento());
            System.out.print("Listando: " );
            p.listar();
        }catch (Exception e){
            e.getMessage();
        }

    }

}
