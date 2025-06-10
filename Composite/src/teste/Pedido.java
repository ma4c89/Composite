package teste;

public class Pedido {
    private Caixa caixa;

    public void addCaixa(Caixa c) {
        this.caixa = c;
    }

    public double calcularValorTotal() {
        return caixa.getPreco();
    }
}
