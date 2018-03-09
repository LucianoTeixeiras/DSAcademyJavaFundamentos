package Capitulo3;

public class Exercicio_04 {
    public static void main(String[] args) {
        // Cada elemento do array é outro array
        // Ou seja, temos arrays de arrays para representar uma matriz

        int[][] matriz;
        matriz = new int[3][4];
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++)
                matriz[i][j] = i + j;
        }

        // Inicializando a matriz
        int[][] matriz2 = {{10,20}, {30,40,50}};
        int numeroCinquena = matriz2[1][2];
        System.out.println(numeroCinquena);
    }
}
