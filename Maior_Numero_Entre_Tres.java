package exercicios_casa;

import java.util.Scanner;

public class Maior_Numero_Entre_Tres {

	public static void main(String[] args) {
		 //Escreva um programa para encontrar o maior número dentre três números fornecidos pelo usuário.
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();	
		scan.nextLine();
		
		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Digite o terceiro número: ");
		int num3 = scan.nextInt();
		scan.nextLine();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O primeiro número é o maior.");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("O segundo número é o maior.");
		}else if(num3 > num1 && num3 >num2){
			System.out.println("O terceiro número é o maior.");
		}else if(num1 == num2 && num1 == num3 && num2 == num3){
			System.out.println("Os números são iguais");
		}else {
			System.out.println("Há um empate entre os maiores números.");
		}
		scan.close();
	}

}
