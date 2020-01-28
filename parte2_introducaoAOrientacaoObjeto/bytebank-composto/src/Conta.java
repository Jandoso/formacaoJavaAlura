public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	// Cliente titular = new Cliente(); Para sempre que criar uma nova conta criar um cliente novo
	
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
	public double getSaldo() {
		return this.saldo;
	}

}
	