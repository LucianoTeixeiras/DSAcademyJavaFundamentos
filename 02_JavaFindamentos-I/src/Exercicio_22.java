package Capitulo2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio_22 {
    public static void main(String[] args) {
        //Data no Java e representada como numero (long)
        //que indica quantos milissegundos se passaram desde 01/01/1970

        Date dataAtual = new Date(); //obtem a data atual
        System.out.println(dataAtual.getTime());
        System.out.println(dataAtual);

        Date outraData = new Date(0);
        System.out.println(outraData);

        outraData.setTime(2352525235L);
        System.out.println(outraData);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(dataAtual));

        SimpleDateFormat sdf2 = new SimpleDateFormat("D");
        System.out.println(sdf2.format(dataAtual));

        //Consulte mais possibilidade de formatações em:
        //http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

        System.out.println(dataAtual.after(outraData));
        System.out.println(dataAtual.before(outraData));
    }
}
