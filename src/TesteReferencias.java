
public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo Primeira Conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println(primeiraConta);	// Conta@dcf3e99
		System.out.println(segundaConta);	// Conta@dcf3e99
		
		segundaConta.saldo += 100;
		
		System.out.printf("Saldo Primeira Conta: R$ %.2f", primeiraConta.saldo);
		System.out.println();
		System.out.printf("Saldo Segunda Conta: R$ %.2f", segundaConta.saldo);

	}

}
