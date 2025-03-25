
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Banco XYZ");

		Cliente cliente1 = new Cliente("João", 123456789);
		Cliente cliente2 = new Cliente("Maria", 987654321);

		banco.adicionarContaCorrente("001", 1001, 1000.00, cliente1);
		banco.adicionarContaPoupanca("001", 2001, 1500.00, cliente2);

		// Operação: Depósito na conta de João
		System.out.println("Operação: Depósito");
		Conta contaJoao = banco.buscarConta("001", 1001);
		if (contaJoao != null) {
			contaJoao.depositar(500.00);
		}

		System.out.println("\nOperação: Saque");
		Conta contaMaria = banco.buscarConta("001", 2001);
		if (contaMaria != null) {
			contaMaria.sacar(300.00);
		}

		System.out.println("\nSituação das contas após depósito e saque:");
		banco.listarContas();

		System.out.println("\nOperação: Transferência");
		banco.transferir("001", 1001, "001", 2001, 200.00);

		System.out.println("\nSituação final das contas após transferência:");
		banco.listarContas();

	}

}
