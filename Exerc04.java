package exercicio_introducao;

import java.util.Scanner;

public class Exerc04 {
	
public static void main(String[] args) {
		
	/*
	 * Este código calcula o salário bruto de um funcionário.
	 * Ele solicita o número de horas trabalhadas e o valor da hora de trabalho,
	 * e então exibe o salário total antes dos descontos.
	 */
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=====Calculo de Salário Bruto=====");
		
		System.out.println("Digite o número de horas trabalhada: ");
		double tempoTrab = scan.nextDouble();
		
		System.out.println("Digite o valor por hora de trabalho: ");
		double valorTrab = scan.nextDouble();
		
		double salario = tempoTrab * valorTrab;
		
		System.out.println("Seu salário bruto é de: R$" + salario);
		

	}
}
