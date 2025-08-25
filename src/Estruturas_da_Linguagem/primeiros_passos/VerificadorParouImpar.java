
// Solicite um número ao usuário e informe se ele é par ou ímpar.
import java.util.Scanner;

public class VerificadorParouImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor digite um numero: ");
        String userInput = scanner.nextLine();
        Number n1 = tratandoInput(userInput);

        if (n1 instanceof Integer) {
            if (n1.intValue() == 0) {
                System.out.println("INT =  O numero é par");
            } else {
                System.out.println("INT =  O numero é impar");
            }
        } else if (n1 instanceof Float) {
            if (n1.floatValue() == 0) {
                System.out.println("aqui só os float!!");
                System.out.println("O Numero é par!");
                System.out.println(n1);
            } else {
                System.out.println("aqui só os float!!");
                System.out.println("O numero é impar!");
            }
        }

        System.out.println(n1);
        scanner.close();
    }

    private static Number tratandoInput(String userInput) throws NumberFormatException {
        try {
            int n1 = Integer.parseInt(userInput);
            Number resposta = n1 % 2;
            return resposta;
        } catch (NumberFormatException e) {
            float n1 = Float.parseFloat(userInput);
            Number resposta = n1 % 2;
            return resposta;
        }

    }
}
