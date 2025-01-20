public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        OperacoesMatematica02 operacao = new OperacoesMatematica02(45, 72.74f);
        Resultado02 resultado = operacao.calculoDeOperacoes(45, 72.74f);

        System.out.println(resultado);
    }
}
