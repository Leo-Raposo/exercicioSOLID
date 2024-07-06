package OCP;

public class DescontoIdoso implements Desconto {
    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.7;
    }
}

