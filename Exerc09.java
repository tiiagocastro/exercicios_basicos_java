package exercicio_introducao;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		/*
		 * Este código calcula a área de uma parede e a quantidade de tinta necessária para pintá-la.
		 * Ele solicita a altura e a largura da parede, calcula a área em metros quadrados,
		 * e então estima a quantidade de tinta em litros, considerando que cada litro cobre 2 m².
		 */
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Qual a altura da parede?");
		double altura = scan.nextDouble();
		
		System.out.println("Qual a largura da parede?");
		double largura = scan.nextDouble();
		
		double area = altura * largura;
		double tinta = area / 2; 
		
		
		System.out.printf("A área da parede é de %.2f m².%n" , area);
		System.out.printf("A quantidade de tinta necessária é %.2f litros.%n" , tinta);
		
		
		
		
	}

}
