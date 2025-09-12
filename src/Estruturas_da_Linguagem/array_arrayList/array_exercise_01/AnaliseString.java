package Estruturas_da_Linguagem.array_arrayList.array_exercise_01;

import java.util.ArrayList;
import java.util.Arrays;

public class AnaliseString {
    private String[] diasDaSemana;

    public AnaliseString(String[] diasDaSemana) {
        this.diasDaSemana = diasDaSemana;
    }

    // precisamos saber qual string possui o maior numero de letras
    public void printMaiorString() {
        ArrayList<Integer> contadorDeString = new ArrayList<>();
        ArrayList<String> guardaOsResultados = new ArrayList<>();
        int[] armagenaContadorString = new int[7];
        int comparador = 0;

        System.out.println(Arrays.toString(diasDaSemana));

        for (int i = 0; i < diasDaSemana.length; i++) {
            String testDay = diasDaSemana[i];
            armagenaContadorString[i] = testDay.length();

        }

        for (int i = 0; i < diasDaSemana.length; i++) {
            if (comparador <= armagenaContadorString[i]) {
                contadorDeString.add(armagenaContadorString[i]);
                guardaOsResultados.add(diasDaSemana[i]);
                comparador = armagenaContadorString[i];
            }
        }

        for (int i = 0; i < contadorDeString.size(); i++) {
            System.out.println("dia: " + guardaOsResultados.get(i));
            System.out.println("total de letras: " + contadorDeString.get(i));
        }
    }

    public void printDaysOfTheWeekBackWards() {
        System.out.println("dentro do metodo");
        for (int i = diasDaSemana.length-1; i >= 0; i--) {
            System.out.println(diasDaSemana[i]);
        }
    }
}
