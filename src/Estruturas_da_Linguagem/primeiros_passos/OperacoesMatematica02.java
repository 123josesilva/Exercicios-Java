package Estruturas_da_Linguagem.primeiros_passos;
public class OperacoesMatematica02 {

    // Variaveis
    private Number n1;
    private Number n2;

    // Construtores
    OperacoesMatematica02(Number n1, Number n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // Getters
    public Number getN1() {
        return n1;
    }

    public Number getN2() {
        return n2;
    }

    public static Resultado02 calculoDeOperacoes(Number n1, Number n2) {

        if (n1 instanceof Integer && n2 instanceof Integer) {
            Number soma = n1.intValue() + n2.intValue();
            Number subtração = n1.intValue() - n2.intValue();
            Number multiplicacao = n1.intValue() * n2.intValue();
            Number divisao = n1.intValue() / n2.intValue();

            return new Resultado02(soma, subtração, multiplicacao, divisao);
        }

        Number soma = n1.floatValue() + n2.floatValue();
        Number subtração = n1.floatValue() - n2.floatValue();
        Number multiplicacao = n1.floatValue() * n2.floatValue();
        Number divisao = n1.floatValue() / n2.floatValue();

        return new Resultado02(soma, subtração, multiplicacao, divisao);
    }
}

