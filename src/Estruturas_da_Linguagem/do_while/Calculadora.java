package Estruturas_da_Linguagem.do_while;

import java.util.Scanner;

public class Calculadora {

    public void mainMethod() {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        System.out.println("para sair digite um numero negativo");

        do {
            
            System.out.println("O cubo é: " + cubesCalculation(userInput));
            System.out.print("digite um numero: ");
            userInput = sc.nextInt();
            System.out.println("Seu input: " + userInput);
            
        } while (userInput > 0 );

        System.out.println(" thak you! Have Fun!");
        sc.close();
    }

    public int cubesCalculation(int n) {
        return n * n * n;
    }
}
