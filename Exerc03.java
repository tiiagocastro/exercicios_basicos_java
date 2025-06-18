package exercicio_introducao;

import java.util.Scanner;

public class Exerc03 {
	public static void main(String[] args) {
		/*
		 * Este código calcula a velocidade média de um carro.
		 * Ele solicita a distância percorrida em quilômetros e o tempo gasto em horas,
		 * e então exibe a velocidade média em metros por segundo (m/s).
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=====CALCULO DE VELOCIDADE MEDIA DO CARRO=====");
		
		System.out.println("Digite a distancia percorrida (km): ");
		double distancia = scan.nextDouble();
		
		System.out.println("Digite o tempo gasto (horas): ");
		double tempo = scan.nextDouble();
		
		double distanciaMetros = distancia * 1000;
		double tempoSegundos = tempo * 3600;
		double vm = distancia / tempo; 
		
		System.out.printf("A velocidade média é %.2f m/s." , vm);


	}

}