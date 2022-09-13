public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

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
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int ag) {
		this.agencia = ag;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int num) {
		this.numero = num;
	}
	public String getTitular() {
		return this.titular;
	}
	public void setTitular(String tit) {
		this.titular = tit;
	}

}