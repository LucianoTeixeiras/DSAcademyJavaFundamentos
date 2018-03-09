package Capitulo2;

import java.lang.management.OperatingSystemMXBean;

public class Exercicio19 {

    public static void main(String[] args) {
        // 1 para soma
        // 2 para subracao
        // 3 para multiplicacao
        // 4 para divisao
        calcular(10, TipoOperacao.DIVISAO,2);
    }

    private static void calcular(int operando1, TipoOperacao tipoOperacao, int operando2) {
        if(tipoOperacao == TipoOperacao.ADICAO)
            System.out.println(operando1 + operando2);
        else if (tipoOperacao == TipoOperacao.SUBTRACAO)
            System.out.println(operando1 - operando2);
        else if (tipoOperacao == TipoOperacao.MULIPLICACAO)
            System.out.println(operando1 * operando2);
        else if (tipoOperacao == TipoOperacao.DIVISAO)
            System.out.println(operando1 / operando2);
        else
            System.out.println("Operacao invalida");
    }

    enum TipoOperacao{
        ADICAO, SUBTRACAO, MULIPLICACAO, DIVISAO
    }
}
