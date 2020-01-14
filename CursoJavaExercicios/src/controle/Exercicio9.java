package desafiosControle;

import java.util.Scanner;

public class DesafioMaiorNumero {
	public static void main(String[] args) {
		int maiorValor = 0;
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor: ");
			int valor = entrada.nextInt();
			if (valor > maiorValor) {
				maiorValor = valor;
			}
		}
		System.out.println("O maior valor digitado foi: " + maiorValor);
		

		entrada.close();
	}

}
