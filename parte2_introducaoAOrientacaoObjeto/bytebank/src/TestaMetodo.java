
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaCaroline = new Conta();
		contaDaCaroline.saldo = 100;
		
		contaDaCaroline.deposita(50);
		System.out.println(contaDaCaroline.saldo);
		
		contaDaCaroline.saca(20);
		System.out.println(contaDaCaroline.saldo);
	
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(1000);
		
		boolean sucessoTransferencia = contaDoPaulo.transfere(3000, contaDaCaroline);
		
		if(sucessoTransferencia) {
			System.out.println("Transferência com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
				
		// contaDoPaulo.transfere(300, contaDaCaroline);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(contaDaCaroline.saldo);
		
		contaDaCaroline.titular = "caroline jandoso";
		System.out.println(contaDaCaroline.titular);
	
	}

}
