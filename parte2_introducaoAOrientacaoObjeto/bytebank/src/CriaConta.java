
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		System.out.println("A primeira conta tem " + primeiraConta.saldo + " enquanto a segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
	
	}

}