package exercicio_introducao;

import java.util.Scanner;

public class Exerc08 {
	public static void main(String[] args) {
		
		/*
		 * Este código funciona como um conversor de moedas simples.
		 * Ele pede ao usuário a cotação atual do dólar e um valor em reais,
		 * então calcula e exibe o equivalente desse valor em dólares.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=====CONVERSOR DE MOEDAS=====");
		System.out.println("Qual a cotação do dólar?");
		double dolar = scan.nextDouble();
		
		System.out.println("Quanto você quer converter?");
		double real = scan.nextDouble();
		
		double converte = real / dolar;
		
		System.out.printf("O valor de R$%.2f equivale a US$ %.2f.%n" , real , converte);
	}
	
}
