package Capitulo2;

public class Exercicio_18 {
    public static void main(String[] args) {

        /*
            Utilizado para substituir if...else,
            podendo tornar o codigo mais limpo.

            O operador condicional e o ounico operador ternario do Java
         */

        int nota1 = 6, nota2 = 7;

        float media = (nota1 + nota2) / 2;

        /*

        if (media < 6)
            System.out.println("Reprovado");
        else
            System.out.println("Aprovado");

         */

        String situacao = ((nota1 + nota2)/2 >= 6) ? "Aprovado" : "Reprovado";
        System.out.println(situacao);

    }
}
