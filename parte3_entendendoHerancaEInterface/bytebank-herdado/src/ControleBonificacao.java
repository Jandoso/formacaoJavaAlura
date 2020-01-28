
public class ControleBonificacao {
	
	private double soma;
	
	
	// Referência generica para as classes filhas de funcionario
	public void registro(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}

}
