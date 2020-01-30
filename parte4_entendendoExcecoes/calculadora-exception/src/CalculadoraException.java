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
			// O finally é executado independentemente do que ocorrer
			// O throws é utilizado para não tratar uma exceção - jogar para quem vai utilizar o método tratar - exceções verificadas
			// O throw é quando não sei tratar por inteiro o erro, sendo assim formato e lanço para quem vai utilizar o método - posso lançar uma string com o erro 
			
		}

	}
}
