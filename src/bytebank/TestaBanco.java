package bytebank;

public class TestaBanco {

	public static void main(String[] args) {

		Cliente italo = new Cliente();
		italo.setNome("Italo Cavalcanti");
		italo.setCpf("00000000000");
		italo.setProfissao("iOS Developer");
		
		Conta contaItalo = new Conta();
		contaItalo.deposita(500);
		contaItalo.setTitular(italo);
		
		contaItalo.toString();
		
	}

}
