package Estruturas_da_Linguagem.primeiros_passos;

public class Resultado02 {
    private Number soma;
    private Number subtracao;
    private Number multiplicacao;
    private Number divisao;

    public Resultado02(Number soma, Number subtracao, Number multiplicacao, Number divisao) {
        this.soma = soma;
        this.subtracao = subtracao;
        this.multiplicacao = multiplicacao;
        this.divisao = divisao;
    }

    @Override
    public String toString() {
        return String.format(
                "Soma: %s, Subtração: %s, Multiplicação: %s, Divisão: %s",
                soma, subtracao, multiplicacao, divisao);
    }
}