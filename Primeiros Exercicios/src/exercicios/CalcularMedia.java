package exercicios;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		String nome = "";
		float n1 = 0;
		float n2 = 0;
		float n3 = 0;
		float n4 = 0;
		double total = 0;
		double media = 0;
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.println("Calcula a média de matemática");
		System.out.println("");
		System.out.println("Qual é o seu nome? :");
		nome = LerTeclado.nextLine();
		
		System.out.println("Informe a 1 nota: ");
		n1 = LerTeclado.nextFloat();
		
		System.out.println("Informe a 2 nota: ");
		n2 = LerTeclado.nextFloat();
		
		System.out.println("Informe a 3 nota: ");
		n3 = LerTeclado.nextFloat();
		
		System.out.println("Informe a 4 nota: ");
		n4 = LerTeclado.nextFloat();
		
		total = n1 + n2 + n3 + n4;
		media = total / 4;
		
		System.out.println(nome + " a sua média é: " + media);

	}

}
