package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itemList;
	
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		
		for(Item t : itemList) {
			if(t.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(t);
			}
		}
		itemList.removeAll(itensParaRemover);
		
	}
	
	public double calcularValorTotal() {
		double total = 0;
		if(!itemList.isEmpty()) {
		for(Item t : itemList) {
			total += (t.getPreco() * t.getQuantidade());
		}
		
		return total;
		}
		else {
			throw new RuntimeException("A Lista está vazia!");
		}
	}
	
	public void exibirItens() {
		if(!itemList.isEmpty()) {
		System.out.println(itemList);
		}
		else {
			throw new RuntimeException("A Lista está vazia!");
		}
	}
	
	
	
	public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("Adicionando itens ao carrinho...");
        carrinho.adicionarItem("Arroz", 10.50, 2);
        carrinho.adicionarItem("Feijão", 7.80, 1);
        carrinho.adicionarItem("Macarrão", 5.30, 3);

        System.out.println("Itens no carrinho:");
        carrinho.exibirItens();

        System.out.println("Calculando o valor total...");
        double total = carrinho.calcularValorTotal();
        System.out.println("Valor total: R$ " + total);

        System.out.println("Removendo 'Feijão' do carrinho...");
        carrinho.removerItem("Feijão");

        System.out.println("Itens no carrinho após a remoção:");
        carrinho.exibirItens();

        System.out.println("Recalculando o valor total...");
        total = carrinho.calcularValorTotal();
        System.out.println("Novo valor total: R$ " + total);
    }
	
	
}
