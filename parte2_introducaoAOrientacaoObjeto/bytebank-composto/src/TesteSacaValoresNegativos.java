
public class TesteSacaValoresNegativos {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.deposita(100);
		conta.saca(200);
		
		//System.out.println(conta.saca(200));
		//System.out.println(conta.saldo);
		
		System.out.println(conta.getSaldo());
		
		//Proibido - devemos manipular os objetos atrav�s de seus m�todos e n�o atrav�s de seus atributos
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
	}

}
