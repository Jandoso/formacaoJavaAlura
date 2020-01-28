
public class TesteReferencias {

	public static void main(String[] args) {
		
//		g1.setNome("Ana");
//		String nome = g1.getNome();
//		
//		g1.autentica(2222);
//		
//		System.out.println(nome);
		
		Gerente g1 = new Gerente();
		g1.setSalario(10000);
		
//		Funcionario f1 = new Funcionario();
//		f1.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registro(g1);
//		controle.registro(f1);
		controle.registro(ev);
		controle.registro(d);
		
		System.out.println(controle.getSoma());
	}

}

// Polimorfismo é quando temos um mesmo objeto mas com duas formas de referencia-lo (por exemplo: Gerente g1 = new Gerente(); ou Funcionario g1 = new Gerente(); - Lembrando que a referência pode ser a mais gererica das classes
