package Capitulo3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exercicio_09 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/Exercicio_10.java");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!!!");
            e.printStackTrace();
        }
    }
}