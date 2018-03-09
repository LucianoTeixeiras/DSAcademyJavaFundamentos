package Capitulo2;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        int idade;

        /*Sempre executa o bloco de repeticao ao menos 1 vez, pois os teste esta no FINAL

        No caso da estrutura de repeticao WHILE o teste esta no inicio, portanto o bloco
        de repeticao pode nao ser executado dependendo da condicao
        */

        do {
            Scanner reader = new Scanner(System.in);
            System.out.println("Qual a sua idade?");
            idade = reader.nextInt();
        }
        while (idade < 0);

        System.out.println("Faltam " + (100 - idade) + " para voce chegar aos 100 anos");

    }
}

