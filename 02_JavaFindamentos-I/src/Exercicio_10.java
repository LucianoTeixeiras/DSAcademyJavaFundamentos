package Capitulo2;

public class Exercicio_10 {
    public static void main(String[] args) {
        int idade = 70;
        float preco = 200;

        if (idade >= 60){
            float precoComDesconto = preco / 100 * 90;
            System.out.println("Desconte de " + (preco - precoComDesconto));
            preco = precoComDesconto;
        }

        exibirPrecoFinal(preco);

    }

    private static void exibirPrecoFinal(float paramPreco) {
        System.out.println("Preco final e : " + paramPreco);
    }
}
