package com.mycompany.sem04.collections;
import Classes.Fila;
import java.util.LinkedList;
import java.util.Queue;


public class Ex01 {
    public static void main(String[] args){
        Queue<Fila> fila = new LinkedList<>();
        Fila c1 = new Fila("Cristian", "744.871.308-67", 19);
        Fila c2 = new Fila("Rubens", "325.654.159-31", 20);
        Fila c3 = new Fila("Oliveira", "048.066.454-43", 21);
        Fila c4 = new Fila("Carmo", "7955.631.815-10", 22);
        Fila c5 = new Fila("Osvaldo", "347.659.387-86", 23);
        
        fila.add(c1);
        fila.add(c2);
        fila.add(c3);
        fila.add(c4);
        fila.add(c5);
        
        while (!fila.isEmpty()) {
        Fila pessoa = fila.poll();
        Fila proximo = fila.peek();
        System.out.println("Atendendo: " + pessoa);
        System.out.println("Próximo: " + proximo);
}
    }
}
