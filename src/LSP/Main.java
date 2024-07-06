package LSP;

public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente(1000, 500);
        Conta contaPoupanca = new ContaPoupanca(1000, 0.05);

        contaCorrente.sacar(1200);
        System.out.println("Saldo da conta corrente após saque: " + contaCorrente.getSaldo());

        contaPoupanca.sacar(200);
        System.out.println("Saldo da conta poupança após saque: " + contaPoupanca.getSaldo());

        ((ContaPoupanca) contaPoupanca).aplicarJuros();
        System.out.println("Saldo da conta poupança após aplicação de juros: " + contaPoupanca.getSaldo());
    }
}
