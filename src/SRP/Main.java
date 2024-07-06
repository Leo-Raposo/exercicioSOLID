package SRP;

public class Main {
    public static void main(String[] args) {
        GeradorRelatorio geradorRelatorio = new GeradorRelatorio();
        ImpressoraRelatorio impressoraRelatorio = new ImpressoraRelatorio();

        geradorRelatorio.gerarRelatorio();
        impressoraRelatorio.imprimirRelatorio();
    }
}
