package Capitulo3;

import java.io.*;

public class Exercicio_10 {
    public static void imprimeArquivo(String nomeArquivo) throws IOException {

        FileInputStream fis = new FileInputStream(nomeArquivo);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line = null;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

    }

    public static void main(String[] args) {

        try {
            imprimeArquivo("src/Capitulo3/Exercicio_00.java");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro!!!");
            e.printStackTrace();
        }

    }
}