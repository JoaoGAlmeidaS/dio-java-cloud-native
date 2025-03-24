package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
	//atributo
	private List<Integer> numeroList;

	public OrdenacaoNumeros() {
		this.numeroList = new ArrayList<>();
	}
	
	
	public void adicionarNumero(int numero) {
		numeroList.add(numero);
	}
	
	public List<Integer> ordenarAscendente(){
		List<Integer> numerosAscendente = new ArrayList<>(this.numeroList);
	    if (!numeroList.isEmpty()) {
	      Collections.sort(numerosAscendente);
	      return numerosAscendente;
	    } 
	    else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	}
	
	public List<Integer> ordenarDescendente(){
		List<Integer> numerosDescendente = new ArrayList<>(this.numeroList);
	    if (!numeroList.isEmpty()) {
	    	numerosDescendente.sort(Collections.reverseOrder());
	      return numerosDescendente;
	    } 
	    else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	}
	
	public void exibirNumeros() {
	    if (!numeroList.isEmpty()) {
	      System.out.println(this.numeroList);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	  }

	
	
	public static void main(String[] args) {
	    // Criando uma instância da classe OrdenacaoNumeros
	    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

	    // Adicionando números à lista
	    numeros.adicionarNumero(2);
	    numeros.adicionarNumero(5);
	    numeros.adicionarNumero(4);
	    numeros.adicionarNumero(1);
	    numeros.adicionarNumero(99);

	    // Exibindo a lista de números adicionados
	    numeros.exibirNumeros();

	    // Ordenando e exibindo em ordem ascendente
	    System.out.println(numeros.ordenarAscendente());

	    // Exibindo a lista
	    numeros.exibirNumeros();

	    // Ordenando e exibindo em ordem descendente
	    System.out.println(numeros.ordenarDescendente());

	    // Exibindo a lista
	    numeros.exibirNumeros();
	  }
	
	
	

}
