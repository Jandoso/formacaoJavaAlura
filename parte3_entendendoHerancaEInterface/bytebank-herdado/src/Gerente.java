// Gerente herda da classe funcionario e assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	 
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do gerente!");
		return super.getSalario(); // super indica que esse atributo está definido na classe mãe
 }
	
	// Utilizando super também podemos reaproveitar métodos da classe mãe
	// Utilizando super podemos evitar o uso de protected, permitindo a classificação de um atributo como private (para acessa-lo podemos utilizar os métodos herdados da classe mãe)
}
	