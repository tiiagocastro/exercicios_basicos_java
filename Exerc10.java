package exercicio_introducao;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		/*
		 * Este código calcula o preço final de um produto parcelado com juros e o valor de cada parcela.
		 * Ele solicita o preço à vista do produto e o número de parcelas desejado.
		 * O cálculo considera uma taxa de juros de 2% (0.02) sobre o valor original multiplicado pelo número de parcelas.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Qual o preço à vista do produto?");
		double precoAVista = scan.nextDouble();
		
		System.out.println("Em quantas parcelas você quer dividir?");
		double parcela = scan.nextDouble();
		
		double juros = 0.02;

		double precoAPrazo = precoAVista * (1 + juros * parcela);
		double valorParcela = precoAPrazo /parcela;
		
		System.out.printf("O valor de cada parcela é R$ %.2f. %n" , valorParcela);
		
		
		
	}

}
