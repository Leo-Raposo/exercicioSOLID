package DIP;

public class PayPal implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de " + valor + " realizado com PayPal.");
    }
}

