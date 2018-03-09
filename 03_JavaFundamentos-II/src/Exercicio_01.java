package Capitulo3;

public class Exercicio_01 {
    public static void main(String[] args) {

        // Problema: armazenar varios valores do mesmo tipo
        // double salario = 123.0, salario2 = 456.0, salario3 = 789.0;

        // Declarando um array de strings
        double[] salarios;

        // Instanciando um array de 5 Posicoes
        // Importante: uma vez que o tamanho e definido, ele nao podera ser alterado
        salarios = new double[5];

        // Esrevendo em uma posicao do aaray
        salarios[3] = 1000;
        salarios[4] = 2000;

        // Linha abaixo na funciona, indice devera ser inteiro
        // salarios[3.4] = "Everton";

        // Linha abaixo dara erro, extrapola os limites do array
        //salarios[5] = 2000;

        // Iterando para escrever em um array
        // Primeira posicao do array é 0

        for (int i = 0; i < salarios.length; i++) {
            salarios[i] = 1000 * 1;
        }

        // Iterando e acumulando o valor de todos os salarios
        double totalSalarios = 0;
        for (double salario : salarios) {
            totalSalarios += salario;
        }
        double mediaSalarios = totalSalarios / salarios.length;
        System.out.println(String.format("Media salarial: %f", mediaSalarios));

    }
}
