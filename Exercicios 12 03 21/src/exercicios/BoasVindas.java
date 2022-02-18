package exercicios;

import java.util.Scanner;

public class BoasVindas {

	public static void main(String[] args) {
		
		String nome = "";
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.println("-- Programa de boas vindas --");
		System.out.println("Qual é o seu nome? : ");
		nome = LerTeclado.nextLine();
		System.out.println("Olá " + nome);

	}

}
