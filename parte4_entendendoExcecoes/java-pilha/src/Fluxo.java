
public class Fluxo {
	
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch(Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		} 
//		catch(NullPointerException ex) {
//			String msg = ex.getMessage();
//			System.out.println("NullPointerException " + msg);
//		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() throws MinhaExcecao{
		System.out.println("Ini do metodo1");
			metodo2();
		
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");
		
		throw new MinhaExcecao("Erro");
		
//		ArithmeticException ex = new ArithmeticException("Erro");
//		throw ex;
		
		// também pode ser utilizado direto: throw new ArithmeticException("Erro")
		// throw funciona apenas com exceções 
		
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(i);
//			int a = 1 / 0;
//			Conta c = null;
//			c.deposita();
//			
//			
//		}
//		System.out.println("Fim do metodo2");
//	}

	} 
}

