public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; //Static refere-se a um atributo da classe
	// Cliente titular = new Cliente(); Para sempre que criar uma nova conta criar um cliente novo
	
	//Método construtor. Aqui podemos setar valores padrão para os parâmetros
	//public Conta() {
	//	System.out.println("Estou criando uma conta");
	//}
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	// Métodos de manipulação do objeto
	
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
	
	// Criar um método para que o atributo "saldo" seja acessado diretamente 
	// Emcapsulamento - declarar um atributo como privado
	// Uma das grandes vantagens do encapsulamento é poder setar várias validações para a manipulação dos atributos
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	// Geralmente métodos que alteram atributos não retornam nada
	// Geralmente utilizamos o mesmo número para as variáveis (argumentos e atributos)
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não pode valor menor igual a zero");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <=0) {
			System.out.println("Não pode valor menor igual a 0");
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
	
	//Dentro de um método estático não podemos acessar um atributo com 'this'
	
	public static int getTotal() {
		return Conta.total;
	}
	

}
	