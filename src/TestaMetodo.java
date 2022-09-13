
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(500);
		
		System.out.println(conta.getSaldo());
		
		boolean conseguiuRetirar = conta.saca(300);
		System.out.println();
		System.out.println(conseguiuRetirar ? "Saque efetuado!" : "Erro ao sacar");
		
	}

}
