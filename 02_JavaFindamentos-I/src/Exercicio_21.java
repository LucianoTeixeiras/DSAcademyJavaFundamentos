package Capitulo2;

public class Exercicio_21 {
    public static void main(String[] args) {

        //Obtendo um caracer de um String em ma posicao especifica
        String anoherPalindrome = "Niagara. O roar again";
        char aChar = anoherPalindrome.charAt(9);
        System.out.println(aChar);

        //Obtendo uma Sub-string de uma String
        String roar = anoherPalindrome.substring(11, 15);
        System.out.println(roar);

        //Separando conteudo de uma string
        String nomes = "Joao,Jose,Maria,Roberto,Silvia";
        String[] arrayNomes = nomes.split(",");
        for (String nome : arrayNomes)
            System.out.println(nome);

        //Obtendo o comprimento de uma String
        //Lembrando que o indice inicial (posicao do promeiro caractere e 0)
        System.out.println(String.format("%s, tem %d letras.", anoherPalindrome, anoherPalindrome.length()));

        //Convertendo para maiusculo
        System.out.println("dsa e incrivel!!!".toUpperCase());

        //Procurando a primeira ocorrencia de uma substring dentro de um string
        int primeiraOcorrencia = anoherPalindrome.indexOf("ga");
        System.out.println(primeiraOcorrencia);

        //Procurando a ultima ocorrencia de uma substring dentro de um string
        int ultimaOcorrencia = anoherPalindrome.lastIndexOf("ga");
        System.out.println(ultimaOcorrencia);

        //Verificando se uma String possui uma substring
        //Retorno de metodo contains é booleano (Verdadeiro ou Falso)
        System.out.println("DSA é incrível".contains("é"));
        System.out.println("DSA é incrível".contains("curso ruin"));

        //Substituindo caracteres e realizando encadeamento
        String frase = "seja-bem-vindo-ao-curso-de-java-fundamentos"
                .replace('-',' ')
                .replaceAll(" ","  ")
                .replaceFirst("ja","JA");

        System.out.println(frase);
    }
}
