package exercicio_introducao;

import java.util.Scanner;

public class Exerc05 {
	
public static void main(String[] args) {
		/*
		 * Este código calcula o valor total de um empréstimo e o valor de cada parcela.
		 * Ele solicita o valor inicial do empréstimo, a taxa de juros mensal
		 * e o número de meses para pagamento, e então exibe o custo total e o valor da parcela.
		 */
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=====VALOR DO EMPRESTIMO=====");
		System.out.println("Qual valor do emprestimo?");
		double valorEmprestimo = scan.nextDouble();
		
		System.out.println("Qual a taxa de juros mensal?");
		double juros = scan.nextDouble();
		
		System.out.println("O emprestimo foi em quantos meses?");
		double tempo = scan.nextDouble();
		
		double valorTotal = valorEmprestimo + (valorEmprestimo * (juros /100) * tempo);
		double valorParcela = valorTotal / tempo; 		

		
		System.out.printf("O valor total do empréstimo foi: R$ %.2f.%n" , valorTotal);
		System.out.printf("O valor de cada parcela será de: R$ %.2f.%n" , valorParcela);
		

	}

}