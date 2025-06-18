package exercicio_introducao;

import java.util.Scanner;

public class Exerc02 {
	public static void main(String[] args) {
		
	/*
	 * Este código calcula a soma total de dois produtos.
	 * Ele solicita ao usuário o preço de dois itens e exibe o valor total da compra.
	 */
		
	Scanner scan = new Scanner(System.in);
		
	System.out.println("=====TOTAL GASTO=====");
	System.out.println("Digite o preço do primeiro produto: ");
	double prod1 = scan.nextDouble();
	System.out.println("Digite o preço do segundo produto: ");
	double prod2 = scan.nextDouble();
	double result = prod1 + prod2;
	
	System.out.println("A soma desses produtos dão um total de: R$" + result);
	
		
	}

}
