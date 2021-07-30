package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> lista = new ArrayList<>();

    public void adicionar(T num){
        lista.add(num);
    }
    public T getPrimeiroElemento(){

        if(lista.isEmpty()){
           throw new IllegalArgumentException("Lista Esta Vazia");
        }else{

            return lista.get(0);
        }
    }

    public void listar() throws IllegalAccessException {
        if(!lista.isEmpty()){
            //devo imprimir pelo menos o elemento zero pois é menor que o tamanho da lista.
            System.out.print("[ ");
            System.out.print(lista.get(0));

            for(int i=1; i<lista.size(); i++){

                System.out.print(", " + lista.get(i));

            }
            System.out.print(" ]");
        }else{
            throw new IllegalAccessException("Lista Está vazia para Ser Listada...");
        }

    }


}
