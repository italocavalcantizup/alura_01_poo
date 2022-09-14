package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero, Cliente titular) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		this.setTitular(titular);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Valor inválido");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (valor <= this.saldo) {
			destino.deposita(valor);
			this.saca(valor);
			return true;
		} 
		System.out.println("Erro ao fazer transferência.");
		return false;
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		System.out.println("Informações da Conta");
		System.out.println("------");
		System.out.printf(
				"Titular: %s \nAgência: %d - Conta: %d\nSaldo em conta: R$ %.2f.",
				this.titular.getNome(), this.agencia, this.numero, this.saldo);
		System.out.println();
		System.out.println("------");
		return super.toString();
	}

	public static int getTotal() {
		return total;
	}

}