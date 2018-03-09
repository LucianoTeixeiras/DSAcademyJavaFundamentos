package Capitulo3;

public class Exercicio_05 {
    public static void main(String[] args) {
        // Obtém uma lista de números, soma e executa

        int total = 0;
        for (String arg : args){
            total += Integer.parseInt(arg);
        }

        System.out.println("Quantidade de parâmeros: " + args.length);
        System.out.println("Total: " + total);

        //System.out.println("Média: " + total / args.length);
    }
}
