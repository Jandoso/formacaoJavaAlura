
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
		
		// Setando profissão em uma linha
		conta.getTitular().setProfissao("mecanico");
		// Setando profissão em duas linhas (com variável temporarea)
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("mecanico");
	
		
		// Testando referências
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}

}
