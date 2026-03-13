package com.mycompany.sem03.list;
import java.util.Scanner;
import Classes.Musica;

public class Ex12 {
   public static int imprimeMenu(){
       Scanner ler = new Scanner(System.in);
       
       System.out.print("------------------------------");
       System.out.print("O que deseja fazer");
       System.out.print("------------------------------");
       System.out.print("1 - Adicionar Musica");
       System.out.print("2 - Remover Musica");
       System.out.print("3 - Pesquisar Muisica pelo titulo");
       System.out.print("------------------------------");
       System.out.println("Escolha uma opcao:");
       return ler.nextInt();
   }
}
