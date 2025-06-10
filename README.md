<h1 align="center">📦 Sistema de Pedidos com o Padrão Composite</h1>

<p align="center">
  Projeto Java que demonstra o uso do padrão de projeto estrutural <strong>Composite</strong> na modelagem de um sistema de pedidos.
</p>

---

## 📚 Sobre o Projeto

Este projeto simula um sistema de pedidos, onde produtos podem ser agrupados dentro de caixas, e caixas podem conter outras caixas. O objetivo principal é demonstrar a **flexibilidade e reutilização** do padrão de projeto **Composite**, que permite tratar objetos simples e compostos de forma uniforme.

---

## 🎯 Funcionalidades

- ✅ Cadastro de produtos com nome e preço;
- ✅ Inclusão de produtos e caixas dentro de caixas;
- ✅ Criação de pedidos compostos por caixas;
- ✅ Cálculo do valor total de um pedido;
- ✅ Aplicação clara do padrão Composite com Java;
- ✅ Listagem de conteúdo das caixas;
- ✅ Remoção de itens de uma caixa.

---

## 🧠 Padrão de Projeto Utilizado

### 🧩 Composite

> “Compõe objetos em estruturas de árvore para representar hierarquias parte-todo. O Composite permite que os clientes tratem objetos individuais e composições de objetos de forma uniforme.”

**Implementação no projeto:**

- `ItemPedido`: interface comum.
- `Produto`: representa um item simples (folha).
- `Caixa`: representa um item composto (composite).
- `Pedido`: contém uma ou mais caixas.

---

## 📝 Resumo Rápido do Padrão Composite

| | |
|---|---|
| **Problema** | O cliente precisa tratar de maneira uniforme objetos individuais **e** composições desses objetos. |
| **Solução** | Definir uma única interface comum, permitindo que tanto elementos simples quanto agrupamentos (composites) sejam manipulados da mesma forma. |
| **Quando usar?** | • Sempre que for necessário tratar um conjunto como se fosse um único objeto.<br>• Funciona melhor quando o relacionamento entre os objetos forma uma **árvore**.<br>• Existem várias estratégias de implementação (por exemplo, objetos-folha para itens simples e objetos-composite para agrupamentos). |

---

## 📁 Estrutura do Projeto
src/ <br>
├── Main.java // Classe principal para execução <br>
├── Produto.java // Implementação de produto simples <br>
├── Caixa.java // Implementação de item composto <br>
├── Pedido.java // Contém uma ou mais caixas <br>
└── ItemPedido.java // Interface comum para todos os itens <br>


---

## 💡 Exemplo de Uso
```java
Produto p1 = new Produto("Mouse", 10);
Produto p2 = new Produto("Teclado", 100);
Produto p3 = new Produto("Monitor", 500);
Produto p4 = new Produto("Fone de Ouvido", 20);

Caixa c1 = new Caixa();
Caixa c2 = new Caixa(); 

c2.addItemPedido(p1);
c2.addItemPedido(p2);
c2.addItemPedido(p3);

c1.addItemPedido(c2); 
c1.addItemPedido(p4);

c1.removerItemPedido(p4);

Pedido pedido = new Pedido();
pedido.addCaixa(c1);

System.out.println("Valor total do pedido: R$" + pedido.calcularValorTotal());
System.out.println("\n - - - Conteúdo de Caixa - - -");
c1.listarItens();
