package exercicios_casa;

import java.util.Scanner;

public class Maior_Menor_Numero {

	public static void main(String[] args) {
		   //Crie um programa que leia quatro números inteiros e diga qual o maior e o menor número dentre eles. 
		   //Depois, calcule e mostre a diferença  entre o maior e o menor.
				 
		
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
		
		System.out.println("Digite o quarto número: ");
		int num4 = scan.nextInt();
		scan.nextLine();
		
		int maiorNum = num1; 
		
		if (num2 > maiorNum) {
			maiorNum = num2;
		}if (num3 > maiorNum) {
			maiorNum = num3;
		}if (num4 > maiorNum) {
			maiorNum = num4;
		}
		
		int menorNum = num1;
		
		if(num2 < menorNum  ) {
			menorNum = num2; 
		}if(num3 < menorNum) {
			menorNum = num3;
		}if(num4 < menorNum) {
			menorNum = num4;
		}
		
		int dif = maiorNum - menorNum; 
		
		System.out.printf("O maior número é: %d.%n e o menor número é: %d.%n A diferença entre eles é: %d", maiorNum, menorNum, dif);
		
	}

}
