
public class Calculadora {
	public float dividir(int numerador, int denominador) {
		float resultado = 0;

		try {
			
			resultado = numerador / denominador;

		} catch (ArithmeticException ex) {
			
			throw new ArithmeticException("Erro aritm�tico: " + ex.getMessage());
		}
		
		
		return resultado;

	}

}
