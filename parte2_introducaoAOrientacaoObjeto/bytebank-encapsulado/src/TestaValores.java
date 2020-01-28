
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		// Conta está inconsistente de acordo com as regras de negócio
		//conta.setAgencia(-50);
		//conta.setNumero(-330);
		
		//System.out.println(conta.getAgencia());
		//System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(1234, 5896);
		
		System.out.println(Conta.getTotal());
	}

}
