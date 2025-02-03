import java.util.Scanner;

// Escreva um programa que converta uma temperatura de Celsius para Fahrenheit e vice-versa.
public class ConversorTemperatura {
    // ((x*9)/5)+32
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor digite a temperatura em Celcius");
        String userInput = scanner.next();
        scanner.close();
        Number c = parseNumber(userInput);
        System.out.println("valor: ");
        System.out.println(toFahrenheit(c));
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
}
