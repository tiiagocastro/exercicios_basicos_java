package exercicio_introducao;

import java.util.Scanner;

public class Exerc06 {
	public static void main(String[] args) {
		/*
		 * Este código calcula o valor da conta de água com base no consumo mensal.
		 * Ele solicita a quantidade de litros de água consumidos no mês
		 * e calcula o custo total, considerando o valor de R$ 0,02 por litro.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=====CONTA DE ÁGUA=====");
		System.out.println("Quantos litros de água sua casa consumiu nesse mês? ");
		double aguaMes = scan.nextDouble();
		
		double contaAgua = aguaMes * 0.02;
		
		System.out.printf("Sua conta de água desse mês será: %.2f. %n" , contaAgua);
		


	}	
	
}