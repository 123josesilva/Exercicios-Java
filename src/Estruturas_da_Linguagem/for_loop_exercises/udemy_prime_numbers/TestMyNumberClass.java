package Estruturas_da_Linguagem.for_loop_exercises.udemy_prime_numbers;

public class TestMyNumberClass {
    public static void main(String[] args) {
        System.out.println("hello word!");

        MyNumber testMyNumber = new MyNumber(8 ); 
        System.out.println(testMyNumber.isPrime());
        System.out.println(testMyNumber.sumUpToN());
        System.out.println(testMyNumber.sumOfDivisors());
        testMyNumber.printANumberTriangle();

    }
}
