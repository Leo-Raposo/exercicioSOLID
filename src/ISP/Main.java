package ISP;

public class Main {
    public static void main(String[] args) {
        Impressora impressoraSimples = new ImpressoraSimples();
        impressoraSimples.imprimirDocumento("Relatório Simples");

        Multifuncional multifuncional = new Multifuncional();
        multifuncional.imprimirDocumento("Relatório Completo");
        multifuncional.escanearDocumento("Relatório Completo");
        multifuncional.faxearDocumento("Relatório Completo");
    }
}
