
public abstract class Funcionario {
	
	// abstract refere-se a uma classe abstrata - n�o poderemos mais criar um objeto Funcionario (n�o podemos mais instanciar uma classe Funcionario)
	
	private String nome;
	private String cpf;
	private double salario;
	//protected double salario; // Vis�vel apenas para as classes filhas (entre o public e o private)
	
	// M�todo abstrato - sem corpo, n�o h� implementa��o na classe m�e - cada classe filha estabelece seus proprios m�todos
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	

}
