import java.util.ArrayList;
import java.util.List;

public class Banco {
	// atributos
	private String nome;
	private List<Conta> listContas;

	public Banco(String nome) {
		super();
		this.nome = nome;
		this.listContas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void adicionarContaCorrente(String agencia, int numero, double saldo, Cliente cliente) {
		listContas.add(new ContaCorrente(agencia, numero, saldo, cliente));
	}

	public void adicionarContaPoupanca(String agencia, int numero, double saldo, Cliente cliente) {
		listContas.add(new ContaPoupanca(agencia, numero, saldo, cliente));
	}

	public void listarContas() {
		if (!listContas.isEmpty()) {
			System.out.println("Contas cadastradas no banco: " + nome);
			for (Conta conta : listContas) {
				System.out.println("------------------------------");
				conta.imprimirDados();
			}
		} else {
			System.out.println("O banco não possui contas.");
		}
	}

	public Conta buscarConta(String agencia, int numero) {
		for (Conta c : listContas) {
			if (c.getAgencia().equals(agencia) && c.getNumero() == numero) {
				return c;
			}
		}
		return null;
	}

	public boolean transferir(String agenciaOrigem, int numeroOrigem, String agenciaDestino, int numeroDestino,
			double valor) {
		Conta contaOrigem = buscarConta(agenciaOrigem, numeroOrigem);
		Conta contaDestino = buscarConta(agenciaDestino, numeroDestino);

		if (contaOrigem == null) {
			System.out.println("Conta de origem não encontrada!");
			return false;
		}
		if (contaDestino == null) {
			System.out.println("Conta de destino não encontrada!");
			return false;
		}
		if (contaOrigem.getSaldo() < valor) {
			System.out.println("Saldo insuficiente para transferência.");
			return false;
		}

		contaOrigem.sacar(valor);
		contaDestino.depositar(valor);
		System.out.println("Transferência de R$" + String.format("%.2f", valor) + " realizada com sucesso!");
		return true;

	}
}