package Capitulo2;

public class Exercicio15 {
    public static void main(String[] args) {

        int mes = 7;
        int ano = 2000;
        int dias = 0;

        switch (mes){
            case 1:
                dias = 31;
                break;
            case 2:
                if (((ano % 4 ==0) && !(ano % 100 == 0)) || (ano % 400 == 0))
                    dias = 29;
                else
                    dias = 28;
                break;
            case 3:
                dias = 31;
                break;
            case 4:
                dias = 30;
                break;
            case 5:
                dias = 31;
                break;
            case 6:
                dias = 30;
                break;
            case 7:
                dias = 31;
                break;
            case 8:
                dias = 31;
                break;
            case 9:
                dias = 30;
                break;
            case 10:
                dias = 31;
                break;
            case 11:
                dias = 30;
                break;
            case 12:
                dias = 31;
                break;
        }

        System.out.println("Numero de dias = " + dias);

    }
}
