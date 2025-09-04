package Estruturas_da_Linguagem.while_loop_exercises;

public class WhileNumberPlayer {
    public double inputNumber;

    public WhileNumberPlayer(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public void printSquaresUpToLimit() {
        double r = 0;
        double i = 1;
        while (true) {
            r = Math.pow(i, 2);
            i++;
            if (r > inputNumber) {
                break;
            } else {
                System.out.println(r);
            }
        }
    }

    public void printCubesUpTolimit() {
        double r = 1;
        while (r * r * r< inputNumber) {

            System.out.println(r * r *r);
            r++;
        }
    }
}
