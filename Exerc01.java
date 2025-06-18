package exercicio_introducao;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		/* 
		 * Este código solicita o nome do usuário via console
		 * e exibe uma mensagem de boas-vindas.
		 */		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = scan.nextLine();
		System.out.println("Olá " + nome + " seja bem vindo(a).");
		
		
	}

}
