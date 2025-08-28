package Estruturas_da_Linguagem.for_loop_exercises.udemy_prime_numbers;

import java.util.ArrayList;

public class MyNumber {
    public double number;

    public MyNumber(double number) {
        this.number = number;

    }

    public boolean isPrime() {
        // para um numero ser primo ele só pode ser divisivel (com resultado 0) por dois
        // numero 1 e ele mesmo = exemplo 7 = é divisivel por 1 e 7
        ArrayList<Boolean> numerosDivisiveis = new ArrayList<>();

        for (double i = 1; i <= number; i++) {
            double produto = number % i;

            while (produto == 0.0) {
                numerosDivisiveis.add(true);
                break;
            }
        }

        if (numerosDivisiveis.size() == 2) {
            return true;
        } else {
            return false;
        }

    }

    public double sumUpToN() {
        double sum = 0;

        for (double i = 1; i <= number; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public double sumOfDivisors() {
        double sumOfDivisorsNumber = 0;

        for (double i = 2; i < number; i++) {
            double product = number % i;

            while (product == 0) {
                sumOfDivisorsNumber = sumOfDivisorsNumber + i;
                break;
            }
        }

        return sumOfDivisorsNumber;
    }

    public void printANumberTriangle() {
        for (double i = 1; i <= number; i++) {
            for (double a = 1; a <= i; a++ ){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
