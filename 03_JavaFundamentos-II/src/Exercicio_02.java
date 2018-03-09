package Capitulo3;

import java.util.Arrays;

public class Exercicio_02 {
    public static void main(String[] args) {
        // Inicializando os valores de um array na sua inicializacao

        String[] nomes = {"Daniel", "Higor", "Suemar"};
        int[] idades = {10, 20, 30};

        //Preenche os valores de um array
        Arrays.fill(idades, 10);
        idades[0] = 30;
        idades[1] = 10;
        idades[2] = 20;

        //Realizando uma Busca Linear
        int numeroProcurar = 20;
        boolean achou = false;
        for(int idade : idades){
            if(idade == numeroProcurar){
                achou = true;
                break;
            }
        }
        System.out.println("O Numero " + numeroProcurar + " esta na lista? " + achou);

        //Ordenando o Array
        Arrays.sort(idades);

        // Fazendo uma busca binaria no array
        // Para a busca binaria funcionar, o array precisa estar ordenado

        int pontoInsercao = Arrays.binarySearch(idades, 20);
        System.out.println(pontoInsercao);

        //Imprimindo todos os elementos do array
        for (int idade : idades){
            System.out.println(idade);
        }

    }
}
