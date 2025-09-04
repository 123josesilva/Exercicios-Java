package Estruturas_da_Linguagem.while_loop_exercises;

public class TestWhileNumberPlayer {
    public static void main(String[] args) {
        WhileNumberPlayer mostra = new WhileNumberPlayer(25); 
        mostra.printSquaresUpToLimit();
        System.out.println("cubes");
        mostra.printCubesUpTolimit();
    }
}
