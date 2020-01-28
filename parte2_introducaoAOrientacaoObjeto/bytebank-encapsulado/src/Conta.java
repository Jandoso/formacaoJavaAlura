public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; //Static refere-se a um atributo da classe
	// Cliente titular = new Cliente(); Para sempre que criar uma nova conta criar um cliente novo
	
	//M�todo construtor. Aqui podemos setar valores padr�o para os par�metros
	//public Conta() {
	//	System.out.println("Estou criando uma conta");
	//}
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	// M�todos de manipula��o do objeto
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	// Criar um m�todo para que o atributo "saldo" seja acessado diretamente 
	// Emcapsulamento - declarar um atributo como privado
	// Uma das grandes vantagens do encapsulamento � poder setar v�rias valida��es para a manipula��o dos atributos
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	// Geralmente m�todos que alteram atributos n�o retornam nada
	// Geralmente utilizamos o mesmo n�mero para as vari�veis (argumentos e atributos)
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("N�o pode valor menor igual a zero");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <=0) {
			System.out.println("N�o pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	//Dentro de um m�todo est�tico n�o podemos acessar um atributo com 'this'
	
	public static int getTotal() {
		return Conta.total;
	}
	

}
	