package Capitulo3;

public class Exercicio_00 {
    public static void main(String[] args) {

        // Boolean para String
        String flag = String.valueOf(true);

        // int para string
        String idadeEmString = String.valueOf(10);

        // float para String
        String salarioEmSring = String.valueOf(1234.56);

        // array de caracteres para String
        char[] arrayChar = {'D', 'S', 'A'};
        String nome = String.valueOf(arrayChar);

        // String para int
        int idade = Integer.parseInt("10");

        // String para float
        float salario = Float.parseFloat("123.45");

        // String para Double
        double salarioMuitoGrande = Double.parseDouble("123456.78");

        int salarioTruncado = (int) 12345.67F;

        // Um int pode receber um shor? Sim
        short meuShort = 10;
        int meuInteiro = meuShort;

        // Um short pode receber um inteiro? Nao
        //meuInteiro = 2000000000;
        //meuShort = meuInteiro;

        // E se quisermos fazer uma conversao explicita?
        meuInteiro = 2000000000;
        meuShort = (short) meuInteiro;
        System.out.println(meuShort);
    }
}
