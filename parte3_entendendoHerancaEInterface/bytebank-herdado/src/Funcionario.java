
public abstract class Funcionario {
	
	// abstract refere-se a uma classe abstrata - não poderemos mais criar um objeto Funcionario (não podemos mais instanciar uma classe Funcionario)
	
	private String nome;
	private String cpf;
	private double salario;
	//protected double salario; // Visível apenas para as classes filhas (entre o public e o private)
	
	// Método abstrato - sem corpo, não há implementação na classe mãe - cada classe filha estabelece seus proprios métodos
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
