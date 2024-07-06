package OCP;

public class Pedido {
    private Desconto desconto;

    public Pedido(Desconto desconto) {
        this.desconto = desconto;
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    public double calcularValorFinal(double valorInicial) {
        return desconto.aplicarDesconto(valorInicial);
    }
}

