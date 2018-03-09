package Capitulo2;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Tabuada de qual numero?");
        int num = reader.nextInt();

        /*
        Para o comando FOR, especificar:
        1) Variavel de controle
        2) Criterio de continuacao
        2) Incremento (ou decremento) da variavel de controle
        */

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }

        for (int i = 10; i >= 0 ; i--) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
