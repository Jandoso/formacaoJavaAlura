
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "paulo jandoso";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "mecanico";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		// Associa Paulo a conta recém criada
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
	}

}
