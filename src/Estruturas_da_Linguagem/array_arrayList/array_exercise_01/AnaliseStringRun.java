package Estruturas_da_Linguagem.array_arrayList.array_exercise_01;

public class AnaliseStringRun {
    public static void main(String[] args) {
        String[] dias = new String[]{"segunda", "terça", "quarta", "quinta", "sexta", "sabado", "domingo"};
        AnaliseString daysOfTheWeek = new AnaliseString(dias);
        daysOfTheWeek.printDaysOfTheWeekBackWards();
        // daysOfTheWeek.printMaiorString();
    }
}
