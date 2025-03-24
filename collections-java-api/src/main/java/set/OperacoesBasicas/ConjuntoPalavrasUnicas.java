package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	// atributo
	private Set<String> palavraUnicaSet;

	public ConjuntoPalavrasUnicas() {
		this.palavraUnicaSet = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		palavraUnicaSet.add(palavra);
	}

	public void removerPalavra(String palavra) {
		String palavraParaRemoverSet = null;
		if (!palavraUnicaSet.isEmpty()) {
			for (String s : palavraUnicaSet) {
				if (s.equals(palavra)) {
					palavraParaRemoverSet = s;
					break;
				}
			}
			palavraUnicaSet.remove(palavraParaRemoverSet);
		} else {
			System.out.println("Sem palavras no Set");
		}
	}

	public void verificaPalavra(String palavra) {
		String palavraPresente = null;
		if (!palavraUnicaSet.isEmpty()) {
			for (String s : palavraUnicaSet) {
				if (s.equals(palavra)) {
					palavraPresente = palavra;
					break;
				}
			}
			if(palavraPresente != null) {
				System.out.println("A palavra " + palavra + " está presente.");
			}
			else {
				System.out.println("A palavra " + palavra + " não está presente");
			}
		}
		else {
			System.out.println("Sem palavras no Set");
		}
	}
	
	public void exibirPalavrasUnicas() {
		System.out.println(palavraUnicaSet);
	}

	public static void main(String[] args) {
	    // Criando uma instância da classe ConjuntoPalavrasUnicas
	    ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

	    // Adicionando linguagens únicas ao conjunto
	    conjuntoLinguagens.adicionarPalavra("Java");
	    conjuntoLinguagens.adicionarPalavra("Python");
	    conjuntoLinguagens.adicionarPalavra("JavaScript");
	    conjuntoLinguagens.adicionarPalavra("Python");
	    conjuntoLinguagens.adicionarPalavra("C++");
	    conjuntoLinguagens.adicionarPalavra("Ruby");

	    // Exibindo as linguagens únicas no conjunto
	    conjuntoLinguagens.exibirPalavrasUnicas();

	    // Removendo uma linguagem do conjunto
	    conjuntoLinguagens.removerPalavra("Python");
	    conjuntoLinguagens.exibirPalavrasUnicas();

	    // Removendo uma linguagem inexistente
	    conjuntoLinguagens.removerPalavra("Swift");

	    // Verificando se uma linguagem está no conjunto
	    conjuntoLinguagens.verificaPalavra("Java");
	    conjuntoLinguagens.verificaPalavra("Python");

	    // Exibindo as linguagens únicas atualizadas no conjunto
	    conjuntoLinguagens.exibirPalavrasUnicas();
	  }
}
