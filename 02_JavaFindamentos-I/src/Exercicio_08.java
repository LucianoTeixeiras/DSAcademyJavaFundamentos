package Capitulo2;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = reader.nextInt();

        if (idade <= 0) {
            System.out.println("Idade invalida");
            System.out.println("Tente novamente");
        }else if (idade < 16)
                    System.out.println("Nao pode votar");
            else if (idade < 18)
                        System.out.println("Voto opcional");
                else if (idade < 65)
                            System.out.println("Voto obrigatorio");
                    else System.out.println("Votot opcional");

    }
}
