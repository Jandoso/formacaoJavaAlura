
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("222.222.222-22");
		nico.setSalario(2598.45);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
