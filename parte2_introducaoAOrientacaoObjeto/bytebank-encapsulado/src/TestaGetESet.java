
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1342, 4568);
		//conta.numero = 3154;
		
		conta.setNumero(3154);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		//conta.titular = paulo;
		//paulo.nome = "paulo jandoso";
		
		conta.setTitular(paulo);
		paulo.setNome("paulo jandoso");
		
		
		System.out.println(conta.getTitular().getNome());
		
		// Setando profiss�o em uma linha
		conta.getTitular().setProfissao("mecanico");
		// Setando profiss�o em duas linhas (com vari�vel temporarea)
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("mecanico");
	
		
		// Testando refer�ncias
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}

}
