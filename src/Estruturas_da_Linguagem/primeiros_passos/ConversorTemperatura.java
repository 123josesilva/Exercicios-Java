package Estruturas_da_Linguagem.primeiros_passos;
import java.util.Scanner;

// Escreva um programa que converta uma temperatura de Celsius para Fahrenheit e vice-versa.
public class ConversorTemperatura {
    // ((x*9)/5)+32
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá");
        System.out.println("Digite 1 para converter de Celsius para Fahrenheit");
        System.out.print("Digite 2 para converter de Fahrenheit para Celsius:");
        String inputMenu = scanner.next();
        Number intOptionMenu = parseNumber(inputMenu);
        if (intOptionMenu.intValue() == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            String userInput = scanner.next();
            Number c = parseNumber(userInput);
            System.out.print("Temperatura em Fahrenheit: ");
            System.out.print(toFahrenheit(c));
        } else if (intOptionMenu.intValue() == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            String userInput = scanner.next();
            Number f = parseNumber(userInput);
            System.out.print("Temperatura em Celsius: ");
            System.out.println(toCelsius(f));
        }

        scanner.close();
    }

    public static Number parseNumber(String userInput) throws NumberFormatException {
        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            return Float.parseFloat(userInput);
        }
    }

    public static Number toFahrenheit(Number c) {
        Number f = ((c.floatValue() * 9) / 5) + 32;
        return f;
    }

    public static Number toCelsius(Number c) {
        Number celsius = ((c.floatValue() - 32) * 5) / 9;
        return celsius;
    }
}
