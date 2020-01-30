import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraException {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();

		while (true) {
			
			try {
				
				Scanner entrada = new Scanner(System.in);

				System.out.println("Numerador: ");
				int numerador = entrada.nextInt();
				
				System.out.println("Denominador: ");
				int denominador = entrada.nextInt();

				float resultado = calc.dividir(numerador, denominador);
				System.out.println("Resultado: " + resultado);
			
			} catch (InputMismatchException | ArithmeticException ex) {
				
				System.err.println(ex.getMessage());
			
			} finally {
				System.out.println("Passou pelo finally!");
			}
			// O finally � executado independentemente do que ocorrer
			// O throws � utilizado para n�o tratar uma exce��o - jogar para quem vai utilizar o m�todo tratar - exce��es verificadas
			// O throw � quando n�o sei tratar por inteiro o erro, sendo assim formato e lan�o para quem vai utilizar o m�todo - posso lan�ar uma string com o erro 
			
		}

	}
}
