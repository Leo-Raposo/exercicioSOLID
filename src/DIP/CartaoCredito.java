package DIP;

public class CartaoCredito implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de " + valor + " realizado com cartão de crédito.");
    }
}

