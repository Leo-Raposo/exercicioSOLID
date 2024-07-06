package DIP;

public class Main {
    public static void main(String[] args) {
        MetodoPagamento cartaoCredito = new CartaoCredito();
        MetodoPagamento payPal = new PayPal();

        SistemaPagamento sistemaPagamento = new SistemaPagamento(cartaoCredito);
        sistemaPagamento.processarPagamento(100.0);

        sistemaPagamento.setMetodoPagamento(payPal);
        sistemaPagamento.processarPagamento(200.0);
    }
}

