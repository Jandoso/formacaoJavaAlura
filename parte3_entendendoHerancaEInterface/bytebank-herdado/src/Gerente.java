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
		System.out.println("Chamando o m�todo de bonifica��o do gerente!");
		return super.getSalario(); // super indica que esse atributo est� definido na classe m�e
 }
	
	// Utilizando super tamb�m podemos reaproveitar m�todos da classe m�e
	// Utilizando super podemos evitar o uso de protected, permitindo a classifica��o de um atributo como private (para acessa-lo podemos utilizar os m�todos herdados da classe m�e)
}
	