package Capitulo3;

import java.util.Arrays;
import java.util.Random;

public class Exercicio_03 {
    public static void main(String[] args) {
        Random rn = new Random();

        int[] array1 = new int[100000];
        int[] array2 = new int[100000];

        for (int i = 0; i < array1.length ; i++) {
            //Alimenta a posicao do array com o valor enre 0 e 99

            array1 [i] = rn.nextInt(100);
            array2 [i] = array1[i];
        }

        long inicioTarefa = System.currentTimeMillis();
        Arrays.sort(array1);
        long fimTarefa = System.currentTimeMillis();
        System.out.println("Ordenação do Array1: " + (fimTarefa - inicioTarefa));

        inicioTarefa = System.currentTimeMillis();
        Arrays.parallelSort(array2);
        fimTarefa = System.currentTimeMillis();
        System.out.println("Ordenaão do Array2: " + (fimTarefa - inicioTarefa));

    }
}
