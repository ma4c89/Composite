package teste;

import java.util.ArrayList;

public class Caixa implements ItemPedido {
    private ArrayList<ItemPedido> itens;

    public Caixa() {
        this.itens = new ArrayList<>();
    }

    public void addItemPedido(ItemPedido item) {
        this.itens.add(item);
    }
    
    public void removerItemPedido(ItemPedido item) {
        this.itens.remove(item);
    }


    @Override
    public double getPreco() {
        double valorTotal = 0;
        for (ItemPedido item : itens) {
            valorTotal += item.getPreco();
        }
        return valorTotal;
    }
    
    
    public void listarItens() {
    	System.out.println("Itens na caixa: ");
    	for(ItemPedido item : itens) {
    		if(item instanceof Produto) {
    			Produto p = (Produto) item;
                System.out.println("- Produto: " + p.getNome() + " | Preço: R$" + p.getPreco());
    		}else if(item instanceof Caixa) {
    			System.out.println("- Sub-caixa: ");
    			((Caixa) item).listarItens(); // chamada recursiva para subcaixas
    		}
    	}
    }
}
