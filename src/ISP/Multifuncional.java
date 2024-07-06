package ISP;

public class Multifuncional implements Impressora, Scanner, Fax {
    @Override
    public void imprimirDocumento(String documento) {
        System.out.println("Imprimindo documento: " + documento);
    }

    @Override
    public void escanearDocumento(String documento) {
        System.out.println("Escaneando documento: " + documento);
    }

    @Override
    public void faxearDocumento(String documento) {
        System.out.println("Faxeando documento: " + documento);
    }
}

