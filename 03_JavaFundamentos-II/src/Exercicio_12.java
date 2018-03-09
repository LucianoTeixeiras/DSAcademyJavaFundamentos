package Capitulo3;

public class Exercicio_12 {
    private static int anosParaCompletar100Anos(int idade) {

        if (idade < 0)
            throw new IdadeMenorQue0Exception("Idade não pode ser negativa");
        if (idade > 100)
            throw new IdadeMaiorQue0Exception("Idade não pode maior que 100");

        return 100 - idade;
    }

    public static void main(String[] args) {

        try {
            int anosRestantes = anosParaCompletar100Anos(200);
            System.out.println("Faltam " + anosRestantes + "para você complear 100 anos!!!");
        } catch (IdadeMenorQue0Exception im0e) {
            System.out.println("Idade não pode ser negativa");
        } catch (IdadeMaiorQue0Exception im100e) {
            System.out.println("Idade não pode maior que 100");
        }

    }
}

class IdadeMaiorQue0Exception extends IllegalArgumentException {
    IdadeMaiorQue0Exception(String message) {
        super(message);
    }
}

class IdadeMenorQue0Exception extends IllegalArgumentException {
    IdadeMenorQue0Exception(String message) {
        super(message);
    }
}