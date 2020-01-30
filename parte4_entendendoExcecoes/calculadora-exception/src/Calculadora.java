
public class Calculadora {
	public float dividir(int numerador, int denominador) {
		float resultado = 0;

		try {
			
			resultado = numerador / denominador;

		} catch (ArithmeticException ex) {
			
			throw new ArithmeticException("Erro aritmético: " + ex.getMessage());
		}
		
		
		return resultado;

	}

}
