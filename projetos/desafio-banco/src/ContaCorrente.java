
public class ContaCorrente extends Conta{

	public ContaCorrente(String agencia, int numero, double saldo, Cliente cliente) {
		super(agencia, numero, saldo, cliente);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor + (valor * 0.1);
	}

}
