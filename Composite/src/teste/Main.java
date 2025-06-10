package teste;

public class Main {
    public static void main(String[] args) {

        // criação dos objetos Produto
        Produto p1 = new Produto("Mouse", 10);
        Produto p2 = new Produto("Teclado", 100);
        Produto p3 = new Produto("Monitor", 500);
        Produto p4 = new Produto("Fone de Ouvido", 20);

        // criação das caixas
        Caixa c1 = new Caixa(); // caixa maior
        Caixa c2 = new Caixa(); // caixa menor

        c2.addItemPedido(p1);
        c2.addItemPedido(p2);
        c2.addItemPedido(p3);

        c1.addItemPedido(c2); // adicionando caixa menor à maior
        c1.addItemPedido(p4); // adicionando produto diretamente à caixa maior

        c1.removerItemPedido(p4);
        
        // criação do pedido
        Pedido pe1 = new Pedido();
       
        pe1.addCaixa(c1);

        System.out.println("Valor total: R$ " + pe1.calcularValorTotal());
        System.out.println("\n - - - Conteúdo de Caixa - - -");
        c1.listarItens();
        
        
    }
}
