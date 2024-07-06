package LSP;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(double saldoInicial, double limiteChequeEspecial) {
        super(saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (getSaldo() + limiteChequeEspecial)) {
            debitar(valor);
            System.out.println("Conta Corrente: Sacado " + valor);
        }
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
