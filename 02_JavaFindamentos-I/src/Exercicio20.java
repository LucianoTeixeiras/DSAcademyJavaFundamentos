package Capitulo2;

import java.util.Date;

public class Exercicio20 {
    public static void main(String[] args) {
        String msg;
        String curso = "Java Fundamentos";
        double valorCurso = 123.456789;

        // Passando 1 String como argumeno
        msg = String.format("Bem-vindo ao curso %s da DSA", curso);

        // Passando 1 String e um int como argumeno
        msg = String.format("Bem-vindo ao curso %s da DSA. Teremos %d videos", curso, 200);

        // Passando 1 String e um double como argumeno
        msg = String.format("Valor do curso %s: %f", curso, valorCurso);
        msg = String.format("Valor do curso %s: %.2f", curso, valorCurso);

        Date dataAtual = new Date();
        msg = String.format("Hoje e %tD", dataAtual);

        System.out.println(msg);
    }
}
