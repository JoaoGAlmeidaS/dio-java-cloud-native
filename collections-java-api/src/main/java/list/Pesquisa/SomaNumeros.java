package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	//atributo
	private List<Integer> numeroList = new ArrayList<Integer>();

	public SomaNumeros() {
		this.numeroList = new ArrayList<Integer>();
	}
	
	
	public void adicionaNumero(int numero) {
		numeroList.add(numero);
	}
	
	public int calcularSoma() {
		int total = 0;
		if(!numeroList.isEmpty()) {
			for(Integer i : numeroList) {
				total += i.intValue();
			}
		}
		else {
			System.out.println("Não possui números na lista \n");
		}
		
		return total;
		
	}
	
	public int encontrarMaiorNumero() {
		int maior = 0;
		if(!numeroList.isEmpty()) {
			for(Integer i : numeroList) {
				if(i.intValue() > maior) {
					maior = i.intValue();
				}
			}
		}
		else {
			System.out.println("Não possui números na lista ");
		}
		return maior;
	}
	
	public int encontrarMenorNumero() {
		int menor = 0;
		if(!numeroList.isEmpty()) {
			for(Integer i : numeroList) {
				if(i.intValue() < menor) {
					menor = i.intValue();
				}
			}
		}
		else {
			System.out.println("Não possui números na lista ");
		}
		
		return menor;
	}
	
	public void exibirNumeros() {
		if(!numeroList.isEmpty()) {
			System.out.println(numeroList);
		}
		else {
			System.out.println("Não possui números na lista ");
		}
	}
	
	
	
	public static void main(String[] args) {
        // Cria uma instância de SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();
        
        System.out.println("=== Teste com lista VAZIA ===");
        System.out.println("Exibindo números:");
        somaNumeros.exibirNumeros();
        System.out.println("Soma: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        
        System.out.println("\n=== Adicionando números: 8, -2, 15, 0, 3 ===");
        somaNumeros.adicionaNumero(8);
        somaNumeros.adicionaNumero(-2);
        somaNumeros.adicionaNumero(15);
        somaNumeros.adicionaNumero(0);
        somaNumeros.adicionaNumero(3);
        
        System.out.println("\nExibindo números após adição:");
        somaNumeros.exibirNumeros();
        System.out.println("Soma: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
    }
	
}
