package OCP;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(new DescontoEstudante());
        System.out.println("Valor final para estudante: " + pedido.calcularValorFinal(100.0));

        pedido.setDesconto(new DescontoIdoso());
        System.out.println("Valor final para idoso: " + pedido.calcularValorFinal(100.0));
    }
}
