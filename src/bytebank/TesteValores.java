package bytebank;

public class TesteValores {

	public static void main(String[] args) {

		Cliente italo = new Cliente("Italo Cavalcanti", "00000000000", "iOS Developer");
		Conta conta = new Conta(0001, 11000, italo);
		conta.deposita(500);
		
		Cliente mariana = new Cliente("Mariana Costa", "11111111111", "Produtora de Rádio e TV");
		Conta conta2 = new Conta(1234, 113455, mariana);
		conta2.deposita(2000);
		
		conta.toString();
		conta2.toString();
	}

}
