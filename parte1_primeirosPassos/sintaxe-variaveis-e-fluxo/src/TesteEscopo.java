
public class TesteEscopo {
	

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 18;
		int quantidadePessoas = 3;
		
		
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado; 
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo!");
		} else {
			System.out.println("infelizmente voc� n�o pode entrar!");

		}
	}

}
