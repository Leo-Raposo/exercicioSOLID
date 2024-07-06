package LSP;

public abstract class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    protected void debitar(double valor) {
        saldo -= valor;
    }

    public abstract void sacar(double valor);
}
