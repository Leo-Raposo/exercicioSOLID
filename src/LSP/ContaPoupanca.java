package LSP;

public class ContaPoupanca extends Conta {
    private double taxaDeJuros;

    public ContaPoupanca(double saldoInicial, double taxaDeJuros) {
        super(saldoInicial);
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            debitar(valor);
            System.out.println("Conta Poupança: Sacado " + valor);
        }
    }

    public void aplicarJuros() {
        double juros = getSaldo() * taxaDeJuros;
        depositar(juros);
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
}
