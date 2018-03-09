package Capitulo2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //Fazer import da classe java.util.Scanner

        Scanner reader = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = reader.nextInt();

        if (idade < 0)
            System.out.println("Idade Invalida");
        else
            System.out.println("Ok, faltam " + (100 - idade) + " para voce chegar aos 100 anos!!!");
    }
}
