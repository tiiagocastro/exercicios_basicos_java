package exercicio_introducao;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		/*
		 * Este código calcula o valor do frete de uma encomenda.
		 * Ele define um custo fixo por quilograma (R$ 5,00) e,
		 * em seguida, solicita o peso da encomenda para calcular o valor total do frete.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		double valorKg = 5;

		System.out.println("=====Calculo de Frete=====");
		System.out.println("Quanto pesa a sua encomenda (kg)? ");
		double peso = scan.nextDouble();
		double frete = peso * valorKg;
		
		System.out.printf("O valor do seu frete ficaria: R$%.2f.%n" , frete);
		
	}

}
