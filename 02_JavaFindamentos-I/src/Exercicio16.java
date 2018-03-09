package Capitulo2;

public class Exercicio16 {
    public static void main(String[] args) {

        int mes = 7;
        int ano = 2000;
        int dias = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                if (((ano % 4 == 0) && !(ano % 100 == 0)) || (ano % 400 == 0))
                    dias = 29;
                else
                    dias = 28;
                break;
        }

        System.out.println("Numero de dias = " + dias);

    }
}
