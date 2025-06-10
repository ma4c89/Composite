<h1 align="center">📦 Sistema de Pedidos com o Padrão Composite</h1>

<p align="center">
  Projeto Java que demonstra o uso do padrão de projeto <strong>Composite</strong> na modelagem de um sistema de pedidos.
</p>

## 📚 Sobre o Projeto

Este projeto simula um sistema de pedidos, onde produtos podem ser agrupados dentro de caixas, e caixas podem conter outras caixas. O objetivo principal é demonstrar a **flexibilidade e reutilização** do padrão de projeto **Composite**, que permite tratar objetos simples e compostos de forma uniforme.

---

## 🎯 Funcionalidades

- ✅ Cadastro de produtos com nome e preço;
- ✅ Inclusão de produtos e caixas dentro de caixas;
- ✅ Criação de pedidos compostos por caixas;
- ✅ Cálculo do valor total de um pedido;
- ✅ Aplicação clara do padrão Composite com Java.

---

## 🧠 Padrão de Projeto Utilizado

### 🧩 Composite

> “Compõe objetos em estruturas de árvore para representar hierarquias parte-todo. O Composite permite que os clientes tratem objetos individuais e composições de objetos de forma uniforme.”

**No projeto:**

- `ItemPedido`: interface comum.
- `Produto`: representa um item simples.
- `Caixa`: representa um item composto.
- `Pedido`: contém caixas, que por sua vez contêm itens e outras caixas.

---

## 📁 Estrutura do Projeto
├── Main.java // Classe principal para execução <br>
├── Produto.java // Implementação de produto simples  <br>
├── Caixa.java // Implementação de item composto  <br>
├── Pedido.java // Contém uma ou mais caixas  <br>
└── ItemPedido.java // Interface comum  <br>


---

## 💡 Exemplo de Uso

```java
Produto p1 = new Produto("Mouse", 10);
Produto p2 = new Produto("Teclado", 100);

Caixa c1 = new Caixa();
c1.addItemPedido(p1);
c1.addItemPedido(p2);

Pedido pe1 = new Pedido();
pe1.addCaixa(c1);

System.out.println("Valor total do pedido: R$" + pedido.calcularValorTotal());
System.out.println("\n - - - Conteúdo de Caixa - - -");
c1.listarItens();
