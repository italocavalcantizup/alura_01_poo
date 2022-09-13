
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.deposita(500);
		
		System.out.println(conta1.getSaldo());
		
		conta1.saca(300);
		System.out.println();
		
		Conta conta2 = new Conta();
		conta2.deposita(600);
		
//		System.out.println("Testando transferência");
//		System.out.println("Saldo 1: " + conta1.getSaldo());
//		System.out.println("Saldo 2: " + conta2.getSaldo());
		
		conta1.transfere(150, conta2);
//		System.out.println("Saldo 1: " + conta1.getSaldo());
//		System.out.println("Saldo 2: " + conta2.getSaldo());
		
		conta2.transfere(500, conta1);
//		System.out.println("Saldo 1: " + conta1.getSaldo());
//		System.out.println("Saldo 2: " + conta2.getSaldo());
		
		conta1.setTitular("Italo Cavalcanti");
		conta2.setTitular("Mariana Costa");
		
	}

}
