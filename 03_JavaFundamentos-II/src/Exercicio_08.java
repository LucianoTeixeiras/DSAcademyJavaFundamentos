package Capitulo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Vamos dividir 2 numeros...");

        try {
            System.out.println("Digite o primeiro numero...");
            int num1 = reader.nextInt();

            System.out.println("Digite o segundo numero...");
            int num2 = reader.nextInt();

            int resultado = 0;

            resultado = num1 / num2;
            System.out.println("O Resultado e: " + resultado);
        } catch (ArithmeticException ae) {
            System.out.println("Ocorreu um erro Aritmético!!!");
        } catch (InputMismatchException ime) {
            System.out.println("Argumento inválido!!!");
        } finally {
            System.out.println("Bloco Final");
        }
    }
}
