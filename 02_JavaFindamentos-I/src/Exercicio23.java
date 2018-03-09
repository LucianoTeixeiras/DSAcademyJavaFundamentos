package Capitulo2;

import java.util.Calendar;
import java.util.Date;

public class Exercicio23 {
    public static void main(String[] args) {
        //Obtendo um instancia de um calendario

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        cal.setTime(new Date());

        int dia = cal.get(Calendar.DATE);
        int mes = cal.get(Calendar.MONTH)+1;
        int ano = cal.get(Calendar.YEAR);

        System.out.println(dia + "/" + mes + "/" + ano);

        //Alterar o ano de uma data (da mesma forma outros campos podem ser manipulados)
        cal.set(Calendar.YEAR,2018);
        System.out.println(cal.toInstant().toString());

        //Manipular datas
        cal.add(Calendar.MONTH, 1);
        cal.add(Calendar.DATE, -7);
        System.out.println(cal.toInstant().toString());

        Calendar outroCal = Calendar.getInstance();
        System.out.println(outroCal.after(cal));

        /*
            Recomendações:

            Para Java 8 ou superior utilize classes do pacote java.time
            http://www.oracle.com/technetwork/articles/java/jf14-fate-time-2125367.htm

            Para Java 7 ou inferior utilize Joda Time
            http://www.joda.org/joda-time/
        */
    }
}
