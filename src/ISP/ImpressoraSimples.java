package ISP;

public class ImpressoraSimples implements Impressora {
    @Override
    public void imprimirDocumento(String documento) {
        System.out.println("Imprimindo documento: " + documento);
    }
}

